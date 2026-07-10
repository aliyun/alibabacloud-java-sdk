// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
     * <p>The result information.</p>
     */
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
        /**
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li>1: Consistent.</li>
         * <li>2: Inconsistent.</li>
         * <li>3: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The name of the telecommunications service provider. Valid values:</p>
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
         * <p>The network duration code. Valid values:</p>
         * <ul>
         * <li>1: [0,3) indicates a network duration of 0 to 3 months.</li>
         * <li>2: [3,6) indicates a network duration of 3 to 6 months.</li>
         * <li>3: [6,12) indicates a network duration of 6 to 12 months.</li>
         * <li>4: [12,24) indicates a network duration of 12 to 24 months.</li>
         * <li>5: [24,+) indicates a network duration of more than 24 months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
