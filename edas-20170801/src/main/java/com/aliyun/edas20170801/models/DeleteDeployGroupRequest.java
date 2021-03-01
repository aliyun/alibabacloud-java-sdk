// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteDeployGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupName")
    public String groupName;

    public static DeleteDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployGroupRequest self = new DeleteDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteDeployGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
