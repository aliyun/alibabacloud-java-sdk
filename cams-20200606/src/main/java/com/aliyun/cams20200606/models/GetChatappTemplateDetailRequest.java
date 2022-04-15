// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailRequest extends TeaModel {
    // ISV客户WabaId
    @NameInMap("CustWabaId")
    public String custWabaId;

    // 语言
    @NameInMap("Language")
    public String language;

    // 模板分类
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
