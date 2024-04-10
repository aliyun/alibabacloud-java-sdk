// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatappTemplateRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <br>
     * <p>>  CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The code of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateType")
    public String templateType;

    public static DeleteChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatappTemplateRequest self = new DeleteChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeleteChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public DeleteChatappTemplateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public DeleteChatappTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DeleteChatappTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DeleteChatappTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DeleteChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
