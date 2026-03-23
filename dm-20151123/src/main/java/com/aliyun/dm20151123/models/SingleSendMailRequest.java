// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailRequest extends TeaModel {
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
     * <p>0: Random account</p>
     * <p>1: Sender address</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <p>This feature is available only in the latest software development kit (SDK). It is not supported by OpenAPI or signature mechanisms. For more information, see <a href="">How do I send an email with attachments using an SDK?</a>.</p>
     */
    @NameInMap("Attachments")
    public java.util.List<SingleSendMailRequestAttachments> attachments;

    /**
     * <ul>
     * <li><p>The list of blind carbon copy (BCC) recipients.</p>
     * </li>
     * <li><p>A copy of the email is sent to each BCC address. The BCC information is not visible to any recipient, including those in the ToAddress and BccAddress fields.</p>
     * </li>
     * <li><p>To protect the privacy of BCC recipients, email tracking is disabled by default for emails sent to BCC addresses. This means that behavioral data, such as open rates and click-through rates, is not recorded for BCC emails. However, billing, sending details, and sending status statistics are the same as for regular emails.</p>
     * </li>
     * <li><p>You can specify up to two BCC recipients for each email.</p>
     * </li>
     * </ul>
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
     * <p>1: Enables data tracking.</p>
     * <p>0 (default): Disables data tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    /**
     * <p>Enable domain-level authentication.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>Use this only for domain-level authentication. Ignore it for sender address-level authentication.</p>
     * <p>1\. Create the \<code>domain-auth-created-by-system\\@example.com\\</code> address in the console. Keep the prefix before the at sign (@) fixed and use your own domain as the suffix.</p>
     * <p>2\.</p>
     * <p><strong>API scenario</strong></p>
     * <p>Set \<code>AccountName\\</code> to your domain. The recipient sees the sender as \<code>domain-auth-created-by-system\\@example.com\\</code>.</p>
     * <p><strong>SMTP scenario</strong></p>
     * <p>a. Set the domain password using the \<code>ModifyPWByDomain\\</code> API.</p>
     * <p>b. Authenticate using the domain and the set password. For the actual sender, pass a custom address, such as \<code>user\\@example.com\\</code>, in the \<code>mailfrom\\</code> field. The recipient sees the sender as \<code>user\\@example.com\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>The nickname of the sender. The nickname must be fewer than 15 characters.</p>
     * <p>For example, if you set the nickname to &quot;Xiao Hong&quot; and the sender address is test\<em>\</em>\*@example.net, the recipient sees the sender as &quot;Xiao Hong&quot; \&lt;test\*\*\*@example.net&gt;.</p>
     * 
     * <strong>example:</strong>
     * <p>小红</p>
     */
    @NameInMap("FromAlias")
    public String fromAlias;

    /**
     * <p>Message header settings</p>
     * <p>Both standard and non-standard fields must follow the syntax rules for message headers. The API supports a maximum of 10 headers in the headers field. Any headers exceeding this limit are ignored. SMTP, however, does not have this limit.</p>
     * <p>1\. Standard fields</p>
     * <p>Message-ID, List-Unsubscribe, List-Unsubscribe-Post</p>
     * <p>Standard fields overwrite existing values in the message header.</p>
     * <p>2\. Non-standard fields</p>
     * <p>Case-insensitive</p>
     * <p>a. Fields that start with X-User- (These are not pushed to the EventBridge event bus or Message Service MNS. They are required only for the API, whereas SMTP supports any custom header.)</p>
     * <p>b. Fields that start with X-User-Notify- (These are pushed to the EventBridge event bus and Message Service MNS, and are supported by both the API and SMTP.)</p>
     * <p>When pushed to EventBridge or MNS, these fields appear in the header field.</p>
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
     * <p>Note: Specify HtmlBody or TextBody.</p>
     * <ul>
     * <li><p>The size of the parameter passed in a URL is limited to approximately 80 KB.</p>
     * </li>
     * <li><p>The new SDK limits the body parameter to approximately 8 MB (Java 1.4.0 and later, Python 3 1.4.0 and later, PHP 1.4.0 and later).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("HtmlBody")
    public String htmlBody;

    /**
     * <p>The ID of the dedicated IP address pool. If you purchased dedicated IP addresses, use this parameter to specify the outbound IP address for the current email. For more information, see <a href="">Dedicated IPs</a>.</p>
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
     * <p>The nickname of the reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>小红</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    /**
     * <p>Specifies whether to use the reply-to address configured in the console. The reply-to address must be verified. Valid values: true and false.</p>
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
     * <p>The subject of the email. The subject cannot exceed 256 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subject</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The email tag that you create in the Direct Mail console. Use tags to classify email batches and query the sending status of each batch. If email tracking is enabled, you must specify an email tag.
     * The tag can be 1 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The template information for sending template-based emails.</p>
     */
    @NameInMap("Template")
    public SingleSendMailRequestTemplate template;

    /**
     * <p>The text body of the email.</p>
     * <p>Note: Specify HtmlBody or TextBody.</p>
     * <ul>
     * <li><p>The size of the parameter passed in a URL is limited to approximately 80 KB.</p>
     * </li>
     * <li><p>The new SDK limits the body parameter to approximately 8 MB (Java 1.4.0 and later, Python 3 1.4.0 and later, PHP 1.4.0 and later).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("TextBody")
    public String textBody;

    /**
     * <p>The destination address. To specify multiple addresses, separate them with commas (,). You can specify a maximum of 100 addresses. Recipient groups are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    /**
     * <p>The filtering level. For more information, see <a href="">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p>disabled: No filtering.</p>
     * <p>default: The default policy is used. Batch addresses are filtered at the sender address level.</p>
     * <p>mailfrom: Filters at the sender address level.</p>
     * <p>mailfrom_domain: Filters at the email domain level.</p>
     * <p>edm_id: Filters at the account level.</p>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>disabled: No link is generated.</p>
     * <p>default: The default policy is used. An unsubscribe link is generated for batch emails sent to specific domains, such as domains that contain keywords like &quot;gmail&quot;, &quot;yahoo&quot;,
     * &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,
     * &quot;outlook&quot;, or &quot;ymail.com&quot;. For more information, see <a href="">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p>The display language is automatically detected based on the recipient\&quot;s browser settings.</p>
     * <p>&quot;outlook&quot;, or &quot;ymail.com&quot;. For more information, see <a href="">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <p>The display language is automatically detected based on the recipient\&quot;s browser settings.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
        /**
         * <p>This feature is available only in the latest SDK. It is not supported by OpenAPI or signature mechanisms.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>This feature is available only in the latest SDK. It is not supported by OpenAPI or signature mechanisms.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\Downloads\test.txt</p>
         */
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
        /**
         * <p>The variables and their values in the template.</p>
         */
        @NameInMap("TemplateData")
        public java.util.Map<String, String> templateData;

        /**
         * <p>The template ID.</p>
         * 
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
