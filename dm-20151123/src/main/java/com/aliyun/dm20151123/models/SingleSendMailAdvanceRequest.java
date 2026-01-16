// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    @NameInMap("Attachments")
    public java.util.List<SingleSendMailAdvanceRequestAttachments> attachments;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:1@example.com">1@example.com</a>,<a href="mailto:2@example.com">2@example.com</a></p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("BccAddress")
    public String bccAddress;

    @NameInMap("ClickTrace")
    public String clickTrace;

    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    @NameInMap("FromAlias")
    public String fromAlias;

    @NameInMap("Headers")
    public String headers;

    @NameInMap("HtmlBody")
    public String htmlBody;

    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReplyToAddress")
    public Boolean replyToAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Template")
    public SingleSendMailAdvanceRequestTemplate template;

    @NameInMap("TextBody")
    public String textBody;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    @NameInMap("UnSubscribeLinkType")
    public String unSubscribeLinkType;

    public static SingleSendMailAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailAdvanceRequest self = new SingleSendMailAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SingleSendMailAdvanceRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SingleSendMailAdvanceRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public SingleSendMailAdvanceRequest setAttachments(java.util.List<SingleSendMailAdvanceRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SingleSendMailAdvanceRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public SingleSendMailAdvanceRequest setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
        return this;
    }
    public String getBccAddress() {
        return this.bccAddress;
    }

    public SingleSendMailAdvanceRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public SingleSendMailAdvanceRequest setDomainAuth(Boolean domainAuth) {
        this.domainAuth = domainAuth;
        return this;
    }
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    public SingleSendMailAdvanceRequest setFromAlias(String fromAlias) {
        this.fromAlias = fromAlias;
        return this;
    }
    public String getFromAlias() {
        return this.fromAlias;
    }

    public SingleSendMailAdvanceRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public SingleSendMailAdvanceRequest setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }
    public String getHtmlBody() {
        return this.htmlBody;
    }

    public SingleSendMailAdvanceRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public SingleSendMailAdvanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendMailAdvanceRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public SingleSendMailAdvanceRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public SingleSendMailAdvanceRequest setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
        return this;
    }
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
    }

    public SingleSendMailAdvanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendMailAdvanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendMailAdvanceRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SingleSendMailAdvanceRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SingleSendMailAdvanceRequest setTemplate(SingleSendMailAdvanceRequestTemplate template) {
        this.template = template;
        return this;
    }
    public SingleSendMailAdvanceRequestTemplate getTemplate() {
        return this.template;
    }

    public SingleSendMailAdvanceRequest setTextBody(String textBody) {
        this.textBody = textBody;
        return this;
    }
    public String getTextBody() {
        return this.textBody;
    }

    public SingleSendMailAdvanceRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public SingleSendMailAdvanceRequest setUnSubscribeFilterLevel(String unSubscribeFilterLevel) {
        this.unSubscribeFilterLevel = unSubscribeFilterLevel;
        return this;
    }
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    public SingleSendMailAdvanceRequest setUnSubscribeLinkType(String unSubscribeLinkType) {
        this.unSubscribeLinkType = unSubscribeLinkType;
        return this;
    }
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

    public static class SingleSendMailAdvanceRequestAttachments extends TeaModel {
        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("AttachmentUrl")
        public java.io.InputStream attachmentUrlObject;

        public static SingleSendMailAdvanceRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailAdvanceRequestAttachments self = new SingleSendMailAdvanceRequestAttachments();
            return TeaModel.build(map, self);
        }

        public SingleSendMailAdvanceRequestAttachments setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public SingleSendMailAdvanceRequestAttachments setAttachmentUrlObject(java.io.InputStream attachmentUrlObject) {
            this.attachmentUrlObject = attachmentUrlObject;
            return this;
        }
        public java.io.InputStream getAttachmentUrlObject() {
            return this.attachmentUrlObject;
        }

    }

    public static class SingleSendMailAdvanceRequestTemplate extends TeaModel {
        @NameInMap("TemplateData")
        public java.util.Map<String, String> templateData;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static SingleSendMailAdvanceRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailAdvanceRequestTemplate self = new SingleSendMailAdvanceRequestTemplate();
            return TeaModel.build(map, self);
        }

        public SingleSendMailAdvanceRequestTemplate setTemplateData(java.util.Map<String, String> templateData) {
            this.templateData = templateData;
            return this;
        }
        public java.util.Map<String, String> getTemplateData() {
            return this.templateData;
        }

        public SingleSendMailAdvanceRequestTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
