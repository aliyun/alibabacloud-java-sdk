// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("relObjectType")
    public String relObjectType;

    public static ListPipelineRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRelationsRequest self = new ListPipelineRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRelationsRequest setRelObjectType(String relObjectType) {
        this.relObjectType = relObjectType;
        return this;
    }
    public String getRelObjectType() {
        return this.relObjectType;
    }

}
