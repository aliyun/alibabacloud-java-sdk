// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <blockquote>
     * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The independent software vendor (ISV) verification code. This parameter is used to verify whether the user is authorized by the ISV account.</p>
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
     * <p>en_US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The code of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>****4b5c79c9432497a075bdfca36bf5</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the message template. Valid values:</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * <li><strong>VIBER</strong></li>
     * <li>LINE (developing)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static GetChatappTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateDetailRequest self = new GetChatappTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateDetailRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetChatappTemplateDetailRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public GetChatappTemplateDetailRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public GetChatappTemplateDetailRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetChatappTemplateDetailRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetChatappTemplateDetailRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetChatappTemplateDetailRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
