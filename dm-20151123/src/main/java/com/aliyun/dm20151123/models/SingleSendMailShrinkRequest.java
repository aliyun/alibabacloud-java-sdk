// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailShrinkRequest extends TeaModel {
    /**
     * <p>The sender address configured in the management console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***@example.net</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The address type. Valid values:</p>
     * <ul>
     * <li>0: random account</li>
     * <li>1: sender address</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <p>Supported only when using the new SDK. Not supported through OpenAPI or signature mechanism methods. For more information, refer to <a href="https://help.aliyun.com/document_detail/2937843.html">How do I send emails with attachments through the SDK?</a>.</p>
     */
    @NameInMap("Attachments")
    public java.util.List<SingleSendMailShrinkRequestAttachments> attachments;

    /**
     * <ul>
     * <li>Specifies the BCC (blind carbon copy) recipient list for the email.</li>
     * <li>The system sends a copy identical to the main email content to each BCC address. The BCC information is not visible to any recipients (including ToAddress and BccAddress).</li>
     * <li>To protect the privacy of BCC recipients, email tracking features are disabled by default for BCC emails. This means the system does not record behavioral data such as open rates or click-through rates for BCC emails. However, billing for sending volume, sending details, and sending status statistics remain consistent with regular emails.</li>
     * <li>A maximum of 2 BCC recipients can be specified per send.</li>
     * </ul>
     * <p>Note: The SingleSendMail operation does not support the Cc (carbon copy) field. Use SMTP if you need this feature.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:1@example.com">1@example.com</a>,<a href="mailto:2@example.com">2@example.com</a></p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("BccAddress")
    public String bccAddress;

    /**
     * <p>Specifies whether to enable data tracking. Valid values:</p>
     * <ul>
     * <li>1: Enable data tracking.</li>
     * <li>0 (default): Disable data tracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    /**
     * <p>Specifies whether to enable domain-level authentication. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Use this parameter only for domain-level authentication. Ignore it for sender address-level authentication.</p>
     * <ol>
     * <li><p>Create the address <a href="mailto:domain-auth-created-by-system@example.com">domain-auth-created-by-system@example.com</a> in the console. Keep the prefix before @ unchanged and use your own domain name as the suffix.</p>
     * </li>
     * <li></li>
     * </ol>
     * <p><strong>API scenario</strong></p>
     * <p>Set AccountName to a custom sender address for the domain. The recipient sees the custom sender address as the sender.</p>
     * <p><strong>SMTP scenario</strong></p>
     * <p>a. Set the domain password through the ModifyPWByDomain operation.</p>
     * <p>b. Authenticate using the domain name and the configured password. Pass a custom address such as <a href="mailto:user@example.com">user@example.com</a> as the actual sender (mailfrom). The recipient sees <a href="mailto:user@example.com">user@example.com</a> as the sender.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>The sender nickname. The value cannot exceed 15 characters in length.</p>
     * <p>For example, if the sender nickname is set to &quot;Jane&quot; and the sender address is test***@example.net, the recipient sees the sender address as &quot;Jane&quot; test***@example.net.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("FromAlias")
    public String fromAlias;

    /**
     * <p>The email header settings.</p>
     * <p>Both standard and non-standard fields must comply with the syntax requirements for headers defined in the standard. A maximum of 10 headers can be passed through the headers field when sending emails via API. Headers exceeding this limit are ignored. SMTP has no such limit.</p>
     * <ol>
     * <li>Standard fields</li>
     * </ol>
     * <p>Message-ID, List-Unsubscribe, List-Unsubscribe-Post</p>
     * <p>Standard fields overwrite the original values in the email header.</p>
     * <ol start="2">
     * <li>Non-standard fields</li>
     * </ol>
     * <p>Case-insensitive.</p>
     * <p>a. Fields prefixed with X-User- (not pushed to EventBridge or Message Service MNS. This is an API-only requirement. SMTP allows any custom fields.)</p>
     * <p>b. Fields prefixed with X-User-Notify- (pushed to EventBridge and Message Service MNS. Both API and SMTP are supported.)</p>
     * <p>When pushed to EventBridge or MNS, these fields are included under the header field.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Message-ID&quot;: &quot;<a href="mailto:d52ce63e-a0d5-4f95-b6a9-e1256a44f5fb@example.net">d52ce63e-a0d5-4f95-b6a9-e1256a44f5fb@example.net</a>&quot;,
     *       &quot;X-User-UID1&quot;: &quot;UID-1-000001&quot;,
     *       &quot;X-User-UID2&quot;: &quot;UID-2-000001&quot;,
     *       &quot;X-User-Notify-UID1&quot;: &quot;UID-3-000001&quot;,
     *       &quot;X-User-Notify-UID2&quot;: &quot;UID-4-000001&quot;</p>
     * <p>}</p>
     */
    @NameInMap("Headers")
    public String headers;

    /**
     * <p>The HTML body of the email.</p>
     * <p>Note: HtmlBody and TextBody are used for different types of email content. You must specify one of them.</p>
     * <ul>
     * <li>The size limit for URL-based parameter passing is approximately 80 KB.</li>
     * <li>The size limit for Body-based parameter passing with the new SDK is approximately 8 MB (Java 1.4.0 or later, Python3 1.4.0 or later, PHP 1.4.0 or later).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("HtmlBody")
    public String htmlBody;

    /**
     * <p>The ID of the dedicated IP address pool. Users who have purchased dedicated IP addresses can use this parameter to specify the outbound IP address for this email. For more information, refer to <a href="https://help.aliyun.com/document_detail/2932088.html">Dedicated IP</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>e4xxxxxe-4xx0-4xx3-8xxa-74cxxxxx1cef</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>test2***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    /**
     * <p>The reply-to address nickname.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    /**
     * <p>Specifies whether to use the reply-to address configured in the management console (the address must be verified). Valid values: true or false.</p>
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
     * <p>The email subject. The value cannot exceed 256 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subject</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The tag created in the DirectMail console. Tags are used to categorize email batches. You can query the sending status of each batch by tag. If the email tracking feature is enabled, you must use an email tag when sending emails.
     * The value must be 1 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The template information for template-based sending.</p>
     * <p>When sending with a template, the HtmlBody and TextBody values are ignored.</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>The text body of the email.</p>
     * <p>Note: HtmlBody and TextBody are used for different types of email content. You must specify one of them.</p>
     * <ul>
     * <li>The size limit for URL-based parameter passing is approximately 80 KB.</li>
     * <li>The size limit for Body-based parameter passing with the new SDK is approximately 8 MB (Java 1.4.0 or later, Python3 1.4.0 or later, PHP 1.4.0 or later).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("TextBody")
    public String textBody;

    /**
     * <p>The destination address. You can specify multiple email addresses separated by commas. A maximum of 100 addresses are supported (mailing lists are supported).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    /**
     * <p>The filtering level. For more information, refer to <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>disabled: No filtering is applied.</li>
     * <li>default: The default policy is used. Batch addresses use sender address-level filtering.</li>
     * <li>mailfrom: Sender address-level filtering.</li>
     * <li>mailfrom_domain: Sender domain-level filtering.</li>
     * <li>edm_id: Account-level filtering.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>The type of unsubscribe link. Valid values:</p>
     * <ul>
     * <li>disabled: No unsubscribe link is generated.</li>
     * <li>default: The default policy is used. An unsubscribe link is generated when emails are sent from batch-type sender addresses to specific domains, such as those containing keywords &quot;gmail&quot;, &quot;yahoo&quot;, &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;, &quot;outlook&quot;, or &quot;ymail.com&quot;. For more information, refer to <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</li>
     * </ul>
     * <p>The display language is automatically detected based on the recipient\&quot;s browser settings.</p>
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
         * <p>Supported only when using the new SDK. Not supported through OpenAPI or signature mechanism methods.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>Supported only when using the new SDK. Not supported through OpenAPI or signature mechanism methods.</p>
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
