// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionItemShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc-def</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>订阅联系人</p>
     */
    @NameInMap("ContactIds")
    public String contactIdsShrink;

    /**
     * <p>邮件订阅情况</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EmailStatus")
    public Integer emailStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ItemId")
    public Integer itemId;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>站内信订阅情况</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PmsgStatus")
    public Integer pmsgStatus;

    /**
     * <p>地域id</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>短信订阅情况</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsStatus")
    public Integer smsStatus;

    /**
     * <p>语音短信订阅情况</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TtsStatus")
    public Integer ttsStatus;

    /**
     * <p>订阅webhooks</p>
     */
    @NameInMap("WebhookIds")
    public String webhookIdsShrink;

    /**
     * <p>回调订阅情况</p>
     * <p>This parameter is required.</p>
     */
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
