// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyImageRequest extends TeaModel {
    @NameInMap("DestinationDescription")
    public String destinationDescription;

    @NameInMap("DestinationImageName")
    public String destinationImageName;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    public static CopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyImageRequest self = new CopyImageRequest();
        return TeaModel.build(map, self);
    }

    public CopyImageRequest setDestinationDescription(String destinationDescription) {
        this.destinationDescription = destinationDescription;
        return this;
    }
    public String getDestinationDescription() {
        return this.destinationDescription;
    }

    public CopyImageRequest setDestinationImageName(String destinationImageName) {
        this.destinationImageName = destinationImageName;
        return this;
    }
    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    public CopyImageRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CopyImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CopyImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
