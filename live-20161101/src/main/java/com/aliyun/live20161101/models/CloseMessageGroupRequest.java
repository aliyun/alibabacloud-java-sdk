// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CloseMessageGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    public static CloseMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseMessageGroupRequest self = new CloseMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloseMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CloseMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
