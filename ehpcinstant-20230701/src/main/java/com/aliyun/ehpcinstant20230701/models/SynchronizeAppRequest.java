// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class SynchronizeAppRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-vm-rYfypJKwlN9Y</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of arrays that are synchronized to the specified region. If \&quot;all\&quot; is included, it is synchronized to all other unsynchronized regions by default.</p>
     */
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
