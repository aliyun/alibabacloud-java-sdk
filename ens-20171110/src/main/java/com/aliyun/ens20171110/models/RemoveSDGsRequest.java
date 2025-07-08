// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("SdgIds")
    public java.util.List<String> sdgIds;

    public static RemoveSDGsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGsRequest self = new RemoveSDGsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSDGsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RemoveSDGsRequest setSdgIds(java.util.List<String> sdgIds) {
        this.sdgIds = sdgIds;
        return this;
    }
    public java.util.List<String> getSdgIds() {
        return this.sdgIds;
    }

}
