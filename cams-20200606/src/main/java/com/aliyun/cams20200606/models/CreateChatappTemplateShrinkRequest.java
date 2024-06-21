// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the directory of the template. If you set this parameter to true, the review success rate of the template is improved. This parameter is valid only when TemplateType is set to WHATSAPP.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template if TemplateType is set to WHATSAPP. Valid values:</p>
     * <ul>
     * <li><strong>UTILITY</strong>: the transaction template</li>
     * <li><strong>MARKETING</strong>: the marketing template</li>
     * <li><strong>AUTHENTICATION</strong>: the authentication template</li>
     * </ul>
     * <p>The category of the template if TemplateType is set to VIBER. Valid values:</p>
     * <ul>
     * <li><strong>text</strong>: the template that contains only text</li>
     * <li><strong>image</strong>: the template that contains only images</li>
     * <li><strong>text_image_button</strong>: the template that contains text, images, and buttons</li>
     * <li><strong>text_button</strong>: the template that contains text and buttons</li>
     * <li><strong>document</strong>: the template that contains only documents</li>
     * <li><strong>video</strong>: the template that contains only videos</li>
     * <li><strong>text_video</strong>: the template that contains text and videos</li>
     * <li><strong>text_video_button</strong>: the template that contains text, videos, and buttons</li>
     * <li><strong>text_image</strong>: the template that contains text and images</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The code of the message template.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     * <blockquote>
     * <p> If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, the Text sub-parameter of the Components parameter must be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The space ID of the user within the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <blockquote>
     * <p>CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
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
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Validity period of authentication template message sending in WhatsApp</p>
     * <blockquote>
     * <p>This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The name of the message template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the message template.</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * <li><strong>VIBER</strong></li>
     * <li>LINE: the Line message template. This type of message template will be released later.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
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
