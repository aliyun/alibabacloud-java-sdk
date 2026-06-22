// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
    /**
     * <p>The Meta ad account ID.</p>
     * <blockquote>
     * <p>This parameter is for internal testing, is not generally available, and can be ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123123********</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <p>The message category for direct WhatsApp sending.</p>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Specify this parameter only if you are a Meta-invited customer. Otherwise, the message may fail to send.</p>
     * 
     * <strong>example:</strong>
     * <p>UTILITY</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><p><strong>whatsapp</strong></p>
     * </li>
     * <li><p><strong>messenger</strong></p>
     * </li>
     * <li><p><strong>instagram</strong></p>
     * </li>
     * <li><p><strong>telegram</strong></p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>viber</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whatsapp</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The message content, in a JSON-formatted string.</p>
     * <p><strong>Notes for WhatsApp messages:</strong></p>
     * <ul>
     * <li><p>If <code>MessageType</code> is <code>text</code>, the <code>text</code> field is required, and the <code>Caption</code> field is not supported.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>image</code>, the <code>Link</code> field is required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>video</code>, the <code>Link</code> field is required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>audio</code>, the <code>Link</code> field is required. The <code>Caption</code> field is not supported.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>document</code>, the <code>Link</code> and <code>FileName</code> fields are required. The <code>Caption</code> field is not supported.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>interactive</code>, the <code>type</code> and <code>action</code> fields are required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>contacts</code>, the <code>name</code> field is required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>location</code>, the <code>longitude</code> and <code>latitude</code> fields are required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>sticker</code>, the <code>Link</code> field is required. The <code>Caption</code> and <code>FileName</code> fields are not supported.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>reaction</code>, the <code>messageId</code> and <code>emoji</code> fields are required.</p>
     * </li>
     * </ul>
     * <p><strong>Notes for Messenger messages:</strong></p>
     * <ul>
     * <li><p>If <code>MessageType</code> is <code>text</code>, the <code>text</code> field is required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>image</code>, <code>video</code>, <code>audio</code>, or <code>document</code>, the <code>link</code> field is required.</p>
     * </li>
     * </ul>
     * <p><strong>Notes for Instagram messages:</strong></p>
     * <ul>
     * <li><p>If <code>MessageType</code> is <code>text</code>, the <code>text</code> field is required.</p>
     * </li>
     * <li><p>If <code>MessageType</code> is <code>image</code>, <code>video</code>, or <code>audio</code>, the <code>link</code> field is required.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><strong>Notes for Viber messages:</strong></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>text</code>, the <code>text</code> field is required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>image</code>, the <code>link</code> field is required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>video</code>, the <code>link</code>, <code>thumbnail</code>, <code>fileSize</code>, and <code>duration</code> fields are required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>document</code>, the <code>link</code>, <code>fileName</code>, and <code>fileType</code> fields are required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>text_button</code>, the <code>text</code>, <code>caption</code>, and <code>action</code> fields are required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>text_image_button</code>, the <code>text</code>, <code>link</code>, <code>caption</code>, and <code>action</code> fields are required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>text_video</code>, the <code>text</code>, <code>link</code>, <code>thumbnail</code>, <code>fileSize</code>, and <code>duration</code> fields are required.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>MessageType</code> is <code>text_video_button</code>, the <code>text</code>, <code>link</code>, <code>thumbnail</code>, <code>fileSize</code>, <code>duration</code>, and <code>caption</code> fields are required. The <code>action</code> field is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;text&quot;: &quot;hello,whatsapp&quot;,
     *   &quot;link&quot;: &quot;https://<em><strong><strong><strong>&quot;,
     *   &quot;caption&quot;: &quot;</strong></strong>&quot;,
     *   &quot;fileName&quot;: &quot;</strong></em>*&quot;
     * }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the message to which you are replying.</p>
     * 
     * <strong>example:</strong>
     * <p>61851ccb2f1365b16aee****</p>
     */
    @NameInMap("ContextMessageId")
    public String contextMessageId;

    /**
     * <p>The Space ID of the ISV\&quot;s sub-account. For a direct customer, this is the Instance ID. You can find the ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p><strong>Deprecated.</strong> Use <code>CustSpaceId</code> instead. The WABA ID of an ISV\&quot;s customer. For a direct customer, this is the Instance ID. You can find the ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The custom content of the fallback message. This parameter is available only on the International Site and can be ignored if you are using the China site.</p>
     * 
     * <strong>example:</strong>
     * <p>Fallback SMS</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>The duration after which a fallback is triggered. This parameter is available only on the International Site and can be ignored if you are using the China site.&lt;props=&quot;intl&quot;&gt; If a delivery receipt is not returned within the specified period, a fallback is triggered. If this parameter is omitted, a fallback is triggered only if the message fails to send or a failed delivery receipt is returned. Unit: seconds. The value must be between 60 and 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy. This parameter is available only on the International Site and can be ignored if you are using the China site.&lt;props=&quot;intl&quot;&gt; You can find the strategy ID on the <a href="https://chatapp.console.alibabacloud.com/FallbackStrategy"><strong>Fallback Policy</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>S0****</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule. This parameter is available only on the International Site and can be ignored if you are using the China site.
     * &lt;props=&quot;intl&quot;&gt;Valid values:</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>undelivered</strong>: A fallback is triggered if message delivery fails. The template and parameters must be valid at the time of sending. Blocked templates or phone numbers are not validated. This is the default rule if the parameter is empty.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>sentFailed</strong>: A fallback is triggered if the message fails parameter validation, such as for the template or template parameters. Only the existence of <code>channelType</code>, <code>type</code>, <code>messageType</code>, <code>to</code>, and <code>from</code> is strictly validated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>undelivered</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The Flow message object.</p>
     */
    @NameInMap("FlowAction")
    public SendChatappMessageRequestFlowAction flowAction;

    /**
     * <p>The sender\&quot;s number or ID.</p>
     * <ul>
     * <li><p>If <code>ChannelType</code> is <strong>whatsapp</strong>, this is the phone number registered with WhatsApp. You can find the number on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> page.</p>
     * </li>
     * <li><p>If <code>ChannelType</code> is <strong>messenger</strong>, this is the Facebook Page ID. You can find this ID on your &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Facebook Page</strong> page.</p>
     * </li>
     * <li><p>If <code>ChannelType</code> is <strong>instagram</strong>, this is the Instagram professional account ID (Account ID). You can find the ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Professional Account</strong> page.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>ChannelType</code> is <strong>viber</strong>, this is the Viber service ID (Service ID). You can find the ID on the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Service Number Management</strong> page.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861387777****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p><strong>Deprecated.</strong> A verification code used to authorize an ISV\&quot;s sub-account. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123123******</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The Viber message type. This parameter is available only on the International Site and can be ignored if you are using the China site.
     * &lt;props=&quot;intl&quot;&gt;Valid values:</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>promotion</strong>: A promotional or marketing message.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>transaction</strong>: A notification message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language of the message template. For a list of supported languages and their corresponding codes, see <a href="https://help.aliyun.com/document_detail/463420.html">language code</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the message campaign.</p>
     * <blockquote>
     * <p>This parameter is for internal testing, is not generally available, and can be ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123123********</p>
     */
    @NameInMap("MessageCampaignId")
    public String messageCampaignId;

    /**
     * <p>The message type to use when <code>Type</code> is set to <code>message</code>. The valid values vary based on the channel type:</p>
     * <details>
     * 
     * <summary>
     * 
     * <p>WHATSAPP</p>
     * </summary>
     * 
     * <ul>
     * <li><p><code>text</code>: A text message.</p>
     * </li>
     * <li><p><code>image</code>: An image message.</p>
     * </li>
     * <li><p><code>video</code>: A video message.</p>
     * </li>
     * <li><p><code>audio</code>: An audio message.</p>
     * </li>
     * <li><p><code>document</code>: A document message.</p>
     * </li>
     * <li><p><code>interactive</code>: An interactive message.</p>
     * </li>
     * <li><p><code>location</code>: A location message.</p>
     * </li>
     * <li><p><code>contacts</code>: A contacts message.</p>
     * </li>
     * <li><p><code>reaction</code>: A reaction message.</p>
     * </li>
     * <li><p><code>sticker</code>: A sticker message.</p>
     * </li>
     * <li><p><code>typing_indicator</code>: A typing indicator message.</p>
     * </li>
     * <li><p><code>pin</code>: A message to pin or unpin. This type is available only for group messages.</p>
     * </li>
     * <li><p><code>carousel</code>: A carousel message.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>VIBER</p>
     * </summary>
     * 
     * <ul>
     * <li><p><code>text</code>: A text message.</p>
     * </li>
     * <li><p><code>image</code>: An image message.</p>
     * </li>
     * <li><p><code>text_image_button</code>: A message with text, an image, and a button.</p>
     * </li>
     * <li><p><code>text_button</code>: A message with text and a button.</p>
     * </li>
     * <li><p><code>document</code>: A document message.</p>
     * </li>
     * <li><p><code>video</code>: A video message.</p>
     * </li>
     * <li><p><code>text_video</code>: A message with text and a video.</p>
     * </li>
     * <li><p><code>text_video_button</code>: A message with text, a video, and a button.</p>
     * </li>
     * <li><p><code>text_image</code>: A message with text and an image.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>MESSENGER / INSTAGRAM</p>
     * </summary>
     * 
     * <ul>
     * <li><p><code>text</code>: A text message.</p>
     * </li>
     * <li><p><code>image</code>: An image message.</p>
     * </li>
     * <li><p><code>video</code>: A video message.</p>
     * </li>
     * <li><p><code>document</code>: A document message.</p>
     * </li>
     * <li><p><code>audio</code>: An audio message.</p>
     * </li>
     * <li><p><code>interactive</code>: An interactive message.</p>
     * </li>
     * <li><p><code>couponTemplate</code>: A coupon template message.</p>
     * </li>
     * <li><p><code>regularTemplate</code>: A regular template message.</p>
     * </li>
     * <li><p><code>quickReply</code>: A quick reply message.</p>
     * </li>
     * <li><p><code>buttonTemplate</code>: A button template message.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>TELEGRAM</p>
     * </summary>
     * 
     * <ul>
     * <li><p><code>text</code>: A text message.</p>
     * </li>
     * <li><p><code>image</code>: An image message.</p>
     * </li>
     * <li><p><code>video</code>: A video message.</p>
     * </li>
     * <li><p><code>audio</code>: An audio message.</p>
     * </li>
     * <li><p><code>document</code>: A document message.</p>
     * </li>
     * <li><p><code>location</code>: A location message.</p>
     * </li>
     * <li><p><code>gif</code>: An animated GIF message.</p>
     * </li>
     * <li><p><code>sticker</code>: A sticker message.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>An array of custom data strings that are sent to your webhook when a user clicks a corresponding button.</p>
     * 
     * <strong>example:</strong>
     * <p>payloadtext1,payloadtext2,payloadtext3</p>
     */
    @NameInMap("Payload")
    public java.util.List<String> payload;

    /**
     * <p>Product information that you have uploaded to Meta. This parameter applies to WhatsApp channels only.</p>
     */
    @NameInMap("ProductAction")
    public SendChatappMessageRequestProductAction productAction;

    /**
     * <p>The recipient type. Valid values:</p>
     * <ul>
     * <li><p><code>individual</code>: A single recipient.</p>
     * </li>
     * <li><p><code>group</code>: A group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>individual</p>
     */
    @NameInMap("RecipientType")
    public String recipientType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A custom tag for the Viber message.</p>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>A custom task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The message template code. You can find the code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Template Design</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>1119***************</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name. You can find the template name on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Template Design</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The parameters for the message template.</p>
     */
    @NameInMap("TemplateParams")
    public java.util.Map<String, String> templateParams;

    /**
     * <p>The recipient\&quot;s number or ID.</p>
     * <ul>
     * <li><p>If <code>ChannelType</code> is <strong>whatsapp</strong>, this is the recipient\&quot;s phone number.</p>
     * </li>
     * <li><p>If <code>ChannelType</code> is <strong>messenger</strong>, this is a Page-Scoped User ID (PSID) generated when a user interacts with your Facebook Page.</p>
     * </li>
     * <li><p>If <code>ChannelType</code> is <strong>instagram</strong>, this is an Instagram-Scoped User ID (IGSID) generated when a user interacts with your Instagram business or creator account.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If <code>ChannelType</code> is <strong>viber</strong>, this is the recipient\&quot;s phone number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861388988****</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The token type.</p>
     * <blockquote>
     * <p>This parameter is for internal testing, is not generally available, and can be ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bearer</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    /**
     * <p>Custom tracking data for a Viber message. This parameter is available only on the International Site and can be ignored if you are using the China site.</p>
     * 
     * <strong>example:</strong>
     * <p>Tracking Data</p>
     */
    @NameInMap("TrackingData")
    public String trackingData;

    /**
     * <p>The time-to-live (TTL) for a Viber message. This parameter is available only on the International Site and can be ignored if you are using the China site.&lt;props=&quot;intl&quot;&gt; Unit: seconds. The value must be between 30 and 1209600.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p><code>template</code>: A message template approved in the console. You can send this type of message at any time.</p>
     * </li>
     * <li><p><code>message</code>: A message of any format. You can send this type of message only within 24 hours of receiving the last message from a user.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you set <code>Type</code> to <code>template</code>, you must set the <code>TemplateCode</code> parameter. If you set <code>Type</code> to <code>message</code>, you must set the <code>MessageType</code> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Type")
    public String type;

    public static SendChatappMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageRequest self = new SendChatappMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public SendChatappMessageRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SendChatappMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatappMessageRequest setContextMessageId(String contextMessageId) {
        this.contextMessageId = contextMessageId;
        return this;
    }
    public String getContextMessageId() {
        return this.contextMessageId;
    }

    public SendChatappMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public SendChatappMessageRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMessageRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMessageRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMessageRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMessageRequest setFlowAction(SendChatappMessageRequestFlowAction flowAction) {
        this.flowAction = flowAction;
        return this;
    }
    public SendChatappMessageRequestFlowAction getFlowAction() {
        return this.flowAction;
    }

    public SendChatappMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    @Deprecated
    public SendChatappMessageRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMessageRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMessageRequest setMessageCampaignId(String messageCampaignId) {
        this.messageCampaignId = messageCampaignId;
        return this;
    }
    public String getMessageCampaignId() {
        return this.messageCampaignId;
    }

    public SendChatappMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMessageRequest setPayload(java.util.List<String> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.List<String> getPayload() {
        return this.payload;
    }

    public SendChatappMessageRequest setProductAction(SendChatappMessageRequestProductAction productAction) {
        this.productAction = productAction;
        return this;
    }
    public SendChatappMessageRequestProductAction getProductAction() {
        return this.productAction;
    }

    public SendChatappMessageRequest setRecipientType(String recipientType) {
        this.recipientType = recipientType;
        return this;
    }
    public String getRecipientType() {
        return this.recipientType;
    }

    public SendChatappMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMessageRequest setTemplateParams(java.util.Map<String, String> templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public java.util.Map<String, String> getTemplateParams() {
        return this.templateParams;
    }

    public SendChatappMessageRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendChatappMessageRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public SendChatappMessageRequest setTrackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }
    public String getTrackingData() {
        return this.trackingData;
    }

    public SendChatappMessageRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public SendChatappMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class SendChatappMessageRequestFlowAction extends TeaModel {
        /**
         * <p>A collection of default flow parameters.</p>
         */
        @NameInMap("FlowActionData")
        public java.util.Map<String, ?> flowActionData;

        /**
         * <p>The custom flow token.</p>
         * 
         * <strong>example:</strong>
         * <p>kde****</p>
         */
        @NameInMap("FlowToken")
        public String flowToken;

        public static SendChatappMessageRequestFlowAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestFlowAction self = new SendChatappMessageRequestFlowAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestFlowAction setFlowActionData(java.util.Map<String, ?> flowActionData) {
            this.flowActionData = flowActionData;
            return this;
        }
        public java.util.Map<String, ?> getFlowActionData() {
            return this.flowActionData;
        }

        public SendChatappMessageRequestFlowAction setFlowToken(String flowToken) {
            this.flowToken = flowToken;
            return this;
        }
        public String getFlowToken() {
            return this.flowToken;
        }

    }

    public static class SendChatappMessageRequestProductActionSectionsProductItems extends TeaModel {
        /**
         * <p>The product ID. You can find the ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ksi3****</p>
         */
        @NameInMap("ProductRetailerId")
        public String productRetailerId;

        public static SendChatappMessageRequestProductActionSectionsProductItems build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductActionSectionsProductItems self = new SendChatappMessageRequestProductActionSectionsProductItems();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductActionSectionsProductItems setProductRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
            return this;
        }
        public String getProductRetailerId() {
            return this.productRetailerId;
        }

    }

    public static class SendChatappMessageRequestProductActionSections extends TeaModel {
        /**
         * <p>A list of product information.</p>
         */
        @NameInMap("ProductItems")
        public java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> productItems;

        /**
         * <p>The category name. You can find the name on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Title")
        public String title;

        public static SendChatappMessageRequestProductActionSections build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductActionSections self = new SendChatappMessageRequestProductActionSections();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductActionSections setProductItems(java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> productItems) {
            this.productItems = productItems;
            return this;
        }
        public java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> getProductItems() {
            return this.productItems;
        }

        public SendChatappMessageRequestProductActionSections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SendChatappMessageRequestProductAction extends TeaModel {
        /**
         * <p>A list of product categories. You can specify up to 10 categories and a total of 30 products.</p>
         */
        @NameInMap("Sections")
        public java.util.List<SendChatappMessageRequestProductActionSections> sections;

        /**
         * <p>The product catalog ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2539783.html">ListProductCatalog</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>skkks99****</p>
         */
        @NameInMap("ThumbnailProductRetailerId")
        public String thumbnailProductRetailerId;

        public static SendChatappMessageRequestProductAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductAction self = new SendChatappMessageRequestProductAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductAction setSections(java.util.List<SendChatappMessageRequestProductActionSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<SendChatappMessageRequestProductActionSections> getSections() {
            return this.sections;
        }

        public SendChatappMessageRequestProductAction setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
            this.thumbnailProductRetailerId = thumbnailProductRetailerId;
            return this;
        }
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

    }

}
