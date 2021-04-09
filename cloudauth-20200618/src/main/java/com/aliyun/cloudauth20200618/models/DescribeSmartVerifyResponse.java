// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmartVerifyResponse extends TeaModel {
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
    public DescribeSmartVerifyResponseResultObject resultObject;

    public static DescribeSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartVerifyResponse self = new DescribeSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSmartVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSmartVerifyResponse setResultObject(DescribeSmartVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSmartVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSmartVerifyResponseResultObject extends TeaModel {
        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        @NameInMap("MaterialInfo")
        @Validation(required = true)
        public String materialInfo;

        @NameInMap("PassedScore")
        @Validation(required = true)
        public Float passedScore;

        public static DescribeSmartVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartVerifyResponseResultObject self = new DescribeSmartVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSmartVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DescribeSmartVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DescribeSmartVerifyResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeSmartVerifyResponseResultObject setPassedScore(Float passedScore) {
            this.passedScore = passedScore;
            return this;
        }
        public Float getPassedScore() {
            return this.passedScore;
        }

    }

}
