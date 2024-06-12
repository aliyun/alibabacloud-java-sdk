// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **PortabilityNumberNotSupported**: The phone number that is involved in mobile number portability is not supported.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     * <br>
     * <p>>  You are charged if the value of Code is OK and the value of VerifyResult is not -1. For more information, see [Pricing](https://help.aliyun.com/document_detail/154751.html).</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <br>
         * <p>*   **CMCC**: China Mobile</p>
         * <p>*   **CUCC**: China Unicom</p>
         * <p>*   **CTCC**: China Telecom</p>
         * <p>*   **CBN**: China Broadnet</p>
         */
        @NameInMap("CarrierCode")
        public String carrierCode;

        /**
         * <p>The enumerated value of the usage period of a phone number. Valid values:</p>
         * <br>
         * <p>*   **-1**: No usage period information is available for the phone number.</p>
         * <p>*   **0**: The phone number status is abnormal. For example, the phone number is a nonexistent number.</p>
         * <p>*   **1** :[0-3) months.</p>
         * <p>*   **2** :[3-6] months.</p>
         * <p>*   **3** :(6-12] months.</p>
         * <p>*   **4** :(12-24] months.</p>
         * <p>*   **5** :(24,+) months.</p>
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
