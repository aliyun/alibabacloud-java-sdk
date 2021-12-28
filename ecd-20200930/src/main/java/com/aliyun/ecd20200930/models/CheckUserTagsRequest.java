// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserTagsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static CheckUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserTagsRequest self = new CheckUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckUserTagsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
