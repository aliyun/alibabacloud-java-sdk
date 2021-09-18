// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SmsConversionRequest extends TeaModel {
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Delivered")
    public Boolean delivered;

    @NameInMap("ConversionTime")
    public Long conversionTime;

    public static SmsConversionRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionRequest self = new SmsConversionRequest();
        return TeaModel.build(map, self);
    }

    public SmsConversionRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SmsConversionRequest setDelivered(Boolean delivered) {
        this.delivered = delivered;
        return this;
    }
    public Boolean getDelivered() {
        return this.delivered;
    }

    public SmsConversionRequest setConversionTime(Long conversionTime) {
        this.conversionTime = conversionTime;
        return this;
    }
    public Long getConversionTime() {
        return this.conversionTime;
    }

}
