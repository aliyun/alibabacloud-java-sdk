// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DescribeTagsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("tagsOnly")
    public Boolean tagsOnly;

    public static DescribeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRequest self = new DescribeTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagsRequest setTagsOnly(Boolean tagsOnly) {
        this.tagsOnly = tagsOnly;
        return this;
    }
    public Boolean getTagsOnly() {
        return this.tagsOnly;
    }

}
