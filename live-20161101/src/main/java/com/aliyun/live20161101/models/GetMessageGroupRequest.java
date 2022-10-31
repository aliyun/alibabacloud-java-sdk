// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    public static GetMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageGroupRequest self = new GetMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
