// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Mobile3MetaSimpleVerifyResponseBodyResultObject resultObject;

    public static Mobile3MetaSimpleVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleVerifyResponseBody self = new Mobile3MetaSimpleVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaSimpleVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaSimpleVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaSimpleVerifyResponseBody setResultObject(Mobile3MetaSimpleVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile3MetaSimpleVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile3MetaSimpleVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("IspName")
        public String ispName;

        public static Mobile3MetaSimpleVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaSimpleVerifyResponseBodyResultObject self = new Mobile3MetaSimpleVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaSimpleVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaSimpleVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
