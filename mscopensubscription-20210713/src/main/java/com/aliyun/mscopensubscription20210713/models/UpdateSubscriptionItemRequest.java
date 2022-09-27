// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionItemRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContactIds")
    public java.util.List<Long> contactIds;

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
    public java.util.List<Long> webhookIds;

    @NameInMap("WebhookStatus")
    public Integer webhookStatus;

    public static UpdateSubscriptionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionItemRequest self = new UpdateSubscriptionItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSubscriptionItemRequest setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    public UpdateSubscriptionItemRequest setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }
    public Integer getEmailStatus() {
        return this.emailStatus;
    }

    public UpdateSubscriptionItemRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }
    public Integer getItemId() {
        return this.itemId;
    }

    public UpdateSubscriptionItemRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public UpdateSubscriptionItemRequest setPmsgStatus(Integer pmsgStatus) {
        this.pmsgStatus = pmsgStatus;
        return this;
    }
    public Integer getPmsgStatus() {
        return this.pmsgStatus;
    }

    public UpdateSubscriptionItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSubscriptionItemRequest setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
        return this;
    }
    public Integer getSmsStatus() {
        return this.smsStatus;
    }

    public UpdateSubscriptionItemRequest setTtsStatus(Integer ttsStatus) {
        this.ttsStatus = ttsStatus;
        return this;
    }
    public Integer getTtsStatus() {
        return this.ttsStatus;
    }

    public UpdateSubscriptionItemRequest setWebhookIds(java.util.List<Long> webhookIds) {
        this.webhookIds = webhookIds;
        return this;
    }
    public java.util.List<Long> getWebhookIds() {
        return this.webhookIds;
    }

    public UpdateSubscriptionItemRequest setWebhookStatus(Integer webhookStatus) {
        this.webhookStatus = webhookStatus;
        return this;
    }
    public Integer getWebhookStatus() {
        return this.webhookStatus;
    }

}
