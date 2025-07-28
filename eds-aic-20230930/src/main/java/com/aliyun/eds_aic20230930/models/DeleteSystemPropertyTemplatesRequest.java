// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteSystemPropertyTemplatesRequest extends TeaModel {
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    public static DeleteSystemPropertyTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSystemPropertyTemplatesRequest self = new DeleteSystemPropertyTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSystemPropertyTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

}
