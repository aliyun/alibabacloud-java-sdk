// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelGroupRequest extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
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
