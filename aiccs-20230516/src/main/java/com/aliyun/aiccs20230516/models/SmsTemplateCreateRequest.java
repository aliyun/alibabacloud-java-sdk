// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplateCreateRequest extends TeaModel {
    /**
     * <p>短信内容</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>短信签名</p>
     */
    @NameInMap("Sign")
    public String sign;

    /**
     * <p>短信类型</p>
     */
    @NameInMap("SmsType")
    public Long smsType;

    /**
     * <p>模板名称</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>模板类型</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static SmsTemplateCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplateCreateRequest self = new SmsTemplateCreateRequest();
        return TeaModel.build(map, self);
    }

    public SmsTemplateCreateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SmsTemplateCreateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SmsTemplateCreateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SmsTemplateCreateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SmsTemplateCreateRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public SmsTemplateCreateRequest setSmsType(Long smsType) {
        this.smsType = smsType;
        return this;
    }
    public Long getSmsType() {
        return this.smsType;
    }

    public SmsTemplateCreateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SmsTemplateCreateRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}
