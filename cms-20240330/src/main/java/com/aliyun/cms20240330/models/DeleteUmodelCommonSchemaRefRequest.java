// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelCommonSchemaRefRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apm-common</p>
     */
    @NameInMap("group")
    public String group;

    public static DeleteUmodelCommonSchemaRefRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelCommonSchemaRefRequest self = new DeleteUmodelCommonSchemaRefRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelCommonSchemaRefRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
