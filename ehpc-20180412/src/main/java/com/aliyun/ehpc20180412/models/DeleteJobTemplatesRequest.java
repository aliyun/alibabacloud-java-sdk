// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesRequest extends TeaModel {
    @NameInMap("Templates")
    public String templates;

    public static DeleteJobTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplatesRequest self = new DeleteJobTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplatesRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
