// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelGroupRequest extends TeaModel {
    /**
     * <p>The channel group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static DeleteLivePackageChannelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageChannelGroupRequest self = new DeleteLivePackageChannelGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageChannelGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
