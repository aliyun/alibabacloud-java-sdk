// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForRealResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>OperatorLimit</strong>: The query for the phone number is restricted by the carrier.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Carriers prohibit high-frequency queries for the same number within a short period. If this error code is returned, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned for the request.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForRealResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A unique identifier for the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForRealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForRealResponseBody self = new PhoneNumberStatusForRealResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForRealResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForRealResponseBody setData(PhoneNumberStatusForRealResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForRealResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForRealResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForRealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForRealResponseBodyData extends TeaModel {
        /**
         * <p>The carrier that provides service for the phone number. If the number has been ported through mobile number portability (MNP), this field returns the new carrier. Valid values:</p>
         * <ul>
         * <li><p><strong>CMCC</strong>: China Mobile.</p>
         * </li>
         * <li><p><strong>CUCC</strong>: China Unicom.</p>
         * </li>
         * <li><p><strong>CTCC</strong>: China Telecom.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Queries for China Broadnet numbers are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The status of the phone number. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The number is in service.</p>
         * </li>
         * <li><p><strong>SHUTDOWN</strong>: The service for the number is suspended.</p>
         * </li>
         * <li><p><strong>POWER_OFF</strong>: The phone is powered off.</p>
         * </li>
         * <li><p><strong>NOT_EXIST</strong>: The number is not in service.</p>
         * </li>
         * <li><p><strong>BUSY</strong>: The line is busy.</p>
         * </li>
         * <li><p><strong>SUSPECTED_POWER_OFF</strong>: The phone is suspected to be powered off.</p>
         * </li>
         * <li><p><strong>DEFECT</strong>: The number is invalid.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: The status is unknown.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to carrier system adjustments, China Telecom numbers no longer return the <code>BUSY</code>, <code>SUSPECTED_POWER_OFF</code>, and <code>POWER_OFF</code> statuses. For more information, see the <a href="https://help.aliyun.com/document_detail/2489709.html">official announcement</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForRealResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForRealResponseBodyData self = new PhoneNumberStatusForRealResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForRealResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForRealResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
