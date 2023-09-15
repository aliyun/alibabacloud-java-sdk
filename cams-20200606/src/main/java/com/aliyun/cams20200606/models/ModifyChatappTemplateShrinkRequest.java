// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The category of the Viber message template. Valid values:</p>
     * <br>
     * <p>*   **text**: the template that contains only text</p>
     * <p>*   **image**: the template that contains only images</p>
     * <p>*   **text_image_button**: the template that contains text, images, and buttons</p>
     * <p>*   **text_button**: the template that contains text and buttons</p>
     * <p>*   **document**: the template that contains only documents</p>
     * <p>*   **video**: the template that contains only videos</p>
     * <p>*   **text_video**: the template that contains text and videos</p>
     * <p>*   **text_video_button**: the template that contains text, videos, and buttons</p>
     * <p>*   **text_image**: the template that contains text and images</p>
     * <br>
     * <p>> This parameter applies only to Viber message templates.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     * <br>
     * <p>> If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, the Text sub-parameter of the Components parameter is empty and text in the body or footer is automatically generated.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The space ID of the user within the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <br>
     * <p>> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The examples of variables that are used when you create the message template.</p>
     */
    @NameInMap("Example")
    public String exampleShrink;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Validity period of authentication template message sending in WhatsApp</p>
     * <br>
     * <p>>This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The message template code.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The type of the message template.</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   **VIBER**</p>
     * <p>*   LINE: the Line message template. This type of message template will be released later.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ModifyChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateShrinkRequest self = new ModifyChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyChatappTemplateShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public ModifyChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ModifyChatappTemplateShrinkRequest setExampleShrink(String exampleShrink) {
        this.exampleShrink = exampleShrink;
        return this;
    }
    public String getExampleShrink() {
        return this.exampleShrink;
    }

    public ModifyChatappTemplateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ModifyChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyChatappTemplateShrinkRequest setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }
    public Integer getMessageSendTtlSeconds() {
        return this.messageSendTtlSeconds;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
