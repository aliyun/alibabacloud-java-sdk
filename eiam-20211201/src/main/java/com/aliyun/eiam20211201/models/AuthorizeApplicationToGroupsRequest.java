// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToGroupsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The group IDs. You can specify up to 100 group IDs at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AuthorizeApplicationToGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToGroupsRequest self = new AuthorizeApplicationToGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToGroupsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AuthorizeApplicationToGroupsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public AuthorizeApplicationToGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
