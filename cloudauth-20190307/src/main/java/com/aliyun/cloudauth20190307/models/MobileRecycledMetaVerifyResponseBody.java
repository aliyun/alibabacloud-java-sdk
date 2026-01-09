// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileRecycledMetaVerifyResponseBody extends TeaModel {
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
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public MobileRecycledMetaVerifyResponseBodyResultObject resultObject;

    public static MobileRecycledMetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileRecycledMetaVerifyResponseBody self = new MobileRecycledMetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileRecycledMetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MobileRecycledMetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MobileRecycledMetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileRecycledMetaVerifyResponseBody setResultObject(MobileRecycledMetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public MobileRecycledMetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class MobileRecycledMetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static MobileRecycledMetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            MobileRecycledMetaVerifyResponseBodyResultObject self = new MobileRecycledMetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public MobileRecycledMetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public MobileRecycledMetaVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
