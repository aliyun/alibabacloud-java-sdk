// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelCredentialsRequest extends TeaModel {
    /**
     * <p>频道名称，字符必须为大小写英文字母或-、<em>。
     * 1 ~ 200个字符。
     * 格式：[A-Za-z0-9</em>-]+</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>频道组名称</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>刷新密钥选项, 1: 刷新endpoint1，2:刷新endpoint2，3: 刷新endpoint1&amp;2</p>
     * <p>This parameter is required.</p>
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
