// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   For more information, see Error codes in this documentation.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ThreeElementsVerificationResponseBodyData data;

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

    public static ThreeElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ThreeElementsVerificationResponseBody self = new ThreeElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ThreeElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ThreeElementsVerificationResponseBody setData(ThreeElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ThreeElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public ThreeElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ThreeElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ThreeElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <p>The basic carrier. Valid values:</p>
         * <br>
         * <p>*   **China Mobile**</p>
         * <p>*   **China Unicom**</p>
         * <p>*   **China Telecom**</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>Indicates whether the specified name, phone number, and ID card number belong to the same user. Valid values:</p>
         * <br>
         * <p>* **1**: The specified name, phone number, and ID card number belong to the same user.</p>
         * <p>* **0**: The specified name, phone number, and ID card number do not belong to the same user.</p>
         * <p>* **2**: The specified name, phone number, and ID card number cannot be found.</p>
         * <br>
         * <p>**Note** The phone number registration data of a user is usually updated one or three days after registration. The registration data can be queried only after the update. The following table shows the verification results under different phone number states.</p>
         * <br>
         * <p>|Carrier/Phone number state|Out-of-service|Nonexistent|Canceled|</p>
         * <p>|---|---|---|---|</p>
         * <p>|China Mobile|Verifications can be carried out normally.|The specified name, phone number, and ID card number cannot be found.|The specified name, phone number, and ID card number cannot be found.|</p>
         * <p>|China Unicom|Verifications can be carried out normally.|The specified name, phone number, and ID card number do not belong to the same user.|The specified name, phone number, and ID card number do not belong to the same user.|</p>
         * <p>|China Telecom|Verifications can be carried out normally.|The specified name, phone number, and ID card number cannot be found.|The specified name, phone number, and ID card number cannot be found.|</p>
         */
        @NameInMap("IsConsistent")
        public Integer isConsistent;

        public static ThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ThreeElementsVerificationResponseBodyData self = new ThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ThreeElementsVerificationResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public ThreeElementsVerificationResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

    }

}
