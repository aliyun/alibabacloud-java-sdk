// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>1**************3</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The details about the mobile phone number of the recipient.</p>
     */
    @NameInMap("NumberDetail")
    public SendMessageWithTemplateResponseBodyNumberDetail numberDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D23D6</p>
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
     * <p>The mobile phone number to which the message was sent. The dialing code was added to the beginning of the mobile phone number. Example: 861503871\<em>\</em>\<em>\</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>861503871****</p>
     */
    @NameInMap("To")
    public String to;

    public static SendMessageWithTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateResponseBody self = new SendMessageWithTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendMessageWithTemplateResponseBody setNumberDetail(SendMessageWithTemplateResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public SendMessageWithTemplateResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public SendMessageWithTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageWithTemplateResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SendMessageWithTemplateResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public SendMessageWithTemplateResponseBody setSegments(String segments) {
        this.segments = segments;
        return this;
    }
    public String getSegments() {
        return this.segments;
    }

    public SendMessageWithTemplateResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public static class SendMessageWithTemplateResponseBodyNumberDetail extends TeaModel {
        /**
         * <p>The carrier that owns the mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>China Mobile</p>
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
         * <p>Nanjing, Jiangsu</p>
         */
        @NameInMap("Region")
        public String region;

        public static SendMessageWithTemplateResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            SendMessageWithTemplateResponseBodyNumberDetail self = new SendMessageWithTemplateResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public SendMessageWithTemplateResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public SendMessageWithTemplateResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SendMessageWithTemplateResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
