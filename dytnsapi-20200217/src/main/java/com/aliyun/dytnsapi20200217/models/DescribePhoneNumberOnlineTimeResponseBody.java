// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>PortabilityNumberNotSupported</strong>: The phone number that is involved in mobile number portability is not supported.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
     * <blockquote>
     * <p> You are charged if the value of Code is OK and the value of VerifyResult is not -1. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html">Pricing</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribePhoneNumberOnlineTimeResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberOnlineTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOnlineTimeResponseBody self = new DescribePhoneNumberOnlineTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOnlineTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setData(DescribePhoneNumberOnlineTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberOnlineTimeResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberOnlineTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberOnlineTimeResponseBodyData extends TeaModel {
        /**
         * <p>The carrier code. Valid values:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CUCC</strong>: China Unicom</li>
         * <li><strong>CTCC</strong>: China Telecom</li>
         * <li><strong>CBN</strong>: China Broadnet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("CarrierCode")
        public String carrierCode;

        /**
         * <p>The enumerated value of the usage period of a phone number. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: No usage period information is available for the phone number.</li>
         * <li><strong>0</strong>: The phone number status is abnormal. For example, the phone number is a nonexistent number.</li>
         * <li><strong>1</strong> :[0-3) months.</li>
         * <li><strong>2</strong> :[3-6] months.</li>
         * <li><strong>3</strong> :(6-12] months.</li>
         * <li><strong>4</strong> :(12-24] months.</li>
         * <li><strong>5</strong> :(24,+) months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneNumberOnlineTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberOnlineTimeResponseBodyData self = new DescribePhoneNumberOnlineTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberOnlineTimeResponseBodyData setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
            return this;
        }
        public String getCarrierCode() {
            return this.carrierCode;
        }

        public DescribePhoneNumberOnlineTimeResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
