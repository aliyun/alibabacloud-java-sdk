// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileDetectResponseBody extends TeaModel {
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
     * <p>969434DF-926B-4997-9881-4DE94E39F805</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public MobileDetectResponseBodyResultObject resultObject;

    public static MobileDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MobileDetectResponseBody self = new MobileDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public MobileDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MobileDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MobileDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MobileDetectResponseBody setResultObject(MobileDetectResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public MobileDetectResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class MobileDetectResponseBodyResultObjectItems extends TeaModel {
        /**
         * <p>Phone number\&quot;s area (only for plaintext phone numbers)</p>
         * 
         * <strong>example:</strong>
         * <p>安徽-马**</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>Verification result</p>
         * <ul>
         * <li>1: Available online </li>
         * <li>2: Not available online</li>
         * <li>3: No query result</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Operator name</p>
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
         * <p>Phone number</p>
         * 
         * <strong>example:</strong>
         * <p>131********</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Verification details</p>
         * <ul>
         * <li>101: Available number</li>
         * <li>102: Empty number</li>
         * <li>103: Suspended </li>
         * <li>104: Silent number (inactive small number, new number, non-smartphone user within the last six months) </li>
         * <li>105: Risky number (long-term shutdown or no voice service activated and prone to complaints)</li>
         * <li>301: No record found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static MobileDetectResponseBodyResultObjectItems build(java.util.Map<String, ?> map) throws Exception {
            MobileDetectResponseBodyResultObjectItems self = new MobileDetectResponseBodyResultObjectItems();
            return TeaModel.build(map, self);
        }

        public MobileDetectResponseBodyResultObjectItems setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public MobileDetectResponseBodyResultObjectItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public MobileDetectResponseBodyResultObjectItems setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public MobileDetectResponseBodyResultObjectItems setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public MobileDetectResponseBodyResultObjectItems setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

    public static class MobileDetectResponseBodyResultObject extends TeaModel {
        /**
         * <p>Billing count, the total billing count in one request</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChargeCount")
        public String chargeCount;

        /**
         * <p>Verification results set</p>
         */
        @NameInMap("Items")
        public java.util.List<MobileDetectResponseBodyResultObjectItems> items;

        public static MobileDetectResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            MobileDetectResponseBodyResultObject self = new MobileDetectResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public MobileDetectResponseBodyResultObject setChargeCount(String chargeCount) {
            this.chargeCount = chargeCount;
            return this;
        }
        public String getChargeCount() {
            return this.chargeCount;
        }

        public MobileDetectResponseBodyResultObject setItems(java.util.List<MobileDetectResponseBodyResultObjectItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<MobileDetectResponseBodyResultObjectItems> getItems() {
            return this.items;
        }

    }

}
