// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelCredentialsRequest extends TeaModel {
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
     * <p>group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to update the credentials. 1: updates the credentials of endpoint 1. 2: updates the credentials of endpoint 2. 3: updates the credentials of endpoints 1 and 2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RotateCredentials")
    public Integer rotateCredentials;

    public static UpdateLivePackageChannelCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelCredentialsRequest self = new UpdateLivePackageChannelCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelCredentialsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateLivePackageChannelCredentialsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateLivePackageChannelCredentialsRequest setRotateCredentials(Integer rotateCredentials) {
        this.rotateCredentials = rotateCredentials;
        return this;
    }
    public Integer getRotateCredentials() {
        return this.rotateCredentials;
    }

}
