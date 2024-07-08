// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVoiceResponseBody extends TeaModel {
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
    public PhoneNumberStatusForVoiceResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVoiceResponseBody self = new PhoneNumberStatusForVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForVoiceResponseBody setData(PhoneNumberStatusForVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForVoiceResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForVoiceResponseBodyData extends TeaModel {
        /**
         * <p>The basic carrier who assigns the phone number. If the queried phone number involves mobile number portability, the carrier after mobile number portability is returned. Valid values:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CUCC</strong>: China Unicom</li>
         * <li><strong>CTCC</strong>: China Telecom</li>
         * </ul>
         * <blockquote>
         * <p> You are not allowed to query the phone numbers assigned by China Broadnet.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CTCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The returned status for the queried phone number. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The queried phone number can be reached.</li>
         * <li><strong>SHUTDOWN</strong>: The queried phone number is suspended.</li>
         * <li><strong>POWER_OFF</strong>: The phone is powered off.</li>
         * <li><strong>NOT_EXIST</strong>: The queried phone number is a nonexistent number.</li>
         * <li><strong>SUSPECTED_POWER_OFF</strong>: The phone is suspected to be powered off.</li>
         * <li><strong>DEFECT</strong>: The queried phone number is invalid.</li>
         * <li><strong>UNKNOWN</strong>: The queried phone number is unknown.</li>
         * </ul>
         * <blockquote>
         * <p> Due to system adjustment of the carrier, the BUSY, SUSPECTED_POWER_OFF, and POWER_OFF states cannot be returned for the numbers assigned by China Telecom. <a href="https://help.aliyun.com/document_detail/2489709.html">For more information, see the official announcements</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForVoiceResponseBodyData self = new PhoneNumberStatusForVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForVoiceResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForVoiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
