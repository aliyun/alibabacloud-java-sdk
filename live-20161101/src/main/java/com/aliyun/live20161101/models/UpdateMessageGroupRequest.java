// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    @NameInMap("GroupId")
    public String groupId;

    public static UpdateMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageGroupRequest self = new UpdateMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageGroupRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public UpdateMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
