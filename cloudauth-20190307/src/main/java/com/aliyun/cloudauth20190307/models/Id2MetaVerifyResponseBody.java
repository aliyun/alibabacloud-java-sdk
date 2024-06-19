// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyResponseBody extends TeaModel {
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
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Id2MetaVerifyResponseBodyResultObject resultObject;

    public static Id2MetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyResponseBody self = new Id2MetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaVerifyResponseBody setResultObject(Id2MetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id2MetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id2MetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        public static Id2MetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaVerifyResponseBodyResultObject self = new Id2MetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id2MetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

    }

}
