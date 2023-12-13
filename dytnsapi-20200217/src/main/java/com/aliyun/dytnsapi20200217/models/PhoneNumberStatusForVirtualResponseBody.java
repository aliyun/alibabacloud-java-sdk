// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVirtualResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **OperatorLimit**: The carrier prohibits the query of the phone number.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForVirtualResponseBodyData data;

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

    public static PhoneNumberStatusForVirtualResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVirtualResponseBody self = new PhoneNumberStatusForVirtualResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVirtualResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForVirtualResponseBody setData(PhoneNumberStatusForVirtualResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForVirtualResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForVirtualResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForVirtualResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForVirtualResponseBodyData extends TeaModel {
        /**
         * <p>Indicate whether the phone number is a virtual number assigned by the carrier. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsPrivacyNumber")
        public Boolean isPrivacyNumber;

        public static PhoneNumberStatusForVirtualResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForVirtualResponseBodyData self = new PhoneNumberStatusForVirtualResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForVirtualResponseBodyData setIsPrivacyNumber(Boolean isPrivacyNumber) {
            this.isPrivacyNumber = isPrivacyNumber;
            return this;
        }
        public Boolean getIsPrivacyNumber() {
            return this.isPrivacyNumber;
        }

    }

}
