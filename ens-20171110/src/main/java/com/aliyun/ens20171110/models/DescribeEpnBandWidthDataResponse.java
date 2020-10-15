// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeEpnBandWidthDataResponseMonitorData monitorData;

    public static DescribeEpnBandWidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandWidthDataResponse self = new DescribeEpnBandWidthDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandWidthDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnBandWidthDataResponse setMonitorData(DescribeEpnBandWidthDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeEpnBandWidthDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData extends TeaModel {
        @NameInMap("UpBandWidth")
        @Validation(required = true)
        public Long upBandWidth;

        @NameInMap("DownBandWidth")
        @Validation(required = true)
        public Long downBandWidth;

        @NameInMap("InternetTX")
        @Validation(required = true)
        public Long internetTX;

        @NameInMap("InternetRX")
        @Validation(required = true)
        public Long internetRX;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData self = new DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData setUpBandWidth(Long upBandWidth) {
            this.upBandWidth = upBandWidth;
            return this;
        }
        public Long getUpBandWidth() {
            return this.upBandWidth;
        }

        public DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData setDownBandWidth(Long downBandWidth) {
            this.downBandWidth = downBandWidth;
            return this;
        }
        public Long getDownBandWidth() {
            return this.downBandWidth;
        }

        public DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData setInternetTX(Long internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Long getInternetTX() {
            return this.internetTX;
        }

        public DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData setInternetRX(Long internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Long getInternetRX() {
            return this.internetRX;
        }

        public DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeEpnBandWidthDataResponseMonitorData extends TeaModel {
        @NameInMap("MaxDownBandWidth")
        @Validation(required = true)
        public Long maxDownBandWidth;

        @NameInMap("MaxUpBandWidth")
        @Validation(required = true)
        public Long maxUpBandWidth;

        @NameInMap("BandWidthMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        public static DescribeEpnBandWidthDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnBandWidthDataResponseMonitorData self = new DescribeEpnBandWidthDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnBandWidthDataResponseMonitorData setMaxDownBandWidth(Long maxDownBandWidth) {
            this.maxDownBandWidth = maxDownBandWidth;
            return this;
        }
        public Long getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        public DescribeEpnBandWidthDataResponseMonitorData setMaxUpBandWidth(Long maxUpBandWidth) {
            this.maxUpBandWidth = maxUpBandWidth;
            return this;
        }
        public Long getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

        public DescribeEpnBandWidthDataResponseMonitorData setBandWidthMonitorData(java.util.List<DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData> bandWidthMonitorData) {
            this.bandWidthMonitorData = bandWidthMonitorData;
            return this;
        }
        public java.util.List<DescribeEpnBandWidthDataResponseMonitorDataBandWidthMonitorData> getBandWidthMonitorData() {
            return this.bandWidthMonitorData;
        }

    }

}
