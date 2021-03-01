// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SynchronizeResourceRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("ResourceIds")
    public String resourceIds;

    public static SynchronizeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeResourceRequest self = new SynchronizeResourceRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SynchronizeResourceRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

}
