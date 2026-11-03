// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileRecycledMetaVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.
     * Important</p>
     * <ul>
     * <li>This parameter indicates whether the API operation was called successfully. For detailed return code descriptions, see Error codes.</li>
     * <li>To view the business verification result, check the fields in ResultObject.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
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

    /**
     * <p>The returned result.</p>
     */
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
         * <p>The query result. Valid values:</p>
         * <ul>
         * <li>1: A query result is returned.</li>
         * <li>3: No query result is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The ISP name. Valid values: China Mobile - CMCC, China Unicom - CUCC, and China Telecom - CTCC.</p>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The detailed verification result. Valid values:</p>
         * <ul>
         * <li>101: The registration time is later than or equal to the activation time of the mobile phone number.</li>
         * <li>102: The registration time is earlier than the activation time of the mobile phone number.</li>
         * <li>103: The newly activated user is not synchronized.</li>
         * <li>301: Data exception or disconnected user.</li>
         * </ul>
         * 
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

        public MobileRecycledMetaVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
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
