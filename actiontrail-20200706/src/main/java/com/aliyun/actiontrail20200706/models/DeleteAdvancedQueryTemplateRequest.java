// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>utpl-QNL3dpYkQcyjZxrIQCciqQ</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteAdvancedQueryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryTemplateRequest self = new DeleteAdvancedQueryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
