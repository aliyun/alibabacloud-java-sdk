// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CancelPushSchedulerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Type")
    public Integer type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UniqueIds")
    public String uniqueIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CancelPushSchedulerRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPushSchedulerRequest self = new CancelPushSchedulerRequest();
        return TeaModel.build(map, self);
    }

    public CancelPushSchedulerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelPushSchedulerRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CancelPushSchedulerRequest setUniqueIds(String uniqueIds) {
        this.uniqueIds = uniqueIds;
        return this;
    }
    public String getUniqueIds() {
        return this.uniqueIds;
    }

    public CancelPushSchedulerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
