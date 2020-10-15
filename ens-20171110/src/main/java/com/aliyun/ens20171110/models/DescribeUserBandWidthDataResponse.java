// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeUserBandWidthDataResponseMonitorData monitorData;

    public static DescribeUserBandWidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBandWidthDataResponse self = new DescribeUserBandWidthDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBandWidthDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBandWidthDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUserBandWidthDataResponse setMonitorData(DescribeUserBandWidthDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeUserBandWidthDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData extends TeaModel {
        @NameInMap("UpBandWidth")
        @Validation(required = true)
        public Integer upBandWidth;

        @NameInMap("DownBandWidth")
        @Validation(required = true)
        public Integer downBandWidth;

        @NameInMap("InternetTX")
        @Validation(required = true)
        public Integer internetTX;

        @NameInMap("InternetRX")
        @Validation(required = true)
        public Integer internetRX;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData self = new DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData setUpBandWidth(Integer upBandWidth) {
            this.upBandWidth = upBandWidth;
            return this;
        }
        public Integer getUpBandWidth() {
            return this.upBandWidth;
        }

        public DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData setDownBandWidth(Integer downBandWidth) {
            this.downBandWidth = downBandWidth;
            return this;
        }
        public Integer getDownBandWidth() {
            return this.downBandWidth;
        }

        public DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData setInternetTX(Integer internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Integer getInternetTX() {
            return this.internetTX;
        }

        public DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData setInternetRX(Integer internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Integer getInternetRX() {
            return this.internetRX;
        }

        public DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeUserBandWidthDataResponseMonitorData extends TeaModel {
        @NameInMap("MaxDownBandWidth")
        @Validation(required = true)
        public String maxDownBandWidth;

        @NameInMap("MaxUpBandWidth")
        @Validation(required = true)
        public String maxUpBandWidth;

        @NameInMap("BandWidthMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        public static DescribeUserBandWidthDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBandWidthDataResponseMonitorData self = new DescribeUserBandWidthDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBandWidthDataResponseMonitorData setMaxDownBandWidth(String maxDownBandWidth) {
            this.maxDownBandWidth = maxDownBandWidth;
            return this;
        }
        public String getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        public DescribeUserBandWidthDataResponseMonitorData setMaxUpBandWidth(String maxUpBandWidth) {
            this.maxUpBandWidth = maxUpBandWidth;
            return this;
        }
        public String getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

        public DescribeUserBandWidthDataResponseMonitorData setBandWidthMonitorData(java.util.List<DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData> bandWidthMonitorData) {
            this.bandWidthMonitorData = bandWidthMonitorData;
            return this;
        }
        public java.util.List<DescribeUserBandWidthDataResponseMonitorDataBandWidthMonitorData> getBandWidthMonitorData() {
            return this.bandWidthMonitorData;
        }

    }

}
