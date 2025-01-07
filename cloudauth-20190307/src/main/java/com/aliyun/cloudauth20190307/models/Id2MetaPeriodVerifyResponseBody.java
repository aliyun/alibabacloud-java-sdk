// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyResponseBody extends TeaModel {
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Id2MetaPeriodVerifyResponseBodyResultObject resultObject;

    public static Id2MetaPeriodVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyResponseBody self = new Id2MetaPeriodVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaPeriodVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaPeriodVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaPeriodVerifyResponseBody setResultObject(Id2MetaPeriodVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id2MetaPeriodVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id2MetaPeriodVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        public static Id2MetaPeriodVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaPeriodVerifyResponseBodyResultObject self = new Id2MetaPeriodVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id2MetaPeriodVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

    }

}
