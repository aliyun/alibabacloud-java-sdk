// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class DeviceRegisterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DeviceRegisterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>52548360-B3AA-55EA-893F-48C16470F64A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeviceRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeviceRegisterResponseBody self = new DeviceRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeviceRegisterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeviceRegisterResponseBody setData(DeviceRegisterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeviceRegisterResponseBodyData getData() {
        return this.data;
    }

    public DeviceRegisterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeviceRegisterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeviceRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeviceRegisterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeviceRegisterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>991fa52b7935aaa33536e05d4f4b5003</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>e2e928e8244f45ab30ec6ba9f9</p>
         */
        @NameInMap("nonce")
        public String nonce;

        /**
         * <strong>example:</strong>
         * <p>el3SzmCU2p0x4RBc</p>
         */
        @NameInMap("productKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>1748312544852</p>
         */
        @NameInMap("responseTime")
        public String responseTime;

        /**
         * <strong>example:</strong>
         * <p>s8wPO/w79jP7sz6OaHkixAje2GmgzmZiCuCZZ+J8w77ICTyqD30lL6rUhnXwwx4MyGF62DRPFnpXtJ6c5mlmt6QdML3FkjGn+i/wR5T6QMkVDW6YRPWsx3jkIWRQ2sDnmVNBtixo2s9w3RJrnddRzVCaR/WeLOfiVLWcrLcJditzO/1YXBZ9vuRKQ4iperfhZvw372N/m8/1qtjJl+FUe2+wxK6RMxr03K7R</p>
         */
        @NameInMap("signature")
        public String signature;

        public static DeviceRegisterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeviceRegisterResponseBodyData self = new DeviceRegisterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeviceRegisterResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DeviceRegisterResponseBodyData setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DeviceRegisterResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public DeviceRegisterResponseBodyData setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

        public DeviceRegisterResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
