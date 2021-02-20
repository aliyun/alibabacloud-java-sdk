// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    public DescribeEpnBandWidthDataResponseBodyMonitorData monitorData;

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
        @NameInMap("DownBandWidth")
        public Long downBandWidth;

        @NameInMap("InternetRX")
        public Long internetRX;

        @NameInMap("InternetTX")
        public Long internetTX;

        @NameInMap("TimeStamp")
        public String timeStamp;

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
        @NameInMap("BandWidthMonitorData")
        public java.util.List<DescribeEpnBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        @NameInMap("MaxDownBandWidth")
        public Long maxDownBandWidth;

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
