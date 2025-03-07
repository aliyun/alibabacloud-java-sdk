// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelGroupRequest extends TeaModel {
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
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static UpdateLivePackageChannelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelGroupRequest self = new UpdateLivePackageChannelGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLivePackageChannelGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
