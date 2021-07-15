// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteTemplateRequest extends TeaModel {
    // 模板id，多个id用英文逗号隔开
    @NameInMap("TemplateIds")
    public String templateIds;

    public static DeleteTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateRequest self = new DeleteTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

}
