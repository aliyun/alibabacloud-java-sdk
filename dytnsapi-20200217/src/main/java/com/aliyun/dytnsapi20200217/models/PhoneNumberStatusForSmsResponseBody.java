// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForSmsResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>OperatorLimit</strong>: The carrier restricts queries for this phone number.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Indicates that requests for a single number are too frequent. Due to carrier restrictions, repeated queries for the same number within a short period are prohibited. If you receive this error code, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A container for the returned data.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForSmsResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForSmsResponseBody self = new PhoneNumberStatusForSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForSmsResponseBody setData(PhoneNumberStatusForSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForSmsResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForSmsResponseBodyData extends TeaModel {
        /**
         * <p>The carrier of the phone number. If the number has been ported, this parameter returns the current carrier. Valid values:</p>
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
         * <li><p><strong>NORMAL</strong>: Active.</p>
         * </li>
         * <li><p><strong>SHUTDOWN</strong>: Shutdown.</p>
         * </li>
         * <li><p><strong>POWER_OFF</strong>: Powered off.</p>
         * </li>
         * <li><p><strong>NOT_EXIST</strong>: Non-existent number.</p>
         * </li>
         * <li><p><strong>DEFECT</strong>: Invalid number.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: Unknown.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to carrier system adjustments, the statuses for busy, suspected to be powered off, and powered off are not returned for China Telecom numbers. For more information, see the <a href="https://help.aliyun.com/document_detail/2489709.html">official announcement</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForSmsResponseBodyData self = new PhoneNumberStatusForSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForSmsResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForSmsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
