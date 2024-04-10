// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public MobileOnlineTimeResponseBodyResultObject resultObject;

    public static MobileOnlineTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineTimeResponseBody self = new MobileOnlineTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileOnlineTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MobileOnlineTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MobileOnlineTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileOnlineTimeResponseBody setResultObject(MobileOnlineTimeResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public MobileOnlineTimeResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class MobileOnlineTimeResponseBodyResultObject extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("TimeCode")
        public String timeCode;

        public static MobileOnlineTimeResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            MobileOnlineTimeResponseBodyResultObject self = new MobileOnlineTimeResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public MobileOnlineTimeResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public MobileOnlineTimeResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public MobileOnlineTimeResponseBodyResultObject setTimeCode(String timeCode) {
            this.timeCode = timeCode;
            return this;
        }
        public String getTimeCode() {
            return this.timeCode;
        }

    }

}
