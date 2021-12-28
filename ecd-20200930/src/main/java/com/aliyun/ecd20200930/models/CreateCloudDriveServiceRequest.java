// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceRequest extends TeaModel {
    @NameInMap("MaxSize")
    public Long maxSize;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateCloudDriveServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceRequest self = new CreateCloudDriveServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceRequest setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public CreateCloudDriveServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudDriveServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
