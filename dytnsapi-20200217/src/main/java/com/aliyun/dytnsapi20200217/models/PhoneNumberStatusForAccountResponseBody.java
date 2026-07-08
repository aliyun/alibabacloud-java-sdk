// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForAccountResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>OperatorLimit</strong>: The query is prohibited by the carrier.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Carriers restrict frequent queries for the same number within a short period. If you receive this error code, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForAccountResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. This ID is unique to each request and can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForAccountResponseBody self = new PhoneNumberStatusForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForAccountResponseBody setData(PhoneNumberStatusForAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForAccountResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForAccountResponseBodyData extends TeaModel {
        /**
         * <p>The number\&quot;s current carrier. If the number has been ported to a new carrier through mobile number portability, the new carrier is returned. Valid values:</p>
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
         * <p>CMCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The status of the phone number. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The number is active.</p>
         * </li>
         * <li><p><strong>SHUTDOWN</strong>: The number is suspended or temporarily out of service.</p>
         * </li>
         * <li><p><strong>POWER_OFF</strong>: The phone is powered off.</p>
         * </li>
         * <li><p><strong>NOT_EXIST</strong>: The number is non-existent.</p>
         * </li>
         * <li><p><strong>DEFECT</strong>: The number is invalid.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: The status is unknown.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to adjustments in the carrier\&quot;s system, China Telecom numbers do not return the <code>busy</code> and <code>powered off</code> statuses. For more information, <a href="https://help.aliyun.com/document_detail/2489709.html">see the official announcement</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForAccountResponseBodyData self = new PhoneNumberStatusForAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForAccountResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForAccountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
