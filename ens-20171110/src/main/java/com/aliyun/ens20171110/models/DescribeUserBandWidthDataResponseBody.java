// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("MonitorData")
    public DescribeUserBandWidthDataResponseBodyMonitorData monitorData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserBandWidthDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBandWidthDataResponseBody self = new DescribeUserBandWidthDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBandWidthDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUserBandWidthDataResponseBody setMonitorData(DescribeUserBandWidthDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeUserBandWidthDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeUserBandWidthDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData extends TeaModel {
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

        public static DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData self = new DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setDownBandWidth(Long downBandWidth) {
            this.downBandWidth = downBandWidth;
            return this;
        }
        public Long getDownBandWidth() {
            return this.downBandWidth;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setInternetRX(Long internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Long getInternetRX() {
            return this.internetRX;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setInternetTX(Long internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Long getInternetTX() {
            return this.internetTX;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData setUpBandWidth(Long upBandWidth) {
            this.upBandWidth = upBandWidth;
            return this;
        }
        public Long getUpBandWidth() {
            return this.upBandWidth;
        }

    }

    public static class DescribeUserBandWidthDataResponseBodyMonitorData extends TeaModel {
        /**
         * <p>The bandwidth data.</p>
         */
        @NameInMap("BandWidthMonitorData")
        public java.util.List<DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        /**
         * <p>The maximum outbound bandwidth within the queried time range. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>16817468</p>
         */
        @NameInMap("MaxDownBandWidth")
        public String maxDownBandWidth;

        /**
         * <p>The maximum inbound bandwidth within the queried time range. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>231008</p>
         */
        @NameInMap("MaxUpBandWidth")
        public String maxUpBandWidth;

        public static DescribeUserBandWidthDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBandWidthDataResponseBodyMonitorData self = new DescribeUserBandWidthDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBandWidthDataResponseBodyMonitorData setBandWidthMonitorData(java.util.List<DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData) {
            this.bandWidthMonitorData = bandWidthMonitorData;
            return this;
        }
        public java.util.List<DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> getBandWidthMonitorData() {
            return this.bandWidthMonitorData;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorData setMaxDownBandWidth(String maxDownBandWidth) {
            this.maxDownBandWidth = maxDownBandWidth;
            return this;
        }
        public String getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        public DescribeUserBandWidthDataResponseBodyMonitorData setMaxUpBandWidth(String maxUpBandWidth) {
            this.maxUpBandWidth = maxUpBandWidth;
            return this;
        }
        public String getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

    }

}
