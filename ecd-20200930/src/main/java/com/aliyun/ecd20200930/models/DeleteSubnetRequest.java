// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteSubnetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    public static DeleteSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubnetRequest self = new DeleteSubnetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
