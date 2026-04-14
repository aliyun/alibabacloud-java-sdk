// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailShrinkRequest extends TeaModel {
    /**
     * <p>The sending address configured in the management console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***@example.net</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Address type. Values:</p>
     * <p>0: Random account</p>
     * <p>1: Sending address</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <p>Only supported for use with the new version of the SDK; not currently supported by openapi and signature mechanisms.</p>
     */
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

    /**
     * <p>1: Enable data tracking function</p>
     * <p>0 (default): Disable data tracking function.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>Sender alias, with a maximum length of 15 characters.</p>
     * <p>For example, if the sender alias is set to &quot;Xiaohong&quot; and the sending address is test***@example.net, the recipient will see the sending address as &quot;Xiaohong&quot; <a href="mailto:test***@example.net">test***@example.net</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Xiaohong</p>
     */
    @NameInMap("FromAlias")
    public String fromAlias;

    /**
     * <p>Currently, the standard fields that can be added to the email header are Message-ID, List-Unsubscribe, and List-Unsubscribe-Post. Standard fields will overwrite the existing values in the email header, while non-standard fields need to start with X-User- and will be appended to the email header.
     * Currently, up to 10 headers can be passed in JSON format, and both standard and non-standard fields must comply with the syntax requirements for headers.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Message-ID&quot;: &quot;<a href="mailto:msg0001@example.com">msg0001@example.com</a>&quot;,
     *   &quot;X-User-UID1&quot;: &quot;UID-1-000001&quot;,
     *   &quot;X-User-UID2&quot;: &quot;UID-2-000001&quot;
     * }</p>
     */
    @NameInMap("Headers")
    public String headers;

    /**
     * <p>Email HTML body, limited to 80K by the SDK. Note: HtmlBody and TextBody are for different types of email content, and one of them must be provided.</p>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("HtmlBody")
    public String htmlBody;

    /**
     * <p>dedicated IP pool ID. Users who have purchased an dedicated IP can use this parameter to specify the outgoing IP for this email.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Reply-to address</p>
     * 
     * <strong>example:</strong>
     * <p>test2***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    /**
     * <p>Reply-to address alias</p>
     * 
     * <strong>example:</strong>
     * <p>Xiaohong</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    /**
     * <p>Whether to enable the reply-to address configured in the management console (the status must be verified). The value range is the string <code>true</code> or <code>false</code> (not a boolean value).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReplyToAddress")
    public Boolean replyToAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Email subject, with a maximum length of 100 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subject</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>A tag created in the email push console, used to categorize batches of sent emails. You can use tags to query the sending status of each batch. Additionally, if the email tracking feature is enabled, you must use an email tag when sending emails.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>Email text body, limited to 80K by the SDK. Note: HtmlBody and TextBody are for different types of email content, and one of them must be provided.</p>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("TextBody")
    public String textBody;

    /**
     * <p>Recipient addresses. Multiple email addresses can be separated by commas, with a maximum of 100 addresses (supports mailing lists).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    /**
     * <p>Filtering level. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
     * <p>disabled: Do not filter</p>
     * <p>default: Use the default strategy, bulk addresses use the sending address level filtering</p>
     * <p>mailfrom: Sending address level filtering</p>
     * <p>mailfrom_domain: Sending domain level filtering</p>
     * <p>edm_id: Account level filtering</p>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>Type of generated unsubscribe link. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
     * <p>disabled: Do not generate</p>
     * <p>default: Use the default strategy: Generate unsubscribe links for bulk-type sending addresses to specific domains, such as those containing the keywords &quot;gmail&quot;, &quot;yahoo&quot;,</p>
     * <p>&quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,</p>
     * <p>&quot;outlook&quot;, &quot;ymail.com&quot;, etc.</p>
     * <p>zh-cn: Generate, for future content preparation</p>
     * <p>en-us: Generate, for future content preparation</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
        /**
         * <p>Only supported for use with the new version of the SDK; not currently supported by openapi and signature mechanisms.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>Only supported for use with the new version of the SDK; not currently supported by openapi and signature mechanisms.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\Downloads\test.txt</p>
         */
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
