// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListDbfsAttachableEcsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachableEcsInstancesRequest self = new ListDbfsAttachableEcsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachableEcsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
