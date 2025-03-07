// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The channel group description. It can be up to 1,000 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The channel group name. It can contain letters, digits, hyphens (-), and underscores (<em>). The name must be 1 to 200 characters in length. Format: [A-Za-z0-9</em>-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-01</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static CreateLivePackageChannelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelGroupRequest self = new CreateLivePackageChannelGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLivePackageChannelGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLivePackageChannelGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
