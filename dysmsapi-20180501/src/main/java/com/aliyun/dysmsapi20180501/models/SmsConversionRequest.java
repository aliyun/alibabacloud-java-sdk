// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SmsConversionRequest extends TeaModel {
    @NameInMap("ConversionTime")
    public Long conversionTime;

    @NameInMap("Delivered")
    public Boolean delivered;

    @NameInMap("MessageId")
    public String messageId;

    public static SmsConversionRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionRequest self = new SmsConversionRequest();
        return TeaModel.build(map, self);
    }

    public SmsConversionRequest setConversionTime(Long conversionTime) {
        this.conversionTime = conversionTime;
        return this;
    }
    public Long getConversionTime() {
        return this.conversionTime;
    }

    public SmsConversionRequest setDelivered(Boolean delivered) {
        this.delivered = delivered;
        return this;
    }
    public Boolean getDelivered() {
        return this.delivered;
    }

    public SmsConversionRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
