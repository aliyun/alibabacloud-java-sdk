// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The type of the message template. Valid values:</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   **VIBER**</p>
     * <p>*   LINE (developing)</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

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

    public GetChatappTemplateDetailRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
