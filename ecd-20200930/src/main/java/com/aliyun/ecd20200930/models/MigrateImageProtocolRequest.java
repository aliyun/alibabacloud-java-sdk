// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateImageProtocolRequest extends TeaModel {
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetProtocolType")
    public String targetProtocolType;

    public static MigrateImageProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateImageProtocolRequest self = new MigrateImageProtocolRequest();
        return TeaModel.build(map, self);
    }

    public MigrateImageProtocolRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public MigrateImageProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateImageProtocolRequest setTargetProtocolType(String targetProtocolType) {
        this.targetProtocolType = targetProtocolType;
        return this;
    }
    public String getTargetProtocolType() {
        return this.targetProtocolType;
    }

}
