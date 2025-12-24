// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteUsersRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>账号ID列表</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>u_001</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static DeleteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersRequest self = new DeleteUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
