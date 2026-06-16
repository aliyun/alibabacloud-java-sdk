// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyV2IntlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The verification result.</p>
     */
    @NameInMap("Result")
    public AddressVerifyV2IntlResponseBodyResult result;

    public static AddressVerifyV2IntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyV2IntlResponseBody self = new AddressVerifyV2IntlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddressVerifyV2IntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddressVerifyV2IntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddressVerifyV2IntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddressVerifyV2IntlResponseBody setResult(AddressVerifyV2IntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddressVerifyV2IntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddressVerifyV2IntlResponseBodyResult extends TeaModel {
        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>1: Passed.</li>
         * <li>2: Failed (the device is in a prohibited region). </li>
         * <li>3: Unable to determine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The verification details, which include:</p>
         * <ul>
         * <li>distanceRange: the location range.   </li>
         * <li>ispName: the ISP name.     </li>
         * <li>phoneStatus: the phone status. A value of 0 indicates abnormal. A value of 1 indicates Normal. Otherwise, the status is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;distanceRange&quot;: &quot;0-3000&quot;,
         *   &quot;ispName&quot;: &quot;CTCC&quot;,
         *   &quot;phoneStatus&quot;: &quot;1&quot;
         * }</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The authentication ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hksb7ba1b28130d24e015d69********</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static AddressVerifyV2IntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddressVerifyV2IntlResponseBodyResult self = new AddressVerifyV2IntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddressVerifyV2IntlResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public AddressVerifyV2IntlResponseBodyResult setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public AddressVerifyV2IntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
