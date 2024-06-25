// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SmsConversionIntlRequest extends TeaModel {
    /**
     * <p>The time when the OTP message was delivered. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <ul>
     * <li>If you leave the parameter empty, the current timestamp is specified by default.</li>
     * <li>If you specify the parameter, the timestamp must be greater than the message sending time and less than the current timestamp.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1349055900000</p>
     */
    @NameInMap("ConversionTime")
    public Long conversionTime;

    /**
     * <p>Specifies whether customers replied to the OTP message. Valid values: true and false.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Delivered")
    public Boolean delivered;

    /**
     * <p>The ID of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1008030300****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SmsConversionIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionIntlRequest self = new SmsConversionIntlRequest();
        return TeaModel.build(map, self);
    }

    public SmsConversionIntlRequest setConversionTime(Long conversionTime) {
        this.conversionTime = conversionTime;
        return this;
    }
    public Long getConversionTime() {
        return this.conversionTime;
    }

    public SmsConversionIntlRequest setDelivered(Boolean delivered) {
        this.delivered = delivered;
        return this;
    }
    public Boolean getDelivered() {
        return this.delivered;
    }

    public SmsConversionIntlRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SmsConversionIntlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SmsConversionIntlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SmsConversionIntlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
