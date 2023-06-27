// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class QueryMessageResponseBody extends TeaModel {
    /**
     * <p>The status code of the message.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The description of the status code.</p>
     */
    @NameInMap("ErrorDescription")
    public String errorDescription;

    /**
     * <p>The content of the message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the message.</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The details about the mobile phone number.</p>
     */
    @NameInMap("NumberDetail")
    public QueryMessageResponseBodyNumberDetail numberDetail;

    /**
     * <p>The time when the delivery receipt was received from the carrier.</p>
     */
    @NameInMap("ReceiveDate")
    public String receiveDate;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code of the delivery request.</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The description of the delivery request status.</p>
     */
    @NameInMap("ResponseDescription")
    public String responseDescription;

    /**
     * <p>The time when the message was sent to the carrier.</p>
     */
    @NameInMap("SendDate")
    public String sendDate;

    /**
     * <p>The delivery status of the message.</p>
     * <br>
     * <p>*   1: The message was sent.</p>
     * <p>*   2: The message failed to be sent.</p>
     * <p>*   3: The message is being sent.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The mobile phone number to which the message was sent.</p>
     */
    @NameInMap("To")
    public String to;

    public static QueryMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageResponseBody self = new QueryMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMessageResponseBody setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public QueryMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QueryMessageResponseBody setNumberDetail(QueryMessageResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public QueryMessageResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public QueryMessageResponseBody setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
        return this;
    }
    public String getReceiveDate() {
        return this.receiveDate;
    }

    public QueryMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryMessageResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public QueryMessageResponseBody setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public QueryMessageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryMessageResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public static class QueryMessageResponseBodyNumberDetail extends TeaModel {
        /**
         * <p>The carrier that owns the mobile phone number.</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The country to which the mobile phone number belongs.</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The region to which the mobile phone number belongs.</p>
         */
        @NameInMap("Region")
        public String region;

        public static QueryMessageResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageResponseBodyNumberDetail self = new QueryMessageResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public QueryMessageResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public QueryMessageResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryMessageResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
