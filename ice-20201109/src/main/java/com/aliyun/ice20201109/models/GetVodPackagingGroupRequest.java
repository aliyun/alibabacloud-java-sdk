// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static GetVodPackagingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingGroupRequest self = new GetVodPackagingGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
