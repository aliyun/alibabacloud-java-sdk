// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeletePipelineRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("relObjectId")
    public String relObjectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("relObjectType")
    public String relObjectType;

    public static DeletePipelineRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineRelationsRequest self = new DeletePipelineRelationsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePipelineRelationsRequest setRelObjectId(String relObjectId) {
        this.relObjectId = relObjectId;
        return this;
    }
    public String getRelObjectId() {
        return this.relObjectId;
    }

    public DeletePipelineRelationsRequest setRelObjectType(String relObjectType) {
        this.relObjectType = relObjectType;
        return this;
    }
    public String getRelObjectType() {
        return this.relObjectType;
    }

}
