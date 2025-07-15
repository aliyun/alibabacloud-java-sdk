// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the creator. The ID can be up to 36 characters in length and can contain only letters and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>as****hs</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The extended field.</p>
     */
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
