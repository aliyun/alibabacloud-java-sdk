// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByGroupForBackendRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("GroupId")
    public String groupId;

    public static SetAccessPermissionByGroupForBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByGroupForBackendRequest self = new SetAccessPermissionByGroupForBackendRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByGroupForBackendRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SetAccessPermissionByGroupForBackendRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
