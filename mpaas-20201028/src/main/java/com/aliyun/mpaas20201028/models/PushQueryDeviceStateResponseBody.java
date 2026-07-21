// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushQueryDeviceStateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PushQueryDeviceStateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PushQueryDeviceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushQueryDeviceStateResponseBody self = new PushQueryDeviceStateResponseBody();
        return TeaModel.build(map, self);
    }

    public PushQueryDeviceStateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public PushQueryDeviceStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushQueryDeviceStateResponseBody setData(PushQueryDeviceStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PushQueryDeviceStateResponseBodyData getData() {
        return this.data;
    }

    public PushQueryDeviceStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushQueryDeviceStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushQueryDeviceStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PushQueryDeviceStateResponseBodyData extends TeaModel {
        @NameInMap("DeliveryToken")
        public String deliveryToken;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Statue")
        public String statue;

        @NameInMap("ThirdToken")
        public String thirdToken;

        @NameInMap("UserId")
        public String userId;

        public static PushQueryDeviceStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PushQueryDeviceStateResponseBodyData self = new PushQueryDeviceStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PushQueryDeviceStateResponseBodyData setDeliveryToken(String deliveryToken) {
            this.deliveryToken = deliveryToken;
            return this;
        }
        public String getDeliveryToken() {
            return this.deliveryToken;
        }

        public PushQueryDeviceStateResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public PushQueryDeviceStateResponseBodyData setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public PushQueryDeviceStateResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public PushQueryDeviceStateResponseBodyData setStatue(String statue) {
            this.statue = statue;
            return this;
        }
        public String getStatue() {
            return this.statue;
        }

        public PushQueryDeviceStateResponseBodyData setThirdToken(String thirdToken) {
            this.thirdToken = thirdToken;
            return this;
        }
        public String getThirdToken() {
            return this.thirdToken;
        }

        public PushQueryDeviceStateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
