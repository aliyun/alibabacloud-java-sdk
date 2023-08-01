// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListUserDefineRegionRequest extends TeaModel {
    /**
     * <p>Specifies whether remote debugging is allowed.</p>
     */
    @NameInMap("DebugEnable")
    public Boolean debugEnable;

    public static ListUserDefineRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefineRegionRequest self = new ListUserDefineRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListUserDefineRegionRequest setDebugEnable(Boolean debugEnable) {
        this.debugEnable = debugEnable;
        return this;
    }
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

}
