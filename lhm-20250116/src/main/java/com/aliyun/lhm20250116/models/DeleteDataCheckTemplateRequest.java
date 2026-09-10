// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckTemplateRequest extends TeaModel {
    /**
     * <p>The list of validation template IDs. Batch operations are supported.</p>
     */
    @NameInMap("templateIds")
    public java.util.List<String> templateIds;

    public static DeleteDataCheckTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckTemplateRequest self = new DeleteDataCheckTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckTemplateRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

}
