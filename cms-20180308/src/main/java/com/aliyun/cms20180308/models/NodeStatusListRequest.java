// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeStatusListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-abcdefgh123456,i-abcdefgh123457</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static NodeStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeStatusListRequest self = new NodeStatusListRequest();
        return TeaModel.build(map, self);
    }

    public NodeStatusListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public NodeStatusListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
