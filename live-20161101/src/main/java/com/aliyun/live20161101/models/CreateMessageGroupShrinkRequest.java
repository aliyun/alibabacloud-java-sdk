// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("Extension")
    public String extensionShrink;

    public static CreateMessageGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageGroupShrinkRequest self = new CreateMessageGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageGroupShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMessageGroupShrinkRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateMessageGroupShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

}
