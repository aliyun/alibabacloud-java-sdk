// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailRequest extends TeaModel {
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
    public java.util.List<SingleSendMailRequestAttachments> attachments;

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
    public SingleSendMailRequestTemplate template;

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

    public static SingleSendMailRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailRequest self = new SingleSendMailRequest();
        return TeaModel.build(map, self);
    }

    public SingleSendMailRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SingleSendMailRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public SingleSendMailRequest setAttachments(java.util.List<SingleSendMailRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SingleSendMailRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public SingleSendMailRequest setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
        return this;
    }
    public String getBccAddress() {
        return this.bccAddress;
    }

    public SingleSendMailRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public SingleSendMailRequest setDomainAuth(Boolean domainAuth) {
        this.domainAuth = domainAuth;
        return this;
    }
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    public SingleSendMailRequest setFromAlias(String fromAlias) {
        this.fromAlias = fromAlias;
        return this;
    }
    public String getFromAlias() {
        return this.fromAlias;
    }

    public SingleSendMailRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public SingleSendMailRequest setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }
    public String getHtmlBody() {
        return this.htmlBody;
    }

    public SingleSendMailRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public SingleSendMailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendMailRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public SingleSendMailRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public SingleSendMailRequest setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
        return this;
    }
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
    }

    public SingleSendMailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendMailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendMailRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SingleSendMailRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SingleSendMailRequest setTemplate(SingleSendMailRequestTemplate template) {
        this.template = template;
        return this;
    }
    public SingleSendMailRequestTemplate getTemplate() {
        return this.template;
    }

    public SingleSendMailRequest setTextBody(String textBody) {
        this.textBody = textBody;
        return this;
    }
    public String getTextBody() {
        return this.textBody;
    }

    public SingleSendMailRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public SingleSendMailRequest setUnSubscribeFilterLevel(String unSubscribeFilterLevel) {
        this.unSubscribeFilterLevel = unSubscribeFilterLevel;
        return this;
    }
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    public SingleSendMailRequest setUnSubscribeLinkType(String unSubscribeLinkType) {
        this.unSubscribeLinkType = unSubscribeLinkType;
        return this;
    }
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

    public static class SingleSendMailRequestAttachments extends TeaModel {
        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("AttachmentUrl")
        public String attachmentUrl;

        public static SingleSendMailRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailRequestAttachments self = new SingleSendMailRequestAttachments();
            return TeaModel.build(map, self);
        }

        public SingleSendMailRequestAttachments setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public SingleSendMailRequestAttachments setAttachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
            return this;
        }
        public String getAttachmentUrl() {
            return this.attachmentUrl;
        }

    }

    public static class SingleSendMailRequestTemplate extends TeaModel {
        @NameInMap("TemplateData")
        public java.util.Map<String, String> templateData;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static SingleSendMailRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailRequestTemplate self = new SingleSendMailRequestTemplate();
            return TeaModel.build(map, self);
        }

        public SingleSendMailRequestTemplate setTemplateData(java.util.Map<String, String> templateData) {
            this.templateData = templateData;
            return this;
        }
        public java.util.Map<String, String> getTemplateData() {
            return this.templateData;
        }

        public SingleSendMailRequestTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
