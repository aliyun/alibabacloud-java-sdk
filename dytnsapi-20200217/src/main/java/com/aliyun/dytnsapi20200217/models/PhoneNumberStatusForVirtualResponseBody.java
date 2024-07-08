// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVirtualResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>OperatorLimit</strong>: The carrier prohibits the query of the phone number.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
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
    public PhoneNumberStatusForVirtualResponseBodyData data;

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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
