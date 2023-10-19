// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteModelRequest extends TeaModel {
    /**
     * <p>The ID of the API group to which the model belongs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the model.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    public static DeleteModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelRequest self = new DeleteModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

}
