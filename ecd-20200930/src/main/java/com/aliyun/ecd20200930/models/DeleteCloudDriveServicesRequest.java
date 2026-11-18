// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveServicesRequest extends TeaModel {
    /**
     * <p>The IDs of the Wuying cloud disks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CdsId")
    public java.util.List<String> cdsId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCloudDriveServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveServicesRequest self = new DeleteCloudDriveServicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveServicesRequest setCdsId(java.util.List<String> cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public java.util.List<String> getCdsId() {
        return this.cdsId;
    }

    public DeleteCloudDriveServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
