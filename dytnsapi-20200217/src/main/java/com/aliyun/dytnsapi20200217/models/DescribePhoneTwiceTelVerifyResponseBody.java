// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>PortabilityNumberNotSupported</strong>: The phone number that is involved in mobile number portability is not supported.</li>
     * <li><strong>RequestNumberNotSupported</strong>: You are not allowed to query phone numbers assigned by China Broadnet (that is, phone numbers start with 192) and phone numbers assigned by virtual network operators (VNOs).</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
     * <blockquote>
     * <p> You are charged for phone number verifications if the value of Code is OK and the value of VerifyResult is not 0. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html">Pricing</a>.</p>
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
    public DescribePhoneTwiceTelVerifyResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneTwiceTelVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyResponseBody self = new DescribePhoneTwiceTelVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setData(DescribePhoneTwiceTelVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneTwiceTelVerifyResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneTwiceTelVerifyResponseBodyData extends TeaModel {
        /**
         * <p>The carrier. Valid values:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CUCC</strong>: China Unicom</li>
         * <li><strong>CTCC</strong>: China Telecom</li>
         * </ul>
         * <blockquote>
         * <p> The returned result indicates the carrier who assigns the phone number. If the phone number involves mobile number portability, the carrier after mobile number portability is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The result of the request. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: It is unable to judge whether the phone number is a reassigned number.</li>
         * <li><strong>1</strong>: The phone number is a reassigned number.</li>
         * <li><strong>2</strong>: The phone number is not a reassigned number.</li>
         * <li><strong>3</strong>: The phone number has been canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneTwiceTelVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneTwiceTelVerifyResponseBodyData self = new DescribePhoneTwiceTelVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
