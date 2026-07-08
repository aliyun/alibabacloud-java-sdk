// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicResponseBody extends TeaModel {
    /**
     * <p>The status code of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>OperatorLimit</strong>: The query for the phone number is prohibited by the carrier.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Carrier restrictions prohibit frequent queries for the same number in a short period. If this error code is returned, try again later.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For a list of other error codes, see <a href="https://next.api.aliyun.com/document/Dytnsapi/2020-02-17/errorCode">API Error Center</a>.</p>
     * </blockquote>
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
    public PhoneNumberStatusForPublicResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-<strong><strong>-</strong></strong>-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForPublicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForPublicResponseBody self = new PhoneNumberStatusForPublicResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForPublicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForPublicResponseBody setData(PhoneNumberStatusForPublicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForPublicResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForPublicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForPublicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForPublicResponseBodyData extends TeaModel {
        /**
         * <p>The basic carrier of the number. If the number has been ported, this parameter returns the current carrier.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>CMCC</strong>: China Mobile</p>
         * </li>
         * <li><p><strong>CUCC</strong>: China Unicom</p>
         * </li>
         * <li><p><strong>CTCC</strong>: China Telecom</p>
         * </li>
         * <li><p><strong>CBN</strong>: China Broadnet</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The status of the queried phone number. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL</strong>: The number is in service.</p>
         * </li>
         * <li><p><strong>SHUTDOWN</strong>: The service for the number is suspended.</p>
         * </li>
         * <li><p><strong>POWER_OFF</strong>: The phone is powered off.</p>
         * </li>
         * <li><p><strong>NOT_EXIST</strong>: The number is non-existent.</p>
         * </li>
         * <li><p><strong>SUSPECTED_POWER_OFF</strong>: The phone is suspected to be powered off.</p>
         * </li>
         * <li><p><strong>BUSY</strong>: The line is busy.</p>
         * </li>
         * <li><p><strong>UNKNOWN</strong>: The status is unknown.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to carrier system adjustments, the <code>BUSY</code>, <code>SUSPECTED_POWER_OFF</code>, and <code>POWER_OFF</code> statuses are not returned for China Telecom numbers. For more information, see the <a href="https://help.aliyun.com/document_detail/2489709.html">official announcement</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForPublicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForPublicResponseBodyData self = new PhoneNumberStatusForPublicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForPublicResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForPublicResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
