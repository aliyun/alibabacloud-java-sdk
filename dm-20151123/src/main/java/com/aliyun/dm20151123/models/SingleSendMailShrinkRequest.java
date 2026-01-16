// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailShrinkRequest extends TeaModel {
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
    public java.util.List<SingleSendMailShrinkRequestAttachments> attachments;

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
    public String templateShrink;

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

    public static SingleSendMailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailShrinkRequest self = new SingleSendMailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SingleSendMailShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SingleSendMailShrinkRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public SingleSendMailShrinkRequest setAttachments(java.util.List<SingleSendMailShrinkRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SingleSendMailShrinkRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public SingleSendMailShrinkRequest setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
        return this;
    }
    public String getBccAddress() {
        return this.bccAddress;
    }

    public SingleSendMailShrinkRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public SingleSendMailShrinkRequest setDomainAuth(Boolean domainAuth) {
        this.domainAuth = domainAuth;
        return this;
    }
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    public SingleSendMailShrinkRequest setFromAlias(String fromAlias) {
        this.fromAlias = fromAlias;
        return this;
    }
    public String getFromAlias() {
        return this.fromAlias;
    }

    public SingleSendMailShrinkRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public SingleSendMailShrinkRequest setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }
    public String getHtmlBody() {
        return this.htmlBody;
    }

    public SingleSendMailShrinkRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public SingleSendMailShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendMailShrinkRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public SingleSendMailShrinkRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public SingleSendMailShrinkRequest setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
        return this;
    }
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
    }

    public SingleSendMailShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendMailShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendMailShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SingleSendMailShrinkRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SingleSendMailShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public SingleSendMailShrinkRequest setTextBody(String textBody) {
        this.textBody = textBody;
        return this;
    }
    public String getTextBody() {
        return this.textBody;
    }

    public SingleSendMailShrinkRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public SingleSendMailShrinkRequest setUnSubscribeFilterLevel(String unSubscribeFilterLevel) {
        this.unSubscribeFilterLevel = unSubscribeFilterLevel;
        return this;
    }
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    public SingleSendMailShrinkRequest setUnSubscribeLinkType(String unSubscribeLinkType) {
        this.unSubscribeLinkType = unSubscribeLinkType;
        return this;
    }
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

    public static class SingleSendMailShrinkRequestAttachments extends TeaModel {
        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("AttachmentUrl")
        public String attachmentUrl;

        public static SingleSendMailShrinkRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailShrinkRequestAttachments self = new SingleSendMailShrinkRequestAttachments();
            return TeaModel.build(map, self);
        }

        public SingleSendMailShrinkRequestAttachments setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public SingleSendMailShrinkRequestAttachments setAttachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
            return this;
        }
        public String getAttachmentUrl() {
            return this.attachmentUrl;
        }

    }

}
