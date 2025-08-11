// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class SynchronizeAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TargetRegionIds")
    public java.util.List<String> targetRegionIds;

    public static SynchronizeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeAppRequest self = new SynchronizeAppRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SynchronizeAppRequest setTargetRegionIds(java.util.List<String> targetRegionIds) {
        this.targetRegionIds = targetRegionIds;
        return this;
    }
    public java.util.List<String> getTargetRegionIds() {
        return this.targetRegionIds;
    }

}
