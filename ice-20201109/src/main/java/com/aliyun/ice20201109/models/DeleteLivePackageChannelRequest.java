// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelRequest extends TeaModel {
    /**
     * <p>The channel name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The channel group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static DeleteLivePackageChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageChannelRequest self = new DeleteLivePackageChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public DeleteLivePackageChannelRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
