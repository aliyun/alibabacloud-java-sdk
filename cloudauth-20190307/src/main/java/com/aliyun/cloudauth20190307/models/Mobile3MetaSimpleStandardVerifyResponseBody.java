// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleStandardVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure</p>
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
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public Mobile3MetaSimpleStandardVerifyResponseBodyResultObject resultObject;

    public static Mobile3MetaSimpleStandardVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleStandardVerifyResponseBody self = new Mobile3MetaSimpleStandardVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleStandardVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaSimpleStandardVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaSimpleStandardVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaSimpleStandardVerifyResponseBody setResultObject(Mobile3MetaSimpleStandardVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile3MetaSimpleStandardVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile3MetaSimpleStandardVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result:</p>
         * <ul>
         * <li>1: Consistent (billable)</li>
         * <li>2: Inconsistent (billable)</li>
         * <li>3: No record found (non-billable)</li>
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
         * <li><strong>CBCC</strong>: China Broadcasting Network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static Mobile3MetaSimpleStandardVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaSimpleStandardVerifyResponseBodyResultObject self = new Mobile3MetaSimpleStandardVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaSimpleStandardVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaSimpleStandardVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
