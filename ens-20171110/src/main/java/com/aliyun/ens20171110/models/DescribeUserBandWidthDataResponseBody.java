// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("MonitorData")
    public DescribeUserBandWidthDataResponseBodyMonitorData monitorData;

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
        @NameInMap("BandWidthMonitorData")
        public java.util.List<DescribeUserBandWidthDataResponseBodyMonitorDataBandWidthMonitorData> bandWidthMonitorData;

        @NameInMap("MaxDownBandWidth")
        public String maxDownBandWidth;

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
