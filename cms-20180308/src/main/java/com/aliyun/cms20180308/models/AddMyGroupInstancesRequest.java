// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class AddMyGroupInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Instances")
    public String instances;

    @NameInMap("RegionId")
    public String regionId;

    public static AddMyGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMyGroupInstancesRequest self = new AddMyGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AddMyGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public AddMyGroupInstancesRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public AddMyGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
