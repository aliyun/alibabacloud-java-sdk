// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SmsConversionRequest extends TeaModel {
    /**
     * <p>The time when the OTP message was delivered. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <br>
     * <p>*   If you leave the parameter empty, the current timestamp is specified by default.</p>
     * <p>*   If you specify the parameter, the timestamp must be greater than the message sending time and less than the current timestamp.</p>
     */
    @NameInMap("ConversionTime")
    public Long conversionTime;

    /**
     * <p>Specifies whether customers replied to the OTP message. Valid values: true and false.</p>
     */
    @NameInMap("Delivered")
    public Boolean delivered;

    /**
     * <p>The ID of the OTP message.</p>
     */
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
