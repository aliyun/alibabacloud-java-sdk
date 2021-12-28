// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveServicesRequest extends TeaModel {
    @NameInMap("CdsId")
    public java.util.List<String> cdsId;

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
