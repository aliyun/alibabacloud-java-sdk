// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchCreateVodPackagingAssetShrinkRequest extends TeaModel {
    @NameInMap("Assets")
    public String assetsShrink;

    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static BatchCreateVodPackagingAssetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateVodPackagingAssetShrinkRequest self = new BatchCreateVodPackagingAssetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateVodPackagingAssetShrinkRequest setAssetsShrink(String assetsShrink) {
        this.assetsShrink = assetsShrink;
        return this;
    }
    public String getAssetsShrink() {
        return this.assetsShrink;
    }

    public BatchCreateVodPackagingAssetShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
