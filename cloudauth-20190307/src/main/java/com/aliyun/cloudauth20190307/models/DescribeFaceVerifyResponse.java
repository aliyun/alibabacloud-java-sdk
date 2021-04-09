// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public DescribeFaceVerifyResponseResultObject resultObject;

    public static DescribeFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyResponse self = new DescribeFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFaceVerifyResponse setResultObject(DescribeFaceVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeFaceVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeFaceVerifyResponseResultObject extends TeaModel {
        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("IdentityInfo")
        @Validation(required = true)
        public String identityInfo;

        @NameInMap("MaterialInfo")
        @Validation(required = true)
        public String materialInfo;

        @NameInMap("DeviceToken")
        @Validation(required = true)
        public String deviceToken;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        public static DescribeFaceVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceVerifyResponseResultObject self = new DescribeFaceVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFaceVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DescribeFaceVerifyResponseResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public DescribeFaceVerifyResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeFaceVerifyResponseResultObject setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

        public DescribeFaceVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
