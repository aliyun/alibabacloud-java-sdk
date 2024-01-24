// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmartVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeSmartVerifyResponseBodyResultObject resultObject;

    public static DescribeSmartVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartVerifyResponseBody self = new DescribeSmartVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSmartVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSmartVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartVerifyResponseBody setResultObject(DescribeSmartVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSmartVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSmartVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("PassedScore")
        public Float passedScore;

        @NameInMap("SubCode")
        public String subCode;

        public static DescribeSmartVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartVerifyResponseBodyResultObject self = new DescribeSmartVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSmartVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeSmartVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DescribeSmartVerifyResponseBodyResultObject setPassedScore(Float passedScore) {
            this.passedScore = passedScore;
            return this;
        }
        public Float getPassedScore() {
            return this.passedScore;
        }

        public DescribeSmartVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
