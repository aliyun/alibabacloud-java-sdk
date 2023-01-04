// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToUsersRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 被授权的账户ID列表，必填，列表中最多包含100个元素。
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static AuthorizeApplicationToUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToUsersRequest self = new AuthorizeApplicationToUsersRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToUsersRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AuthorizeApplicationToUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthorizeApplicationToUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
