// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public MobileOnlineStatusResponseBodyResultObject resultObject;

    public static MobileOnlineStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineStatusResponseBody self = new MobileOnlineStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileOnlineStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MobileOnlineStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MobileOnlineStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileOnlineStatusResponseBody setResultObject(MobileOnlineStatusResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public MobileOnlineStatusResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class MobileOnlineStatusResponseBodyResultObject extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("SubCode")
        public String subCode;

        public static MobileOnlineStatusResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            MobileOnlineStatusResponseBodyResultObject self = new MobileOnlineStatusResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public MobileOnlineStatusResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public MobileOnlineStatusResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public MobileOnlineStatusResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
