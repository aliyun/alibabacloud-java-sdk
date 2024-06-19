// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeFaceVerifyResponseBodyResultObject resultObject;

    public static DescribeFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyResponseBody self = new DescribeFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceVerifyResponseBody setResultObject(DescribeFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("DeviceRisk")
        public String deviceRisk;

        /**
         * <strong>example:</strong>
         * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
         */
        @NameInMap("DeviceToken")
        public String deviceToken;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("IdentityInfo")
        public String identityInfo;

        /**
         * <strong>example:</strong>
         * <p>{&quot;faceAttack&quot;: &quot;F&quot;,&quot;facialPictureFront&quot;: {&quot;qualityScore&quot;: 88.3615493774414,&quot;pictureUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg%22,%22ossBucketName">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg&quot;,&quot;ossBucketName</a>&quot;: &quot;cn-shanghai-aliyun-cloudauth-1260051251634779&quot;,&quot;ossObjectName&quot;: &quot;verify/1260051251634779/6ba7bcfccf33f56cdb44ed086f36ce3e0.jpeg&quot;}}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("Success")
        public String success;

        @NameInMap("UserInfo")
        public String userInfo;

        public static DescribeFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceVerifyResponseBodyResultObject self = new DescribeFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFaceVerifyResponseBodyResultObject setDeviceRisk(String deviceRisk) {
            this.deviceRisk = deviceRisk;
            return this;
        }
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        public DescribeFaceVerifyResponseBodyResultObject setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

        public DescribeFaceVerifyResponseBodyResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public DescribeFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DescribeFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DescribeFaceVerifyResponseBodyResultObject setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public DescribeFaceVerifyResponseBodyResultObject setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

}
