// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageGroupShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Extension")
    public String extensionShrink;

    @NameInMap("GroupId")
    public String groupId;

    public static UpdateMessageGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageGroupShrinkRequest self = new UpdateMessageGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageGroupShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageGroupShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public UpdateMessageGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
