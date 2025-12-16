// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAuthVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAuthVerifyResponseBodyResult result;

    public static DescribeAuthVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthVerifyResponseBody self = new DescribeAuthVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAuthVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAuthVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthVerifyResponseBody setResult(DescribeAuthVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAuthVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAuthVerifyResponseBodyResult extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <strong>example:</strong>
         * <p>spoofRiskResult：Y
         * spoofType：SCREEN_REMARK</p>
         */
        @NameInMap("SpoofBackInfo")
        public String spoofBackInfo;

        /**
         * <strong>example:</strong>
         * <p>spoofRiskResult：Y
         * spoofType：SCREEN_REMARK</p>
         */
        @NameInMap("SpoofInfo")
        public String spoofInfo;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static DescribeAuthVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthVerifyResponseBodyResult self = new DescribeAuthVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAuthVerifyResponseBodyResult setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSpoofBackInfo(String spoofBackInfo) {
            this.spoofBackInfo = spoofBackInfo;
            return this;
        }
        public String getSpoofBackInfo() {
            return this.spoofBackInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSpoofInfo(String spoofInfo) {
            this.spoofInfo = spoofInfo;
            return this;
        }
        public String getSpoofInfo() {
            return this.spoofInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
