// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The templatetype cannot be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>When a Utility template is changed to Marketing type, the template is paused for sending.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>The list of message template components.</p>
     * <blockquote>
     * <p>When Category is AUTHENTICATION, Components cannot contain a node with Type set to HEADER. When Type is BODY/FOOTER, the Text content is empty and is automatically generated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The SpaceId of the ISV sub-customer or the instance ID of the direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV customer WabaId.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    public String custWabaId;

    /**
     * <p>The example for creating a template.</p>
     */
    @NameInMap("Example")
    public String exampleShrink;

    /**
     * <p>The ISV verification code used to verify whether the sub-account is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>ksiekdki39ksks93939</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The template language. For language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The validity period for sending template messages in WhatsApp.</p>
     * <ul>
     * <li>AUTHENTICATION: valid values range from 30 to 900. </li>
     * <li>UTILITY: valid values range from 30 to 43200.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>productSetId</p>
     * 
     * <strong>example:</strong>
     * <p>939***</p>
     */
    @NameInMap("ProductSetId")
    public String productSetId;

    /**
     * <p>The message template code.</p>
     * 
     * <strong>example:</strong>
     * <p>8472929283883</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
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

    public ModifyChatappTemplateShrinkRequest setCategoryChangePaused(Boolean categoryChangePaused) {
        this.categoryChangePaused = categoryChangePaused;
        return this;
    }
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
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

    @Deprecated
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

    public ModifyChatappTemplateShrinkRequest setProductSetId(String productSetId) {
        this.productSetId = productSetId;
        return this;
    }
    public String getProductSetId() {
        return this.productSetId;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
