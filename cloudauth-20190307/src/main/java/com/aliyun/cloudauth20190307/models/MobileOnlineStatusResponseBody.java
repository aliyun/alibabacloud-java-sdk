// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result information.</p>
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
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>1: Available on the network. </li>
         * <li>2: Unavailable on the network. For more information, see subCode.</li>
         * <li>3: No query result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The name of the Internet service provider (ISP). Valid values:</p>
         * <ul>
         * <li>CMCC: China Mobile. </li>
         * <li>CUCC: China Unicom. </li>
         * <li>CTCC: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The verification details. Valid values:</p>
         * <ul>
         * <li>101: Available on the network. </li>
         * <li>201: Suspended. </li>
         * <li>202: Canceled. </li>
         * <li>203: On the network but unavailable. </li>
         * <li>204: Not on the network. </li>
         * <li>301: No record found.</li>
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
