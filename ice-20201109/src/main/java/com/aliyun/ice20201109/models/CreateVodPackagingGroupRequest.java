// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vod hls packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static CreateVodPackagingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingGroupRequest self = new CreateVodPackagingGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVodPackagingGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
