// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageShrinkRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><p><strong>whatsapp</strong></p>
     * </li>
     * <li><p><strong>messenger</strong></p>
     * </li>
     * <li><p><strong>instagram</strong></p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;- <strong>viber</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whatsapp</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The ISV sub-customer SpaceId or direct customer instance ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV customer WABA ID. This parameter is deprecated. Use CustSpaceId instead, which is the direct customer instance ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The custom fallback content. This parameter is for the China site (Chinese). China site users can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Fallback SMS</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>The fallback trigger time. This parameter is for the international site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;If no delivery receipt is returned within the specified time, the fallback is triggered. If this parameter is not specified, the fallback is triggered only when the message fails to send or a failure status report is received. Unit: seconds. Minimum value: 60. Maximum value: 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The fallback policy ID. This parameter is for the China site (Chinese). China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;You can view the policy ID on the <a href="https://chatapp.console.alibabacloud.com/FallbackStrategy"><strong>Fallback Policy</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>S0****</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule. This parameter is for the international site. China site users can ignore this parameter.
     * &lt;props=&quot;intl&quot;&gt;Valid values:
     * &lt;props=&quot;intl&quot;&gt;- <strong>undelivered</strong>: the fallback is triggered when the message cannot be delivered to the device. During sending, the template and parameters must pass validation. Blocked templates or blocked numbers are not validated. This rule is used by default if the parameter value is empty.
     * &lt;props=&quot;intl&quot;&gt;- <strong>sentFailed</strong>: the fallback is triggered when validation of the template or template variables fails. Only channelType, type, messageType, to, and from (whether it exists) are strictly validated.</p>
     * 
     * <strong>example:</strong>
     * <p>undelivered</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The sender phone number.</p>
     * <ul>
     * <li>If ChannelType is <strong>whatsapp</strong>, this is the phone number registered and bindng with WhatsApp. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> page.</li>
     * <li>If ChannelType is <strong>messenger</strong>, this is the Page ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Public Page</strong> page.</li>
     * <li>If ChannelType is <strong>instagram</strong>, this is the Instagram professional Account ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Professional Account</strong> page.
     * &lt;props=&quot;intl&quot;&gt;- If ChannelType is <strong>viber</strong>, this is the Viber Service ID. You can view it on the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Service ID Management</strong> page.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861387777****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code used to verify whether a RAM user is authorized by the ISV. This parameter is deprecated and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikd****</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The Viber message type. This parameter is for the international site. China site users can ignore this parameter.
     * &lt;props=&quot;intl&quot;&gt;Valid values:
     * &lt;props=&quot;intl&quot;&gt;- <strong>pormotion</strong>: marketing or promotional messages.
     * &lt;props=&quot;intl&quot;&gt;- <strong>transaction</strong>: notification messages.</p>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language. For a list of language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of recipient phone numbers.</p>
     */
    @NameInMap("SenderList")
    public String senderListShrink;

    /**
     * <p>The tag information. Custom tag information for Viber message sending.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The custom task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The template code. You can view the template code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>1119***************</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name. You can view the template name on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The timeout period for Viber message sending. This parameter is for the international site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;Unit: seconds. Valid values: 30 to 1209600.</p>
     * 
     * <strong>example:</strong>
     * <p>46</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static SendChatappMassMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageShrinkRequest self = new SendChatappMassMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMassMessageShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public SendChatappMassMessageShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMassMessageShrinkRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMassMessageShrinkRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMassMessageShrinkRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMassMessageShrinkRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMassMessageShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    @Deprecated
    public SendChatappMassMessageShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMassMessageShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMassMessageShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMassMessageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMassMessageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMassMessageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMassMessageShrinkRequest setSenderListShrink(String senderListShrink) {
        this.senderListShrink = senderListShrink;
        return this;
    }
    public String getSenderListShrink() {
        return this.senderListShrink;
    }

    public SendChatappMassMessageShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMassMessageShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMassMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMassMessageShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMassMessageShrinkRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

}
