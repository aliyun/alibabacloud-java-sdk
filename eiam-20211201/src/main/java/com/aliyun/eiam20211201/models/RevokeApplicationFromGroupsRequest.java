// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromGroupsRequest extends TeaModel {
    /**
     * <p>应用的唯一标识。</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>被取消授权的组ID列表，必填，列表中最多包含100个元素。</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RevokeApplicationFromGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromGroupsRequest self = new RevokeApplicationFromGroupsRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromGroupsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RevokeApplicationFromGroupsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public RevokeApplicationFromGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
