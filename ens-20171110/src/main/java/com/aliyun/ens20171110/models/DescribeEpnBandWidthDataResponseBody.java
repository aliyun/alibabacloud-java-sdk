// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data of the instance.</p>
     */
    @NameInMap("MonitorData")
    public DescribeEpnBandWidthDataResponseBodyMonitorData monitorData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D289DAA-F6DA-5FC4-AE47-F5C8B6277BFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEpnBandWidthDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandWidthDataResponseBody self = new DescribeEpnBandWidthDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandWidthDataResponseBody setMonitorData(DescribeEpnBandWidthDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeEpnBandWidthDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeEpnBandWidthDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData extends TeaModel {
        /**
         * <p>The outbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownBandWidth")
        public Long downBandWidth;

        /**
         * <p>The Internet traffic to the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternetRX")
        public Long internetRX;

        /**
         * <p>The Internet traffic from the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternetTX")
        public Long internetTX;

        /**
         * <p>The timestamp when the monitoring data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-12T05:45:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The inbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UpBandWidth")
        public Long upBandWidth;

        public static DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData self = new DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setDownBandWidth(Long downBandWidth) {
            this.downBandWidth = downBandWidth;
            return this;
        }
        public Long getDownBandWidth() {
            return this.downBandWidth;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setInternetRX(Long internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Long getInternetRX() {
            return this.internetRX;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setInternetTX(Long internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Long getInternetTX() {
            return this.internetTX;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setUpBandWidth(Long upBandWidth) {
            this.upBandWidth = upBandWidth;
            return this;
        }
        public Long getUpBandWidth() {
            return this.upBandWidth;
        }

    }

    public static class DescribeEpnBandWidthDataResponseBodyMonitorData extends TeaModel {
        /**
         * <p>The bandwidth data.</p>
         */
        @NameInMap("BandWidthMonitorData")
        public java.util.List<DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        /**
         * <p>The maximum outbound bandwidth within the queried time range. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>16817468</p>
         */
        @NameInMap("MaxDownBandWidth")
        public Long maxDownBandWidth;

        /**
         * <p>The maximum inbound bandwidth within the queried time range. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>231008</p>
         */
        @NameInMap("MaxUpBandWidth")
        public Long maxUpBandWidth;

        public static DescribeEpnBandWidthDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnBandWidthDataResponseBodyMonitorData self = new DescribeEpnBandWidthDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorData setBandWidthMonitorData(java.util.List<DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData) {
            this.bandWidthMonitorData = bandWidthMonitorData;
            return this;
        }
        public java.util.List<DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> getBandWidthMonitorData() {
            return this.bandWidthMonitorData;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorData setMaxDownBandWidth(Long maxDownBandWidth) {
            this.maxDownBandWidth = maxDownBandWidth;
            return this;
        }
        public Long getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        public DescribeEpnBandWidthDataResponseBodyMonitorData setMaxUpBandWidth(Long maxUpBandWidth) {
            this.maxUpBandWidth = maxUpBandWidth;
            return this;
        }
        public Long getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

    }

}
