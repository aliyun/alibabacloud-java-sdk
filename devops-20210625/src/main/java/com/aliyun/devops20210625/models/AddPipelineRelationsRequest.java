// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddPipelineRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("relObjectIds")
    public String relObjectIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("relObjectType")
    public String relObjectType;

    public static AddPipelineRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineRelationsRequest self = new AddPipelineRelationsRequest();
        return TeaModel.build(map, self);
    }

    public AddPipelineRelationsRequest setRelObjectIds(String relObjectIds) {
        this.relObjectIds = relObjectIds;
        return this;
    }
    public String getRelObjectIds() {
        return this.relObjectIds;
    }

    public AddPipelineRelationsRequest setRelObjectType(String relObjectType) {
        this.relObjectType = relObjectType;
        return this;
    }
    public String getRelObjectType() {
        return this.relObjectType;
    }

}
