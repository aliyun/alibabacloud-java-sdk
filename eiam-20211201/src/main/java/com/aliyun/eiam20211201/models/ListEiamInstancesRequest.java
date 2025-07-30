// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamInstancesRequest extends TeaModel {
    /**
     * <p>The instance ID list.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    public static ListEiamInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEiamInstancesRequest self = new ListEiamInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListEiamInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListEiamInstancesRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

}
