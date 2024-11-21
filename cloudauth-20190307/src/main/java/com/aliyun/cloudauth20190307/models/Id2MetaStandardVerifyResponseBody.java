// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaStandardVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
