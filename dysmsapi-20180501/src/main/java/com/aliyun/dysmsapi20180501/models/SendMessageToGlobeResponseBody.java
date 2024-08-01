// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeResponseBody extends TeaModel {
    /**
     * <p>The sender ID returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Alicloud321</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>1008030300****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The details about the mobile phone number of the recipient.</p>
     */
    @NameInMap("NumberDetail")
    public SendMessageToGlobeResponseBodyNumberDetail numberDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code of the delivery request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The description of the delivery request status.</p>
     * 
     * <strong>example:</strong>
     * <p>The SMS Send Request was accepted</p>
     */
    @NameInMap("ResponseDescription")
    public String responseDescription;

    /**
     * <p>The number of messages that incurred fees.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Segments")
    public String segments;

    /**
     * <p>The mobile phone number to which the message was sent.</p>
     * 
     * <strong>example:</strong>
     * <p>1380000****</p>
     */
    @NameInMap("To")
    public String to;

    public static SendMessageToGlobeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeResponseBody self = new SendMessageToGlobeResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageToGlobeResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendMessageToGlobeResponseBody setNumberDetail(SendMessageToGlobeResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public SendMessageToGlobeResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public SendMessageToGlobeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageToGlobeResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SendMessageToGlobeResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public SendMessageToGlobeResponseBody setSegments(String segments) {
        this.segments = segments;
        return this;
    }
    public String getSegments() {
        return this.segments;
    }

    public SendMessageToGlobeResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public static class SendMessageToGlobeResponseBodyNumberDetail extends TeaModel {
        /**
         * <p>The carrier that owns the mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>CMI</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The country to which the mobile phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The region to which the mobile phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        @NameInMap("Region")
        public String region;

        public static SendMessageToGlobeResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            SendMessageToGlobeResponseBodyNumberDetail self = new SendMessageToGlobeResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SendMessageToGlobeResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
