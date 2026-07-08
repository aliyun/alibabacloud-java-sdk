// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVoiceResponseBody extends TeaModel {
    /**
     * <p>The status code of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>OperatorLimit</strong>: The carrier restricts queries for this phone number.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Carrier restrictions limit how frequently you can query the same number. If you receive this error, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForVoiceResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. This is a common parameter. Each request has a unique ID that you can use to troubleshoot issues.</p>
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
         * <p>The current carrier for the number. If the number has been ported, this field returns the new carrier. Valid values:</p>
         * <ul>
         * <li><p><strong>CMCC</strong>: China Mobile</p>
         * </li>
         * <li><p><strong>CUCC</strong>: China Unicom</p>
         * </li>
         * <li><p><strong>CTCC</strong>: China Telecom</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Queries for China Broadnet numbers are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CTCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The status of the phone number. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The number is active.</p>
         * </li>
         * <li><p><strong>SHUTDOWN</strong>: The service for the number is suspended.</p>
         * </li>
         * <li><p><strong>POWER_OFF</strong>: The phone is powered off.</p>
         * </li>
         * <li><p><strong>NOT_EXIST</strong>: The number does not exist.</p>
         * </li>
         * <li><p><strong>SUSPECTED_POWER_OFF</strong>: The phone is likely powered off.</p>
         * </li>
         * <li><p><strong>DEFECT</strong>: The number is invalid.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: The status is unknown.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to carrier system adjustments, the <code>SUSPECTED_POWER_OFF</code> and <code>POWER_OFF</code> statuses are not returned for China Telecom numbers. <a href="https://help.aliyun.com/document_detail/2489709.html">For more information, see the official announcement.</a></p>
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
