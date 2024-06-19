// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusResponseBody extends TeaModel {
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
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
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
