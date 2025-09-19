// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyV2IntlResponseBody extends TeaModel {
    /**
     * <p><a href="https://www.alibabacloud.com/help/zh/ekyc/latest/add-verify-pro-api?spm=a2c63.p38356.0.i4#ae60001a3804w">Return Code</a></p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Detailed description of the return code</p>
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
     * <p>Result object</p>
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
         * <li><strong>1</strong>: Passed (billed)</li>
         * <li><strong>2</strong>: Failed (The device is in a prohibited region) (billed)</li>
         * <li><strong>3</strong>: Unknown (billed)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Verification details, including：</p>
         * <ul>
         * <li><p><strong>DistanceRange</strong>：Position rang：<a href="https://www.alibabacloud.com/help/zh/ekyc/latest/add-verify-pro-api?spm=a2c63.p38356.0.i27#ee274c08976er">DistanceRange description</a>。</p>
         * <blockquote>
         * <p>If the input phone number or address is empty, or if no carrier information is found, this field will not be returned.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>IspName</strong>: The carrier name:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CTCC</strong>: China Telecom</li>
         * <li><strong>CUCC</strong>: China Unicom<blockquote>
         * <p>This parameter is not returned if the mobile phone number or address is empty in the request, or if carrier information is not found.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>PhoneStatus</strong>: The status of the mobile phone:</p>
         * <ul>
         * <li><strong>0</strong>: Abnormal</li>
         * <li><strong>1</strong>: Normal</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is not returned if the mobile phone number is empty in the request.</p>
         * </blockquote>
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
         * <p>The transaction ID</p>
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
