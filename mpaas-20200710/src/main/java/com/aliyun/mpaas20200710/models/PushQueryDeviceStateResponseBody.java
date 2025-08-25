// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class PushQueryDeviceStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PushQueryDeviceStateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PushQueryDeviceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushQueryDeviceStateResponseBody self = new PushQueryDeviceStateResponseBody();
        return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>ad-000f18w8vmqtzhvbopge-854</p>
         */
        @NameInMap("DeliveryToken")
        public String deliveryToken;

        /**
         * <strong>example:</strong>
         * <p>ad-000f18w8vmqtzhvbopge-854</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>miui</p>
         */
        @NameInMap("Manufacturer")
        public String manufacturer;

        /**
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Statue")
        public String statue;

        /**
         * <strong>example:</strong>
         * <p>IQAAAACy0f7tAABYiMwLEENtr0TKYJEsv7wyu4Ubt9XXwTJAlknnCb1LAzB3wJvoZIcT_nJdaMhEoXJaqQrObAGHLGoU1GOexlTcLWzja-0HfGHKBw</p>
         */
        @NameInMap("ThirdToken")
        public String thirdToken;

        /**
         * <strong>example:</strong>
         * <p>push_test</p>
         */
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
