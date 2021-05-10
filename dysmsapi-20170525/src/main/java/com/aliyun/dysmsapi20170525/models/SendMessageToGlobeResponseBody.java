// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Segments")
    public String segments;

    @NameInMap("Code")
    public String code;

    @NameInMap("To")
    public String to;

    @NameInMap("NumberDetail")
    public SendMessageToGlobeResponseBodyNumberDetail numberDetail;

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

    public SendMessageToGlobeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageToGlobeResponseBody setSegments(String segments) {
        this.segments = segments;
        return this;
    }
    public String getSegments() {
        return this.segments;
    }

    public SendMessageToGlobeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendMessageToGlobeResponseBody setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageToGlobeResponseBody setNumberDetail(SendMessageToGlobeResponseBodyNumberDetail numberDetail) {
        this.numberDetail = numberDetail;
        return this;
    }
    public SendMessageToGlobeResponseBodyNumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    public static class SendMessageToGlobeResponseBodyNumberDetail extends TeaModel {
        @NameInMap("Country")
        public String country;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Region")
        public String region;

        public static SendMessageToGlobeResponseBodyNumberDetail build(java.util.Map<String, ?> map) throws Exception {
            SendMessageToGlobeResponseBodyNumberDetail self = new SendMessageToGlobeResponseBodyNumberDetail();
            return TeaModel.build(map, self);
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SendMessageToGlobeResponseBodyNumberDetail setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
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
