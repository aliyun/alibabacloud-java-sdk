// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToUsersRequest extends TeaModel {
    /**
     * <p>The ID of the application on which you want to grant permissions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the accounts to which you want to grant permissions. You can grant permissions to a maximum of 100 accounts at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
