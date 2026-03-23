// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailRequest extends TeaModel {
    /**
     * <p>The sender address configured in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <ul>
     * <li><p>0: Random account</p>
     * </li>
     * <li><p>1: Sender address</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddressType")
    public Integer addressType;

    /**
     * <ul>
     * <li><p>1: Enables the data tracking feature.</p>
     * </li>
     * <li><p>0 (default): Disables the data tracking feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    /**
     * <p>Enables domain-level authentication.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>Use this parameter only for domain-level authentication. Ignore it for sender address-level authentication.</p>
     * <p>1\. The console creates the address \<code>domain-auth-created-by-system\\@example.com\\</code>. Do not change the prefix before the at sign (@). Replace the domain suffix with your own domain.</p>
     * <p>2\.</p>
     * <p><strong>API scenario</strong></p>
     * <p>Set \<code>AccountName\\</code> to your domain. Recipients see \<code>domain-auth-created-by-system\\@example.com\\</code> as the sender.</p>
     * <p><strong>SMTP scenario</strong></p>
     * <p>a. Use the \<code>ModifyPWByDomain\\</code> API to set a password for your domain.</p>
     * <p>b. Authenticate using your domain and the password. Set the actual sender address (\<code>mailfrom\\</code>) to a custom address, such as \<code>user\\@example.com\\</code>. Recipients see \<code>user\\@example.com\\</code> as the sender.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>Message header settings.</p>
     * <p>All fields, standard or non-standard, must follow standard header syntax. For API calls, the \<code>headers\\</code> field supports up to 10 headers. Any headers beyond this limit are ignored. SMTP does not have a header limit.</p>
     * <p>1\. Standard fields</p>
     * <p>\<code>Message-ID\\</code>, \<code>List-Unsubscribe\\</code>, \<code>List-Unsubscribe-Post\\</code></p>
     * <p>Standard fields overwrite existing values in the message header.</p>
     * <p>2\. Non-standard fields</p>
     * <p>Case-insensitive</p>
     * <p>a. Start with \<code>X-User-\\</code>. These fields are not pushed to EventBridge or Message Service. They are required only for API calls. SMTP supports any custom header.</p>
     * <p>b. Start with \<code>X-User-Notify-\\</code>. These fields are pushed to EventBridge and Message Service. They are supported by both API and SMTP.</p>
     * <p>When pushed to EventBridge or Message Service, these fields appear under the \<code>headers\\</code> object.</p>
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
     * <p>The ID of the dedicated IP address pool. If you purchased dedicated IP addresses, use this parameter to specify the egress IP address for sending the email.</p>
     * 
     * <strong>example:</strong>
     * <p>e4xxxxxe-4xx0-4xx3-8xxa-74cxxxxx1cef</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of a pre-created recipient list to which recipients have been uploaded.</p>
     * <p>Note:</p>
     * <p>The number of recipients in the list must not exceed your remaining daily quota. Otherwise, email sending fails.</p>
     * <p>Do not delete the recipient list for at least 10 minutes after triggering the task. Otherwise, email sending may fail.</p>
     * <p>This parameter is required.</p>
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
     * <p>The alias for the reply-to address.</p>
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
     * <p>The name of the email tag.</p>
     * 
     * <strong>example:</strong>
     * <p>test3</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The name of a pre-created and approved template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The filtering level. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <ul>
     * <li><p>disabled: No filtering.</p>
     * </li>
     * <li><p>default: Uses the default policy. Batch emails are filtered at the sender address level.</p>
     * </li>
     * <li><p>mailfrom: Filters at the sender address level.</p>
     * </li>
     * <li><p>mailfrom_domain: Filters at the email domain level.</p>
     * </li>
     * <li><p>edm_id: Filters at the account level.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>The type of unsubscribe link to generate. For more information, see <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe link generation and filtering mechanism</a>.</p>
     * <ul>
     * <li><p>disabled: Does not generate a link.</p>
     * </li>
     * <li><p>default: Uses the default policy. An unsubscribe link is generated when batch emails are sent from a sender address to specific domains, such as those containing the keywords &quot;gmail&quot;, &quot;yahoo&quot;, &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;, &quot;outlook&quot;, or &quot;ymail.com&quot;.</p>
     * </li>
     * </ul>
     * <p>The language of the unsubscribe link matches the recipient\&quot;s browser language setting.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("UnSubscribeLinkType")
    public String unSubscribeLinkType;

    public static BatchSendMailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMailRequest self = new BatchSendMailRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMailRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BatchSendMailRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public BatchSendMailRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public BatchSendMailRequest setDomainAuth(Boolean domainAuth) {
        this.domainAuth = domainAuth;
        return this;
    }
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    public BatchSendMailRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public BatchSendMailRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public BatchSendMailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSendMailRequest setReceiversName(String receiversName) {
        this.receiversName = receiversName;
        return this;
    }
    public String getReceiversName() {
        return this.receiversName;
    }

    public BatchSendMailRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public BatchSendMailRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public BatchSendMailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchSendMailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchSendMailRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public BatchSendMailRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public BatchSendMailRequest setUnSubscribeFilterLevel(String unSubscribeFilterLevel) {
        this.unSubscribeFilterLevel = unSubscribeFilterLevel;
        return this;
    }
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    public BatchSendMailRequest setUnSubscribeLinkType(String unSubscribeLinkType) {
        this.unSubscribeLinkType = unSubscribeLinkType;
        return this;
    }
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

}
