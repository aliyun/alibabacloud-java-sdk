// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionItemShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContactIds")
    public String contactIdsShrink;

    @NameInMap("EmailStatus")
    public Integer emailStatus;

    @NameInMap("ItemId")
    public Integer itemId;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("PmsgStatus")
    public Integer pmsgStatus;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmsStatus")
    public Integer smsStatus;

    @NameInMap("TtsStatus")
    public Integer ttsStatus;

    @NameInMap("WebhookIds")
    public String webhookIdsShrink;

    @NameInMap("WebhookStatus")
    public Integer webhookStatus;

    public static UpdateSubscriptionItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionItemShrinkRequest self = new UpdateSubscriptionItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionItemShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSubscriptionItemShrinkRequest setContactIdsShrink(String contactIdsShrink) {
        this.contactIdsShrink = contactIdsShrink;
        return this;
    }
    public String getContactIdsShrink() {
        return this.contactIdsShrink;
    }

    public UpdateSubscriptionItemShrinkRequest setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }
    public Integer getEmailStatus() {
        return this.emailStatus;
    }

    public UpdateSubscriptionItemShrinkRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }
    public Integer getItemId() {
        return this.itemId;
    }

    public UpdateSubscriptionItemShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public UpdateSubscriptionItemShrinkRequest setPmsgStatus(Integer pmsgStatus) {
        this.pmsgStatus = pmsgStatus;
        return this;
    }
    public Integer getPmsgStatus() {
        return this.pmsgStatus;
    }

    public UpdateSubscriptionItemShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSubscriptionItemShrinkRequest setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
        return this;
    }
    public Integer getSmsStatus() {
        return this.smsStatus;
    }

    public UpdateSubscriptionItemShrinkRequest setTtsStatus(Integer ttsStatus) {
        this.ttsStatus = ttsStatus;
        return this;
    }
    public Integer getTtsStatus() {
        return this.ttsStatus;
    }

    public UpdateSubscriptionItemShrinkRequest setWebhookIdsShrink(String webhookIdsShrink) {
        this.webhookIdsShrink = webhookIdsShrink;
        return this;
    }
    public String getWebhookIdsShrink() {
        return this.webhookIdsShrink;
    }

    public UpdateSubscriptionItemShrinkRequest setWebhookStatus(Integer webhookStatus) {
        this.webhookStatus = webhookStatus;
        return this;
    }
    public Integer getWebhookStatus() {
        return this.webhookStatus;
    }

}
