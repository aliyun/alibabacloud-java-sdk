// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class SynchronizeAppShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TargetRegionIds")
    public String targetRegionIdsShrink;

    public static SynchronizeAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeAppShrinkRequest self = new SynchronizeAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SynchronizeAppShrinkRequest setTargetRegionIdsShrink(String targetRegionIdsShrink) {
        this.targetRegionIdsShrink = targetRegionIdsShrink;
        return this;
    }
    public String getTargetRegionIdsShrink() {
        return this.targetRegionIdsShrink;
    }

}
