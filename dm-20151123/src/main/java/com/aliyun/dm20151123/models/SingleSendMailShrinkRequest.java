// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailShrinkRequest extends TeaModel {
    /**
     * <p>The sender address configured in the Direct Mail console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***@example.net</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The address type. Valid values:</p>
     * <p><code>0</code>: A random account.</p>
     * <p><code>1</code>: A sender address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <p>This feature is available only through the latest SDKs. It is not supported for OpenAPI calls or signature-based authentication. For more information, see <a href="https://help.aliyun.com/document_detail/2937843.html">How do I send an email with an attachment by using an SDK?</a>.</p>
     */
    @NameInMap("Attachments")
    public java.util.List<SingleSendMailShrinkRequestAttachments> attachments;

    /**
     * <ul>
     * <li><p>A comma-separated list of BCC recipients.</p>
     * </li>
     * <li><p>The system sends a copy of the email to each BCC recipient. The BCC information is hidden from all recipients, including those specified in <code>ToAddress</code> and <code>BccAddress</code>.</p>
     * </li>
     * <li><p>To protect privacy, email tracking features (such as open and click tracking) are disabled for emails sent to BCC recipients. However, billing and sending status are still tracked.</p>
     * </li>
     * <li><p>A maximum of two BCC recipients are allowed per request.</p>
     * </li>
     * </ul>
     * <p>Note: The <code>SingleSendMail</code> API operation does not support a CC field. To send carbon copies, use SMTP.</p>
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
     * <p>Specifies whether to enable click tracking. Valid values: <code>&quot;1&quot;</code> enables click tracking, and <code>&quot;0&quot;</code> disables it (default).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    /**
     * <p>Specifies whether to enable domain-level authentication.</p>
     * <ul>
     * <li><p><code>true</code></p>
     * </li>
     * <li><p><code>false</code></p>
     * </li>
     * </ul>
     * <p>This parameter is used only for domain-level authentication. Ignore it for sender address-level authentication.</p>
     * <p>1\. Create the address <code>domain-auth-created-by-system@example.com</code> in the console. The prefix must be fixed, and the suffix must be your domain.</p>
     * <p>2\.</p>
     * <p><strong>API scenario</strong></p>
     * <p>Set <code>AccountName</code> to your domain. Recipients will see the sender as <code>domain-auth-created-by-system@example.com</code>.</p>
     * <p><strong>SMTP scenario</strong></p>
     * <p>a. Call the <code>ModifyPWByDomain</code> API operation to set a password for the domain.</p>
     * <p>b. Authenticate with the domain and the configured password. Pass a custom address, such as <code>user@example.com</code>, as the actual sender in the <code>MAIL FROM</code> command. Recipients will see <code>user@example.com</code> as the sender.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>The sender name. It must be 15 characters or shorter.</p>
     * <p>For example, if you set the sender name to &quot;Xiaohong&quot; and the sender address is <code>test***@example.net</code>, the recipient sees the sender as &quot;Xiaohong&quot; \&lt;test\*\*\*@example.net&gt;.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("FromAlias")
    public String fromAlias;

    /**
     * <p>Custom email header settings.</p>
     * <p>Both standard and non-standard fields must comply with standard header syntax. You can specify up to 10 headers for an API call. Excess headers are ignored. This limit does not apply to SMTP.</p>
     * <p>1\. Standard fields</p>
     * <p><code>Message-ID</code>, <code>List-Unsubscribe</code>, <code>List-Unsubscribe-Post</code></p>
     * <p>Standard fields overwrite existing values in the email header.</p>
     * <p>2\. Non-standard fields</p>
     * <p>Case-insensitive.</p>
     * <p>a. Fields starting with <code>X-User-</code>: These are not pushed to EventBridge or Message Service (MNS). This prefix is required only for API calls, not for SMTP.</p>
     * <p>b. Fields starting with <code>X-User-Notify-</code>: These are pushed to EventBridge and MNS. This is supported for both API and SMTP calls.</p>
     * <p>When pushed to EventBridge or MNS, the header object will contain these fields.</p>
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
     * <p>Note: You must specify either <code>HtmlBody</code> or <code>TextBody</code>.</p>
     * <ul>
     * <li><p>The size of the body is limited to approximately 80 KB when passed as a URL parameter.</p>
     * </li>
     * <li><p>For recent SDKs (Java 1.4.0+, Python 3 1.4.0+, and PHP 1.4.0+), the request body is limited to approximately 8 MB.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("HtmlBody")
    public String htmlBody;

    /**
     * <p>The ID of the dedicated IP pool. If you have purchased dedicated IPs, you can use this parameter to select which dedicated IP pool to use for sending the email. For more information, see <a href="https://help.aliyun.com/document_detail/2932088.html">Dedicated IP</a>.</p>
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
     * <p>The name displayed for the reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    /**
     * <p>Specifies whether to use the default reply-to address configured in the console. This address must be verified. Valid values: true, false.</p>
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
     * <p>The subject of the email, with a maximum length of 256 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subject</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>A tag for categorizing email batches, which you can create in the Direct Mail console. Tags allow you to query the sending status of each batch and are required if you enable email tracking. The tag must be 1 to 128 characters long and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The template information for sending a templated email.</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>The text body of the email.</p>
     * <p>Note: You must specify either <code>HtmlBody</code> or <code>TextBody</code>.</p>
     * <ul>
     * <li><p>The size of the body is limited to approximately 80 KB when passed as a URL parameter.</p>
     * </li>
     * <li><p>For recent SDKs (Java 1.4.0+, Python 3 1.4.0+, and PHP 1.4.0+), the request body is limited to approximately 8 MB.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("TextBody")
    public String textBody;

    /**
     * <p>The destination email address(es). To specify multiple addresses, separate them with commas (up to 100).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    /**
     * <p>The filtering level. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p><code>disabled</code>: No filtering.</p>
     * <p><code>default</code>: Uses the default policy. For batch addresses, filtering is applied at the sender address level.</p>
     * <p><code>mailfrom</code>: Filters at the sender address level.</p>
     * <p><code>mailfrom_domain</code>: Filters at the sender domain level.</p>
     * <p><code>edm_id</code>: Filters at the account level.</p>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p><code>disabled</code>: Does not generate an unsubscribe link.</p>
     * <p><code>default</code>: Uses the default policy. For batch sender addresses, an unsubscribe link is generated when sending to specific domains containing keywords such as &quot;gmail&quot;, &quot;yahoo&quot;,</p>
     * <p>&quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,</p>
     * <p>&quot;outlook&quot;, and &quot;ymail.com&quot;. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p>The display language is automatically determined based on the recipient\&quot;s browser settings.</p>
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
         * <p>The filename of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The local file path of the attachment that the SDK will use.</p>
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
