// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailStandardVerifyResponseBody extends TeaModel {
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
    public Mobile3MetaDetailStandardVerifyResponseBodyResultObject resultObject;

    public static Mobile3MetaDetailStandardVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailStandardVerifyResponseBody self = new Mobile3MetaDetailStandardVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailStandardVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaDetailStandardVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaDetailStandardVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaDetailStandardVerifyResponseBody setResultObject(Mobile3MetaDetailStandardVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile3MetaDetailStandardVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile3MetaDetailStandardVerifyResponseBodyResultObject extends TeaModel {
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

        public static Mobile3MetaDetailStandardVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaDetailStandardVerifyResponseBodyResultObject self = new Mobile3MetaDetailStandardVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaDetailStandardVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaDetailStandardVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public Mobile3MetaDetailStandardVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
