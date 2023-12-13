// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   For more information, see Error codes in this documentation.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number or name at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public TwoElementsVerificationResponseBodyData data;

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

    public static TwoElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TwoElementsVerificationResponseBody self = new TwoElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public TwoElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TwoElementsVerificationResponseBody setData(TwoElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TwoElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public TwoElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TwoElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TwoElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <p>The basic carriers. Valid values:</p>
         * <br>
         * <p>*   **China Mobile**</p>
         * <p>*   **China Unicom**</p>
         * <p>*   **China Telecom**</p>
         * <br>
         * <p>>  You are not allowed to verify numbers assigned by China Broadnet.</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>Indicates whether the specified name and phone number belong to the same user. Valid values:</p>
         * <br>
         * <p>* **1**: The specified name and phone number belong to the same user.</p>
         * <br>
         * <p>* **0**: The specified name and phone number do not belong to the same user.</p>
         * <br>
         * <p>* **2**: The specified name and phone number cannot be found.</p>
         * <br>
         * <p>The phone number registration data of a user is usually updated one or three days after registration. The registration data can be queried only after the update. The following table shows the verification results under different phone number states.</p>
         * <br>
         * <p>|Carrier/Phone number state|Out-of-service|Nonexistent|Canceled|</p>
         * <p>|---|---|---|---|</p>
         * <p>|China Mobile|Verifications can be carried out normally.|The specified name and phone number cannot be found.|The specified name and phone number cannot be found.|</p>
         * <p>|China Unicom|Verifications can be carried out normally.|The specified name and phone number do not belong to the same user.|The specified name and phone number do not belong to the same user.|</p>
         * <p>|China Telecom|Verifications can be carried out normally.|The specified name and phone number cannot be found.|The specified name and phone number cannot be found.|</p>
         */
        @NameInMap("IsConsistent")
        public Integer isConsistent;

        public static TwoElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TwoElementsVerificationResponseBodyData self = new TwoElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TwoElementsVerificationResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public TwoElementsVerificationResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

    }

}
