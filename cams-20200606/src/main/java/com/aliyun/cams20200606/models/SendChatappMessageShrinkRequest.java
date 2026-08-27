// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>The Meta ad account ID.</p>
     * <blockquote>
     * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123123********</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <p>The message type (for WhatsApp direct send).</p>
     * <blockquote>
     * <p>Warning: Do not specify this parameter if you are not a Meta-invited customer. Otherwise, message sending fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UTILITY</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The channel type. Valid values:  </p>
     * <ul>
     * <li><p><strong>whatsapp</strong> </p>
     * </li>
     * <li><p><strong>messenger</strong> </p>
     * </li>
     * <li><p><strong>instagram</strong></p>
     * </li>
     * <li><p><strong>telegram</strong></p>
     * </li>
     * <li><p><strong>line</strong></p>
     * </li>
     * <li><p><strong>telegram</strong></p>
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
     * <p>The message content.</p>
     * <details>
     * <summary>WhatsApp message notes:</summary>
     * 
     * <ul>
     * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required and the <strong>Caption</strong> field must not be specified.</li>
     * <li>When <strong>messageType</strong> is <strong>image</strong>, the <strong>Link</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>video</strong>, the <strong>Link</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>audio</strong>, the <strong>Link</strong> field is required and the <strong>Caption</strong> field is invalid.</li>
     * <li>When <strong>messageType</strong> is <strong>document</strong>, the <strong>Link</strong> and <strong>FileName</strong> fields are required and the <strong>Caption</strong> field is invalid.</li>
     * <li>When <strong>messageType</strong> is <strong>interactive</strong>, the <strong>type</strong> and <strong>action</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>contacts</strong>, the <strong>name</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>location</strong>, the <strong>longitude</strong> and <strong>latitude</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>sticker</strong>, the <strong>Link</strong> field is required and the <strong>Caption</strong> and <strong>FileName</strong> fields are invalid.</li>
     * <li>When <strong>messageType</strong> is <strong>reaction</strong>, the <strong>messageId</strong> and <strong>emoji</strong> fields are required.</details></li>
     * </ul>
     * <details>
     * <summary>Messenger message notes:</summary>
     * 
     * <ul>
     * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, <strong>audio</strong>, or <strong>document</strong>, the <strong>link</strong> field is required.</details></li>
     * </ul>
     * <details>
     * <summary>Instagram message notes:</summary>
     * 
     * <ul>
     * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, or <strong>audio</strong>, the <strong>link</strong> field is required.</details></li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <details>
     * <summary>Viber message notes:</summary>
     * 
     * <ul>
     * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>image</strong>, the <strong>link</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>video</strong>, the <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>document</strong>, the <strong>link</strong>, <strong>fileName</strong>, and <strong>fileType</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>text_button</strong>, the <strong>text</strong>, <strong>caption</strong>, and <strong>action</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>text_image_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>caption</strong>, and <strong>action</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>text_video</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>text_video_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, <strong>duration</strong>, and <strong>caption</strong> fields are required, and the <strong>action</strong> field must not be empty.</details></li>
     * </ul>
     * <details>
     * <summary>Telegram message notes:</summary>
     * 
     * <ul>
     * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, <strong>audio</strong>, <strong>gif</strong>, or <strong>sticker</strong>, the <strong>link</strong> field is required.</li>
     * <li>When <strong>messageType</strong> is <strong>location</strong>, the <strong>latitude</strong> and <strong>longitude</strong> fields are required.</li>
     * <li>When <strong>messageType</strong> is <strong>interactive</strong>, the <strong>type</strong> field is required. You can send various Telegram message types. Example: {&quot;type&quot;: &quot;sendPhoto&quot;, &quot;sendPhoto&quot;: {&quot;photo&quot;:&quot;<a href="http://img.png%22,%22caption%22:%2221%22%7D%7D">http://img.png&quot;,&quot;caption&quot;:&quot;21&quot;}}</a>. This can be used to send a Photo type message. For more information about message types, see <a href="https://core.telegram.org/bots/api#sendphoto">Telegram message body</a>.</details></li>
     * </ul>
     * <details>
     * <summary>LINE message notes:</summary>
     * 
     * <ul>
     * <li><p>When <strong>messageType</strong> is <strong>text</strong> or <strong>textV2</strong>, the <strong>text</strong> field is required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>image</strong> or <strong>video</strong>, the <strong>link</strong> and <strong>previewImageUrl</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>audio</strong>, the <strong>link</strong> and <strong>duration</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>buttons</strong> or <strong>confirm</strong>, the <strong>text</strong> and <strong>actions</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>carousel</strong> or <strong>imageCarousel</strong>, the <strong>columns</strong> field is required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>quickReply</strong>, the <strong>text</strong> and <strong>items</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>sticker</strong>, the <strong>packageId</strong> and <strong>stickerId</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>location</strong>, the <strong>title</strong>, <strong>address</strong>, <strong>latitude</strong>, and <strong>longitude</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>coupon</strong>, the <strong>couponId</strong> field is required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>imagemap</strong>, the <strong>baseUrl</strong> and <strong>altText</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>flex</strong>, the <strong>contents</strong> and <strong>altText</strong> fields are required.</p>
     * </li>
     * <li><p>When <strong>messageType</strong> is <strong>interactive</strong>, you can pass in message formats supported by LINE:</p>
     * <ul>
     * <li>To send a single message, the <strong>type</strong> field is required, and other fields follow the LINE message body format. Example: {&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;test&quot;}</li>
     * <li>To send multiple messages (LINE supports up to 5 messages at a time), the <strong>messages</strong> field is required. Example: {&quot;messages&quot;: [{&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;test&quot;}, {&quot;type&quot;: &quot;image&quot;, &quot;originalContentUrl&quot;: &quot;<a href="http://img.png">http://img.png</a>&quot;, &quot;previewImageUrl&quot;: &quot;<a href="http://img2.png%22%7D%5D%7D">http://img2.png&quot;}]}</a></li>
     * <li>For more information, see <a href="https://developers.line.biz/en/reference/messaging-api/#message-objects">LINE message body</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </details>
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
     * <p>The ID of the message to reply to. This is the ID of a previously sent or received message.</p>
     * 
     * <strong>example:</strong>
     * <p>61851ccb2f1365b16aee****</p>
     */
    @NameInMap("ContextMessageId")
    public String contextMessageId;

    /**
     * <p>The SpaceId of the ISV sub-customer or the instance ID of a direct customer. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV customer WABA ID. </p>
     * <blockquote>
     * <p>This parameter is deprecated. Use CustSpaceId instead.</p>
     * <ul>
     * <li>You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The custom fallback content. This parameter is for the China International site. China site users can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Fallback SMS</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>The fallback trigger time. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;If the message does not return a delivered receipt within the specified time, fallback is triggered. If this parameter is not specified, fallback is triggered only when the message fails to send or a failure status report is received. Unit: seconds. Minimum value: 60. Maximum value: 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The fallback policy ID. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;You can view the policy ID on the <a href="https://chatapp.console.alibabacloud.com/FallbackStrategy"><strong>Fallback Strategy</strong></a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>S0****</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule. This parameter is for the China International site. China site users can ignore this parameter.
     * &lt;props=&quot;intl&quot;&gt;Valid values:
     * &lt;props=&quot;intl&quot;&gt;- <strong>undelivered</strong>: fallback is triggered when the message cannot be delivered to the endpoint (template and parameter validation must pass during the sending state; blocked templates or numbers are not validated). This rule is used by default when the parameter value is empty.
     * &lt;props=&quot;intl&quot;&gt;- <strong>sentFailed</strong>: fallback is also triggered when template or template variable validation fails. Only the channelType, type, messageType, to, and from (existence check) parameters are strictly validated.</p>
     * 
     * <strong>example:</strong>
     * <p>undelivered</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The Flow message object.</p>
     * <blockquote>
     * <p>Valid only for WHATSAPP.</p>
     * </blockquote>
     */
    @NameInMap("FlowAction")
    public String flowActionShrink;

    /**
     * <p>The sender number.</p>
     * <ul>
     * <li>When ChannelType is <strong>whatsapp</strong>, this is the phone number registered and bindng with WhatsApp. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</li>
     * <li>When ChannelType is <strong>messenger</strong>, this is the Page ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Public Page</strong> page.</li>
     * <li>When ChannelType is <strong>instagram</strong>, this is the Instagram professional account ID (Account ID). You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Professional Account</strong> page.
     * &lt;props=&quot;intl&quot;&gt;- When ChannelType is <strong>viber</strong>, this is the Viber Service ID. You can view it on the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Service ID Management</strong> page.</li>
     * <li>When ChannelType is <strong>telegram</strong>, this is the Telegram bot ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Bot Management</strong> page.</li>
     * <li>When ChannelType is <strong>line</strong>, this is the LINE Channel ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>LINE Official Account</strong> page.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861387777****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code.</p>
     * <blockquote>
     * <p>This parameter is deprecated. You can ignore it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123123******</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The Viber message type. This parameter is for the China International site. China site users can ignore this parameter.
     * &lt;props=&quot;intl&quot;&gt;Valid values:
     * &lt;props=&quot;intl&quot;&gt;- <strong>pormotion</strong>: marketing or promotional messages.
     * &lt;props=&quot;intl&quot;&gt;- <strong>transaction</strong>: notification messages.</p>
     * <blockquote>
     * <p>Valid only for VIBER.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language. For a list of language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The campaign message ID.</p>
     * <blockquote>
     * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123123********</p>
     */
    @NameInMap("MessageCampaignId")
    public String messageCampaignId;

    /**
     * <p>The detailed message type when Type is set to message. Valid values:</p>
     * <details>
     * <summary>WHATSAPP</summary>
     * 
     * <ul>
     * <li><p>text: text message.</p>
     * </li>
     * <li><p>image: image message.</p>
     * </li>
     * <li><p>video: video message.</p>
     * </li>
     * <li><p>audio: audio message.</p>
     * </li>
     * <li><p>document: document message.</p>
     * </li>
     * <li><p>interactive: interactive message.</p>
     * </li>
     * <li><p>location: location message.</p>
     * </li>
     * <li><p>contacts: contacts message.</p>
     * </li>
     * <li><p>reaction: reaction message.</p>
     * </li>
     * <li><p>sticker: sticker message.</p>
     * </li>
     * <li><p>typing_indicator: typing indicator message.</p>
     * </li>
     * <li><p>pin: pin or unpin message (group messages only).</p>
     * </li>
     * <li><p>carousel: carousel message.</p>
     * </details></li>
     * </ul>
     * <details>
     * <summary>VIBER</summary>
     * 
     * <ul>
     * <li><p>text: text message.</p>
     * </li>
     * <li><p>image: image message.</p>
     * </li>
     * <li><p>text_image_button: text + image + button message.</p>
     * </li>
     * <li><p>text_button: text + button message.</p>
     * </li>
     * <li><p>document: document message.</p>
     * </li>
     * <li><p>video: video message.</p>
     * </li>
     * <li><p>text_video: text + video message.</p>
     * </li>
     * <li><p>text_video_button: text + video + button message.</p>
     * </li>
     * <li><p>text_image: text + image message.</p>
     * </details></li>
     * </ul>
     * <details>
     * <summary>MESSENGER / INSTAGRAM</summary>
     * 
     * <ul>
     * <li><p>text: text message.</p>
     * </li>
     * <li><p>image: image message.</p>
     * </li>
     * <li><p>video: video message.</p>
     * </li>
     * <li><p>document: document message.</p>
     * </li>
     * <li><p>audio: audio message.</p>
     * </li>
     * <li><p>interactive: interactive message.</p>
     * </li>
     * <li><p>couponTemplate: coupon template message.</p>
     * </li>
     * <li><p>regularTemplate: regular template message.</p>
     * </li>
     * <li><p>quickReply: quick reply message.</p>
     * </li>
     * <li><p>buttonTemplate: button template message.</p>
     * </details></li>
     * </ul>
     * <details>
     * <summary>TELEGRAM</summary>
     * 
     * <ul>
     * <li><p>text: text message.</p>
     * </li>
     * <li><p>image: image message.</p>
     * </li>
     * <li><p>video: video message.</p>
     * </li>
     * <li><p>audio: audio message.</p>
     * </li>
     * <li><p>document: document message.</p>
     * </li>
     * <li><p>location: location message.</p>
     * </li>
     * <li><p>gif: animated GIF message.</p>
     * </li>
     * <li><p>sticker: sticker message.</p>
     * </li>
     * <li><p>interactive: custom pass-through Telegram message.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>LINE</summary>
     * 
     * <ul>
     * <li><p>text: text message.</p>
     * </li>
     * <li><p>image: image message.</p>
     * </li>
     * <li><p>video: video message.</p>
     * </li>
     * <li><p>audio: audio message.</p>
     * </li>
     * <li><p>buttons: button message.</p>
     * </li>
     * <li><p>confirm: confirm message.</p>
     * </li>
     * <li><p>carousel: carousel message.</p>
     * </li>
     * <li><p>imageCarousel: image carousel message.</p>
     * </li>
     * <li><p>quickReply: quick reply message.</p>
     * </li>
     * <li><p>sticker: sticker message.</p>
     * </li>
     * <li><p>location: location message.</p>
     * </li>
     * <li><p>textV2: text message (V2).</p>
     * </li>
     * <li><p>coupon: coupon message.</p>
     * </li>
     * <li><p>imagemap: imagemap message.</p>
     * </li>
     * <li><p>flex: flex message.</p>
     * </li>
     * <li><p>interactive: custom pass-through LINE message.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><a href="https://developers.line.biz/en/reference/messaging-api/#message-objects">For more information, see the message types supported by LINE</a></p>
     * </blockquote>
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
     * <p>The collection of button trigger messages.</p>
     * <blockquote>
     * <p>This parameter is valid only for WHATSAPP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>payloadtext1,payloadtext2,payloadtext3</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>The product information. This parameter is valid only for WhatsApp channel types. It refers to the product information you uploaded on Meta.</p>
     * <blockquote>
     * <p>Valid only for WHATSAPP.</p>
     * </blockquote>
     */
    @NameInMap("ProductAction")
    public String productActionShrink;

    /**
     * <p>The recipient type. Valid values:</p>
     * <ul>
     * <li><p>individual: an individual.</p>
     * </li>
     * <li><p>group: a group.</p>
     * </li>
     * <li><p>userId: WhatsApp BSUID. Valid only for WHATSAPP.</p>
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
     * <p>The tag information. Custom tag information when sending Viber messages.</p>
     * <blockquote>
     * <p>Valid only for VIBER.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
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
     * <p>The collection of template parameters.</p>
     */
    @NameInMap("TemplateParams")
    public String templateParamsShrink;

    /**
     * <p>The recipient number.</p>
     * <ul>
     * <li>When ChannelType is <strong>whatsapp</strong>, this is the phone number or BSUID of the message recipient.</li>
     * <li>When ChannelType is <strong>messenger</strong>, this is the Page-Scoped User ID generated when the user interacts with the Facebook page.</li>
     * <li>When ChannelType is <strong>instagram</strong>, this is the Instagram User ID generated when the user interacts with the Instagram business or creator account.
     * &lt;props=&quot;intl&quot;&gt;- When ChannelType is <strong>viber</strong>, this is the phone number of the message recipient.</li>
     * <li>When ChannelType is <strong>telegram</strong>, this is the Telegram chatId.</li>
     * <li>When ChannelType is <strong>line</strong>, this is the LINE User ID.</li>
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
     * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bearer</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    /**
     * <p>The custom tracking data passed in for Viber message types. This parameter is for the China International site. China site users can ignore this parameter.</p>
     * <blockquote>
     * <p>Valid only for VIBER.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Tracking Data</p>
     */
    @NameInMap("TrackingData")
    public String trackingData;

    /**
     * <p>The Viber message sending timeout period. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;Unit: seconds. Valid values: 30 to 1209600.</p>
     * <blockquote>
     * <p>Valid only for VIBER.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p>template: a message template that has been approved in the console. This type of message can be sent at any time.</p>
     * </li>
     * <li><p>message: a message in any format. This type of message can only be sent within 24 hours after receiving the last message from the user.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: When Type is set to template, you must specify TemplateCode. When Type is set to message, you must specify MessageType.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Type")
    public String type;

    public static SendChatappMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageShrinkRequest self = new SendChatappMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageShrinkRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public SendChatappMessageShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SendChatappMessageShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMessageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatappMessageShrinkRequest setContextMessageId(String contextMessageId) {
        this.contextMessageId = contextMessageId;
        return this;
    }
    public String getContextMessageId() {
        return this.contextMessageId;
    }

    public SendChatappMessageShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public SendChatappMessageShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMessageShrinkRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMessageShrinkRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMessageShrinkRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMessageShrinkRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMessageShrinkRequest setFlowActionShrink(String flowActionShrink) {
        this.flowActionShrink = flowActionShrink;
        return this;
    }
    public String getFlowActionShrink() {
        return this.flowActionShrink;
    }

    public SendChatappMessageShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    @Deprecated
    public SendChatappMessageShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMessageShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMessageShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMessageShrinkRequest setMessageCampaignId(String messageCampaignId) {
        this.messageCampaignId = messageCampaignId;
        return this;
    }
    public String getMessageCampaignId() {
        return this.messageCampaignId;
    }

    public SendChatappMessageShrinkRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMessageShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public SendChatappMessageShrinkRequest setProductActionShrink(String productActionShrink) {
        this.productActionShrink = productActionShrink;
        return this;
    }
    public String getProductActionShrink() {
        return this.productActionShrink;
    }

    public SendChatappMessageShrinkRequest setRecipientType(String recipientType) {
        this.recipientType = recipientType;
        return this;
    }
    public String getRecipientType() {
        return this.recipientType;
    }

    public SendChatappMessageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMessageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMessageShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMessageShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMessageShrinkRequest setTemplateParamsShrink(String templateParamsShrink) {
        this.templateParamsShrink = templateParamsShrink;
        return this;
    }
    public String getTemplateParamsShrink() {
        return this.templateParamsShrink;
    }

    public SendChatappMessageShrinkRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendChatappMessageShrinkRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public SendChatappMessageShrinkRequest setTrackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }
    public String getTrackingData() {
        return this.trackingData;
    }

    public SendChatappMessageShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public SendChatappMessageShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
