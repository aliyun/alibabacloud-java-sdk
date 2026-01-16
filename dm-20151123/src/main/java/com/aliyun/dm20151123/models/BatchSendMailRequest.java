// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailRequest extends TeaModel {
    /**
     * <p>The sending address configured in the management console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <ul>
     * <li>0: Random account</li>
     * <li>1: Sending address</li>
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
     * <li>1: Enable data tracking function</li>
     * <li>0 (default): Disable data tracking function</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClickTrace")
    public String clickTrace;

    @NameInMap("DomainAuth")
    public Boolean domainAuth;

    /**
     * <p>Currently, the standard fields that can be added to the email header are Message-ID, List-Unsubscribe, and List-Unsubscribe-Post. Standard fields will overwrite the existing values in the email header, while non-standard fields must start with X-User- and will be appended to the email header. Currently, up to 10 headers can be passed in JSON format, and both standard and non-standard fields must comply with the syntax requirements for headers.</p>
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
     * <p>dedicated IP pool ID. Users who have purchased an dedicated IP can use this parameter to specify the outgoing IP for this send operation.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the recipient list that has been created and uploaded with recipients. Note: The recipient list should not be deleted until at least 10 minutes after the task is triggered, otherwise it may cause sending failure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("ReceiversName")
    public String receiversName;

    /**
     * <p>Reply address</p>
     * 
     * <strong>example:</strong>
     * <p>test2***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    /**
     * <p>Alias for the reply address</p>
     * 
     * <strong>example:</strong>
     * <p>Lucy</p>
     */
    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Email tag name.</p>
     * 
     * <strong>example:</strong>
     * <p>test3</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The name of the template that has been created and approved in advance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Filtering level. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
     * <ul>
     * <li>disabled: No filtering</li>
     * <li>default: Use the default strategy, bulk addresses use sender address-level filtering</li>
     * <li>mailfrom: Sender address-level filtering</li>
     * <li>mailfrom_domain: Sender domain-level filtering</li>
     * <li>edm_id: Account-level filtering</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mailfrom_domain</p>
     */
    @NameInMap("UnSubscribeFilterLevel")
    public String unSubscribeFilterLevel;

    /**
     * <p>The type of generated unsubscribe link. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
     * <ul>
     * <li>disabled: Do not generate</li>
     * <li>default: Use the default strategy: Generate an unsubscribe link when a bulk-type sending address sends to specific domains, such as those containing keywords like &quot;gmail&quot;, &quot;yahoo&quot;,
     * &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,
     * &quot;outlook&quot;, &quot;ymail.com&quot;, etc.</li>
     * <li>zh-cn: Generate, for future content preparation</li>
     * <li>en-us: Generate, for future content preparation</li>
     * </ul>
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
