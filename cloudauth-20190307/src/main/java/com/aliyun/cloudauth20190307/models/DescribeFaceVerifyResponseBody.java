// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public DescribeFaceVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyResponseBody self = new DescribeFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyResponseBody setResultObject(DescribeFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
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

    public DescribeFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("IdentityInfo")
        public String identityInfo;

        @NameInMap("DeviceToken")
        public String deviceToken;

        @NameInMap("Passed")
        public String passed;

        public static DescribeFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceVerifyResponseBodyResultObject self = new DescribeFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DescribeFaceVerifyResponseBodyResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public DescribeFaceVerifyResponseBodyResultObject setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

        public DescribeFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
