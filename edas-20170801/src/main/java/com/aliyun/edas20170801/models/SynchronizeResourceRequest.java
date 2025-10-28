// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SynchronizeResourceRequest extends TeaModel {
    /**
     * <p>The ID of the resource. This parameter is required only when you set the Type parameter to <code>ecs</code>. If you specify multiple IDs, separate them with commas (,). You can synchronize up to 50 resources at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp17c*<strong>5q8x,i-bp1</strong>5q8x</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The type of the resource to be synchronized. Valid values: <code>ecs, slb, vpc, and all</code>. These values are case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Type")
    public String type;

    public static SynchronizeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeResourceRequest self = new SynchronizeResourceRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeResourceRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public SynchronizeResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
