// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateResponseBody extends TeaModel {
    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("NumberDetail")
    public SendMessageWithTemplateResponseBodyNumberDetail numberDetail;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    @NameInMap("Segments")
    public String segments;

    @NameInMap("To")
    public String to;

    @NameInMap("MessageId")
    public String messageId;

    public static SendMessageWithTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateResponseBody self = new SendMessageWithTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SendMessageWithTemplateResponseBody setNumberDetail(SendMessageWithTemplateResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public SendMessageWithTemplateResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
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

    public SendMessageWithTemplateResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public static class SendMessageWithTemplateResponseBodyNumberDetail extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Region")
        public String region;

        @NameInMap("Country")
        public String country;

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

        public SendMessageWithTemplateResponseBodyNumberDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SendMessageWithTemplateResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

}
