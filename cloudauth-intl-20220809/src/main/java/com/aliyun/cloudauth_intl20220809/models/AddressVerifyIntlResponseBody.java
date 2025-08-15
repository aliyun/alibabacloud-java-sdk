// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public AddressVerifyIntlResponseBodyResultObject resultObject;

    public static AddressVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyIntlResponseBody self = new AddressVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddressVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddressVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddressVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddressVerifyIntlResponseBody setResultObject(AddressVerifyIntlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public AddressVerifyIntlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class AddressVerifyIntlResponseBodyResultObject extends TeaModel {
        /**
         * <p>Address verification details.</p>
         * 
         * <strong>example:</strong>
         * <p>0-3000</p>
         */
        @NameInMap("AddressInfo")
        public String addressInfo;

        /**
         * <p>Operator name:</p>
         * <ul>
         * <li>CMCC: China Mobile</li>
         * <li>CTCC: China Telecom</li>
         * <li>CUCC: China Unicom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Verification result, values:</p>
         * <ul>
         * <li>Y: Yes, the verified address distance is less than or equal to 10KM.</li>
         * <li>N: No, the verified address distance is greater than 10KM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Authentication result description.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Unique identifier for the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>hksb7ba1b28130d24e015d69********</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static AddressVerifyIntlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            AddressVerifyIntlResponseBodyResultObject self = new AddressVerifyIntlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public AddressVerifyIntlResponseBodyResultObject setAddressInfo(String addressInfo) {
            this.addressInfo = addressInfo;
            return this;
        }
        public String getAddressInfo() {
            return this.addressInfo;
        }

        public AddressVerifyIntlResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public AddressVerifyIntlResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public AddressVerifyIntlResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public AddressVerifyIntlResponseBodyResultObject setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
