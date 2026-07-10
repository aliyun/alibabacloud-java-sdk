// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. <strong>200</strong> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information.</p>
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
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Consistent.</li>
         * <li><strong>2</strong>: Inconsistent.</li>
         * <li><strong>3</strong>: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The carrier name. Valid values:</p>
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
         * <p>The detailed verification result. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: Verification passed.</li>
         * <li><strong>201</strong>: The phone number is inconsistent with the name, and the phone number is inconsistent with the ID card number.</li>
         * <li><strong>202</strong>: The phone number is consistent with the name, but the phone number is inconsistent with the ID card number.</li>
         * <li><strong>203</strong>: The phone number is consistent with the ID card number, but the phone number is inconsistent with the name.</li>
         * <li><strong>204</strong>: Other inconsistency.</li>
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
