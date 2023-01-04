// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromUsersRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 被取消授权的账户ID列表，必填，列表中最多包含100个元素。
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static RevokeApplicationFromUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromUsersRequest self = new RevokeApplicationFromUsersRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromUsersRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RevokeApplicationFromUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeApplicationFromUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
