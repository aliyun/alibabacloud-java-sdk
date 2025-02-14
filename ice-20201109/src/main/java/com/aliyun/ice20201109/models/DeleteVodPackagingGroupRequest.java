// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static DeleteVodPackagingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingGroupRequest self = new DeleteVodPackagingGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
