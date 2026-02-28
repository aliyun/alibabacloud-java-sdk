// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisSearchDeviceTraceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GisSearchDeviceTraceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GisSearchDeviceTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GisSearchDeviceTraceResponseBody self = new GisSearchDeviceTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GisSearchDeviceTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GisSearchDeviceTraceResponseBody setData(GisSearchDeviceTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GisSearchDeviceTraceResponseBodyData getData() {
        return this.data;
    }

    public GisSearchDeviceTraceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GisSearchDeviceTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GisSearchDeviceTraceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GisSearchDeviceTraceResponseBodyDataPoints extends TeaModel {
        @NameInMap("LocateTime")
        public Long locateTime;

        @NameInMap("Location")
        public String location;

        public static GisSearchDeviceTraceResponseBodyDataPoints build(java.util.Map<String, ?> map) throws Exception {
            GisSearchDeviceTraceResponseBodyDataPoints self = new GisSearchDeviceTraceResponseBodyDataPoints();
            return TeaModel.build(map, self);
        }

        public GisSearchDeviceTraceResponseBodyDataPoints setLocateTime(Long locateTime) {
            this.locateTime = locateTime;
            return this;
        }
        public Long getLocateTime() {
            return this.locateTime;
        }

        public GisSearchDeviceTraceResponseBodyDataPoints setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GisSearchDeviceTraceResponseBodyData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Points")
        public java.util.List<GisSearchDeviceTraceResponseBodyDataPoints> points;

        @NameInMap("ProductKey")
        public String productKey;

        public static GisSearchDeviceTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GisSearchDeviceTraceResponseBodyData self = new GisSearchDeviceTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GisSearchDeviceTraceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GisSearchDeviceTraceResponseBodyData setPoints(java.util.List<GisSearchDeviceTraceResponseBodyDataPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<GisSearchDeviceTraceResponseBodyDataPoints> getPoints() {
            return this.points;
        }

        public GisSearchDeviceTraceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
