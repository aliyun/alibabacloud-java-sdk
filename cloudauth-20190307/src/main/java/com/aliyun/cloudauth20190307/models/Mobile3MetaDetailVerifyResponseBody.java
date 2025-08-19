// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code, <strong>200</strong> indicates a successful API response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public Mobile3MetaDetailVerifyResponseBodyResultObject resultObject;

    public static Mobile3MetaDetailVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailVerifyResponseBody self = new Mobile3MetaDetailVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaDetailVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaDetailVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaDetailVerifyResponseBody setResultObject(Mobile3MetaDetailVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile3MetaDetailVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile3MetaDetailVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code:</p>
         * <ul>
         * <li><strong>1</strong>: Verification consistent.</li>
         * <li><strong>2</strong>: Verification inconsistent.</li>
         * <li><strong>3</strong>: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Operator name:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile.</li>
         * <li><strong>CUCC</strong>: China Unicom.</li>
         * <li><strong>CTCC</strong>: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Detailed verification results:</p>
         * <ul>
         * <li><strong>101</strong>: Verification passed.</li>
         * <li><strong>201</strong>: Mobile number and name do not match, mobile number and ID number do not match.</li>
         * <li><strong>202</strong>: Mobile number and name match, but mobile number and ID number do not match.</li>
         * <li><strong>203</strong>: Mobile number and ID number match, but mobile number and name do not match.</li>
         * <li><strong>204</strong>: Other inconsistencies.</li>
         * <li><strong>301</strong>: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static Mobile3MetaDetailVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaDetailVerifyResponseBodyResultObject self = new Mobile3MetaDetailVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
