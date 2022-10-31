// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    public static CreateMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageGroupRequest self = new CreateMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMessageGroupRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateMessageGroupRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

}
