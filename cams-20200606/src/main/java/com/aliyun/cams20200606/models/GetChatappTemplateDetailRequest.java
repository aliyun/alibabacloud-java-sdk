// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailRequest extends TeaModel {
    @NameInMap("CustWabaId")
    public String custWabaId;

    @NameInMap("Language")
    public String language;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetChatappTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateDetailRequest self = new GetChatappTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateDetailRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
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

}
