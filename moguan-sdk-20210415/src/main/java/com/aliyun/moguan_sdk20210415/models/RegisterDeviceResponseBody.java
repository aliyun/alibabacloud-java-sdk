// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.moguan_sdk20210415.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RegisterDeviceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A68E0F1E-9CEE-4BB9-8880-943730FFD9A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponseBody self = new RegisterDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponseBody setData(RegisterDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterDeviceResponseBodyData getData() {
        return this.data;
    }

    public RegisterDeviceResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public RegisterDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterDeviceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rSDUqJEawcrhaHVDXgQQ2vV3eOQDzuos5TAJgx9uolqVaAKkgcBHfWd/jYknsiVeYxsLWyscP0U6ia0XL/u6t7ira9XnI3Jv9qHzosrAW09YrT68VigxqwrutxtexXGgrXFzYmcMMe05rYhEmyyoeNu0CB40HxggXIIw10vH0pvhMLd0ssz6FbaOGhZ/7WDzFAqeXlz7+whZFNlXwaCfIwHTDIj9nBHHsBzWWocOHO==</p>
         */
        @NameInMap("License")
        public String license;

        /**
         * <strong>example:</strong>
         * <p>SSTfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwdTbYqDHxAlmdSFowPthsG3wKyXdembceyc5j31FZIYGESE4x6ND0al5ejdx26d2ZMRDzlkjnLqUN3snezRA1x0qs92taGXMrIvYDi0dEsz3X/a/VXHPxNu0+/PBT9RYzakLDV9F/6QdYn4PQUvHSTfz2ghaS5SCj++VVDe4CBBIDAAPB</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <strong>example:</strong>
         * <p>1082f5e57a004a0799198d4a370c3efa</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <strong>example:</strong>
         * <p>VnxhWhjL2D3kkGcv8Q/wHzyD6dTEYIDfnIgzDWLS7iQRiCWLu1K+EA+Q6iiH1lpaDNGeQ65zVpbB1wtGMmJymQMJeJ5RHzEo74wwXP48Yfn6tdAoZwtLkxXqZo5N99W/JyEyHyeisC44ZIpLcs1YPv3Wr+uRirUgjHhZXorxJ1E=</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static RegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceResponseBodyData self = new RegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceResponseBodyData setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public RegisterDeviceResponseBodyData setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public RegisterDeviceResponseBodyData setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public RegisterDeviceResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
