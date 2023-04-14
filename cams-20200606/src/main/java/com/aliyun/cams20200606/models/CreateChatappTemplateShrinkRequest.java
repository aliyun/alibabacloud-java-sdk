// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template when the TemplateType parameter is set to WHATSAPP. Valid values:</p>
     * <br>
     * <p>*   **TRANSACTIONAL**: a transactional template</p>
     * <p>*   **MARKETING**: a marketing template</p>
     * <p>*   **OTP**: a one-time password template</p>
     * <br>
     * <p>The category of the template when the TemplateType parameter is set to VIBER. Valid values:</p>
     * <br>
     * <p>*   **text**: a text message template</p>
     * <p>*   **image**: an image message template</p>
     * <p>*   **text_image_button**: a template that contains multiple media objects, including text, image, and button</p>
     * <p>*   **text_button**: a template that contains the text and button media objects</p>
     * <p>*   **document**: a document message template</p>
     * <p>*   **video**: a video message template</p>
     * <p>*   **text_video**: a template that contains the text and video media objects</p>
     * <p>*   **text_video_button**: a template that contains multiple media objects, including text, video, and button</p>
     * <p>*   **text_image**: a template that contains the text and image media objects</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The list of components of the message template.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp account that you register.</p>
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
     * <p>The name of the message template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the message template.</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   **VIBER**</p>
     * <p>*   LINE: the LINE message template. The LINE message template is under development.</p>
     */
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
