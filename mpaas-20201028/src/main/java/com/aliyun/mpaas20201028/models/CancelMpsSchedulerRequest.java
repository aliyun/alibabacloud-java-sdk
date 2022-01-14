// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CancelMpsSchedulerRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UniqueIds")
    public String uniqueIds;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CancelMpsSchedulerRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMpsSchedulerRequest self = new CancelMpsSchedulerRequest();
        return TeaModel.build(map, self);
    }

    public CancelMpsSchedulerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelMpsSchedulerRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CancelMpsSchedulerRequest setUniqueIds(String uniqueIds) {
        this.uniqueIds = uniqueIds;
        return this;
    }
    public String getUniqueIds() {
        return this.uniqueIds;
    }

    public CancelMpsSchedulerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
