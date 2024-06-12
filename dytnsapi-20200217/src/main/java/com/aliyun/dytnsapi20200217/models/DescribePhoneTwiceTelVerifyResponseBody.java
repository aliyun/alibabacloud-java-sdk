// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **PortabilityNumberNotSupported**: The phone number that is involved in mobile number portability is not supported.</p>
     * <p>*   **RequestNumberNotSupported**: You are not allowed to query phone numbers assigned by China Broadnet (that is, phone numbers start with 192) and phone numbers assigned by virtual network operators (VNOs).</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     * <br>
     * <p>>  You are charged for phone number verifications if the value of Code is OK and the value of VerifyResult is not 0. For more information, see [Pricing](https://help.aliyun.com/document_detail/154751.html).</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot and locate issues.</p>
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
         * <br>
         * <p>*   **CMCC**: China Mobile</p>
         * <p>*   **CUCC**: China Unicom</p>
         * <p>*   **CTCC**: China Telecom</p>
         * <br>
         * <p>>  The returned result indicates the carrier who assigns the phone number. If the phone number involves mobile number portability, the carrier after mobile number portability is returned.</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The result of the request. Valid values:</p>
         * <br>
         * <p>*   **0**: It is unable to judge whether the phone number is a reassigned number.</p>
         * <p>*   **1**: The phone number is a reassigned number.</p>
         * <p>*   **2**: The phone number is not a reassigned number.</p>
         * <p>*   **3**: The phone number has been canceled.</p>
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
