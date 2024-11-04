// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskEncryptionByDefaultStatusRequest extends TeaModel {
    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/2679950.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDiskEncryptionByDefaultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEncryptionByDefaultStatusRequest self = new DescribeDiskEncryptionByDefaultStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEncryptionByDefaultStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskEncryptionByDefaultStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
