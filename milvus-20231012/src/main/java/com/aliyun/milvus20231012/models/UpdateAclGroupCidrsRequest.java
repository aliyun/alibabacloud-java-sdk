// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAclGroupCidrsRequest extends TeaModel {
    @NameInMap("groupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>c-xxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>140.205.11.0/24,140.205.11.2</p>
     */
    @NameInMap("newCidrs")
    public String newCidrs;

    public static UpdateAclGroupCidrsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclGroupCidrsRequest self = new UpdateAclGroupCidrsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAclGroupCidrsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateAclGroupCidrsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAclGroupCidrsRequest setNewCidrs(String newCidrs) {
        this.newCidrs = newCidrs;
        return this;
    }
    public String getNewCidrs() {
        return this.newCidrs;
    }

}
