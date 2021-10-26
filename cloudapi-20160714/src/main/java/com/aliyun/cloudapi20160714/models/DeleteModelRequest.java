// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteModelRequest extends TeaModel {
    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("GroupId")
    public String groupId;

    public static DeleteModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelRequest self = new DeleteModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DeleteModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
