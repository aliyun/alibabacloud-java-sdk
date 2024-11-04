// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableDiskEncryptionByDefaultRequest extends TeaModel {
    /**
     * <p>The ID of the region for which you want to disable Account-level EBS Default Encryption. You can call the <a href="https://help.aliyun.com/document_detail/2679950.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DisableDiskEncryptionByDefaultRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDiskEncryptionByDefaultRequest self = new DisableDiskEncryptionByDefaultRequest();
        return TeaModel.build(map, self);
    }

    public DisableDiskEncryptionByDefaultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableDiskEncryptionByDefaultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
