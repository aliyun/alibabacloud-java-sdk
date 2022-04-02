// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatappTemplateRequest extends TeaModel {
    // 模板编码
    @NameInMap("TemplateCode")
    public String templateCode;

    public static DeleteChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatappTemplateRequest self = new DeleteChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatappTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
