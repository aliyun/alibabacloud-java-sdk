// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaStandardVerifyResponseBody extends TeaModel {
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
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public Id2MetaStandardVerifyResponseBodyResultObject resultObject;

    public static Id2MetaStandardVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaStandardVerifyResponseBody self = new Id2MetaStandardVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaStandardVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaStandardVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaStandardVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaStandardVerifyResponseBody setResultObject(Id2MetaStandardVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id2MetaStandardVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id2MetaStandardVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code:</p>
         * <ul>
         * <li><strong>1</strong>: verification matches.</li>
         * <li><strong>2</strong>: verification does not match.</li>
         * <li><strong>3</strong>: no record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        public static Id2MetaStandardVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaStandardVerifyResponseBodyResultObject self = new Id2MetaStandardVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id2MetaStandardVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

    }

}
