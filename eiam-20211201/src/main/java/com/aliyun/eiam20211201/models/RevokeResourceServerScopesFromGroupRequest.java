// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerScopesFromGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource server application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of scope permission IDs for the resource server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ress_XXXXX&quot;,&quot;ress_XXXXX&quot;]</p>
     */
    @NameInMap("ResourceServerScopeIds")
    public java.util.List<String> resourceServerScopeIds;

    public static RevokeResourceServerScopesFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerScopesFromGroupRequest self = new RevokeResourceServerScopesFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerScopesFromGroupRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RevokeResourceServerScopesFromGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RevokeResourceServerScopesFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeResourceServerScopesFromGroupRequest setResourceServerScopeIds(java.util.List<String> resourceServerScopeIds) {
        this.resourceServerScopeIds = resourceServerScopeIds;
        return this;
    }
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

}
