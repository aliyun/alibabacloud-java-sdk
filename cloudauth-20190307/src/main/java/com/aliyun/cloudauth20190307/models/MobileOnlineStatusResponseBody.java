// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
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
         * <p>Verification result</p>
         * <ul>
         * <li>1: Available online </li>
         * <li>2: Not available online (see subCode for details)</li>
         * <li>3: No query result</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>ISP name</p>
         * <ul>
         * <li>CMCC: China Mobile </li>
         * <li>CUCC: China Unicom </li>
         * <li>CTCC: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Verification details</p>
         * <ul>
         * <li>101: Available online </li>
         * <li>201: Suspended </li>
         * <li>202: Disconnected </li>
         * <li>203: Online but not available </li>
         * <li>204: Not online </li>
         * <li>301: No record found</li>
         * </ul>
         * 
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
