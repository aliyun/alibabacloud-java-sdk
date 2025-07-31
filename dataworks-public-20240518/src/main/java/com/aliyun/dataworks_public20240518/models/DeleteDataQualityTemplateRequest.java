// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>USER_DEFINED:2001</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteDataQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityTemplateRequest self = new DeleteDataQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
