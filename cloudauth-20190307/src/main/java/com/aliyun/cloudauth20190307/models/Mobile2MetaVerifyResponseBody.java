// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
     */
    @NameInMap("ResultObject")
    public Mobile2MetaVerifyResponseBodyResultObject resultObject;

    public static Mobile2MetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyResponseBody self = new Mobile2MetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile2MetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile2MetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile2MetaVerifyResponseBody setResultObject(Mobile2MetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile2MetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile2MetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result:</p>
         * <ul>
         * <li>1: Consistent verification</li>
         * <li>2: Inconsistent verification</li>
         * <li>3: No record found</li>
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
         * <li>CMCC: China Mobile</li>
         * <li>CUCC: China Unicom</li>
         * <li>CTCC: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static Mobile2MetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile2MetaVerifyResponseBodyResultObject self = new Mobile2MetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile2MetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile2MetaVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
