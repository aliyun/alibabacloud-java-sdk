// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteUserTagsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static DeleteUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserTagsRequest self = new DeleteUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUserTagsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
