// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailShrinkRequest extends TeaModel {
    /**
     * <p>The sender address configured in the management console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>0: random account</li>
     * <li>1: sender address.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>1: Enables data tracking.</li>
     * <li>0 (default): Disables data tracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    /**
     * <p>Specifies whether to enable domain-level authentication.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Use this parameter only for domain-level authentication. Ignore it for sender address-level authentication.</p>
     * <ol>
     * <li><p>Create the address <a href="mailto:domain-auth-created-by-system@example.com">domain-auth-created-by-system@example.com</a> in the console. Keep the prefix before @ unchanged and replace the suffix with your own domain name.</p>
     * </li>
     * <li></li>
     * </ol>
     * <p><strong>API scenario</strong></p>
     * <p>Set AccountName to the domain name. The recipient sees <a href="mailto:domain-auth-created-by-system@example.com">domain-auth-created-by-system@example.com</a> as the sender.</p>
     * <p><strong>SMTP scenario</strong></p>
     * <p>a. Call the ModifyPWByDomain operation to set the domain password.</p>
     * <p>b. Authenticate with the domain name and the configured password. Pass a custom address such as <a href="mailto:user@example.com">user@example.com</a> as the actual sender (mailfrom). The recipient sees <a href="mailto:user@example.com">user@example.com</a> as the sender.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>The email header settings.</p>
     * <p>Both standard and non-standard fields must comply with the syntax requirements for headers defined in the standard. A maximum of 10 headers can be passed through the headers field when sending emails via API. Headers that exceed this limit are ignored. SMTP has no such limit.</p>
     * <ol>
     * <li>Standard fields</li>
     * </ol>
     * <p>Message-ID, List-Unsubscribe, List-Unsubscribe-Post</p>
     * <p>Standard fields overwrite the original values in the email header.</p>
     * <ol start="2">
     * <li>Non-standard fields</li>
     * </ol>
     * <p>Case-insensitive.</p>
     * <p>a. Fields prefixed with X-User- (not pushed to EventBridge or Message Service (MNS). This restriction applies only to API. SMTP allows any custom fields.)</p>
     * <p>b. Fields prefixed with X-User-Notify- (pushed to EventBridge and Message Service (MNS). Both API and SMTP are supported.)</p>
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
     * <p>The ID of the dedicated IP address pool. Users who have purchased dedicated IP addresses can use this parameter to specify the outbound IP address for this email sending task.</p>
     * 
     * <strong>example:</strong>
     * <p>e4xxxxxe-4xx0-4xx3-8xxa-74cxxxxx1cef</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recipient list. The number of recipients cannot exceed 100. Specify this parameter or ReceiversName. If both Receivers and ReceiversName are specified, ReceiversName takes precedence.</p>
     * <p>Example: [{&quot;To&quot;:[&quot;<a href="mailto:Jackie@example.com">Jackie@example.com</a>&quot;],&quot;TemplateData&quot;:{&quot;UserName&quot;:&quot;Jackie&quot;}},{&quot;To&quot;:[&quot;<a href="mailto:Tom@example.com">Tom@example.com</a>&quot;],&quot;TemplateData&quot;:{&quot;UserName&quot;:&quot;Tom&quot;}}].</p>
     */
    @NameInMap("Receivers")
    public String receiversShrink;

    /**
     * <p>The name of a pre-created recipient list that has recipients uploaded.</p>
     * <p>Note:</p>
     * <p>The number of recipients in the list must not exceed the remaining daily quota. Otherwise, the email sending fails.</p>
     * <p>Do not delete the recipient list until at least 10 minutes after the task is triggered. Otherwise, the email sending may fail.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("ReceiversName")
    public String receiversName;

    /**
     * <p>The reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>test2***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    /**
     * <p>The alias of the reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>小红</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag name of the email.</p>
     * 
     * <strong>example:</strong>
     * <p>test3</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The custom email content. You can directly specify the content without creating a template in advance. Specify this parameter or TemplateName. If both TemplateContent and TemplateName are specified, TemplateName takes precedence.</p>
     */
    @NameInMap("TemplateContent")
    public String templateContentShrink;

    /**
     * <p>The name of a pre-created and approved template.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The filtering level. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.
     * Valid values:</p>
     * <ul>
     * <li>disabled: No filtering is applied.</li>
     * <li>default: The default policy is used. Batch addresses are filtered at the sender address level.</li>
     * <li>mailfrom: Filtering at the sender address level.</li>
     * <li>mailfrom_domain: Filtering at the sender domain level.</li>
     * <li>edm_id: Filtering at the account level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>The type of the generated unsubscribe link. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.
     * Valid values:</p>
     * <ul>
     * <li>disabled: No unsubscribe link is generated.</li>
     * <li>default: The default policy is used. An unsubscribe link is generated when emails are sent from a batch-type sender address to specific domains that contain keywords such as &quot;gmail&quot;, &quot;yahoo&quot;, &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;, &quot;outlook&quot;, or &quot;ymail.com&quot;.</li>
     * </ul>
     * <p>The display language is automatically determined based on the recipient\&quot;s browser settings.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("UnSubscribeLinkType")
    public String unSubscribeLinkType;

    public static BatchSendMailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMailShrinkRequest self = new BatchSendMailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMailShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BatchSendMailShrinkRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public BatchSendMailShrinkRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public BatchSendMailShrinkRequest setDomainAuth(Boolean domainAuth) {
        this.domainAuth = domainAuth;
        return this;
    }
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    public BatchSendMailShrinkRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public BatchSendMailShrinkRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public BatchSendMailShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSendMailShrinkRequest setReceiversShrink(String receiversShrink) {
        this.receiversShrink = receiversShrink;
        return this;
    }
    public String getReceiversShrink() {
        return this.receiversShrink;
    }

    public BatchSendMailShrinkRequest setReceiversName(String receiversName) {
        this.receiversName = receiversName;
        return this;
    }
    public String getReceiversName() {
        return this.receiversName;
    }

    public BatchSendMailShrinkRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public BatchSendMailShrinkRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public BatchSendMailShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchSendMailShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchSendMailShrinkRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public BatchSendMailShrinkRequest setTemplateContentShrink(String templateContentShrink) {
        this.templateContentShrink = templateContentShrink;
        return this;
    }
    public String getTemplateContentShrink() {
        return this.templateContentShrink;
    }

    public BatchSendMailShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public BatchSendMailShrinkRequest setUnSubscribeFilterLevel(String unSubscribeFilterLevel) {
        this.unSubscribeFilterLevel = unSubscribeFilterLevel;
        return this;
    }
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    public BatchSendMailShrinkRequest setUnSubscribeLinkType(String unSubscribeLinkType) {
        this.unSubscribeLinkType = unSubscribeLinkType;
        return this;
    }
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

}
