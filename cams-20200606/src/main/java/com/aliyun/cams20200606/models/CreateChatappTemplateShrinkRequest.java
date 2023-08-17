// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the directory of the template. If you set this parameter to true, the review success rate of the template is improved. This parameter is valid only if TemplateType is set to WHATSAPP.</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template if TemplateType is set to WHATSAPP. Valid values:</p>
     * <br>
     * <p>*   **UTILITY**: the transaction template</p>
     * <p>*   **MARKETING**: the marketing template</p>
     * <p>*   **AUTHENTICATION**: the authentication template</p>
     * <br>
     * <p>The category of the template if TemplateType is set to VIBER. Valid values:</p>
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
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     * <br>
     * <p>> If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the value of Type is BODY or FOOTER, the Text sub-parameter of the Components parameter is empty.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The examples of variables that are used when you create the message template.</p>
     */
    @NameInMap("Example")
    public String exampleShrink;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateType")
    public String templateType;

    public static CreateChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateShrinkRequest self = new CreateChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateShrinkRequest setAllowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
        return this;
    }
    public Boolean getAllowCategoryChange() {
        return this.allowCategoryChange;
    }

    public CreateChatappTemplateShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateChatappTemplateShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CreateChatappTemplateShrinkRequest setExampleShrink(String exampleShrink) {
        this.exampleShrink = exampleShrink;
        return this;
    }
    public String getExampleShrink() {
        return this.exampleShrink;
    }

    public CreateChatappTemplateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public CreateChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateChatappTemplateShrinkRequest setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }
    public Integer getMessageSendTtlSeconds() {
        return this.messageSendTtlSeconds;
    }

    public CreateChatappTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
