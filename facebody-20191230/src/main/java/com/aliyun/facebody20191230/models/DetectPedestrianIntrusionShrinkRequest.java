// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionShrinkRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Region")
    public String regionShrink;

    @NameInMap("RegionType")
    public String regionType;

    public static DetectPedestrianIntrusionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionShrinkRequest self = new DetectPedestrianIntrusionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionShrinkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectPedestrianIntrusionShrinkRequest setRegionShrink(String regionShrink) {
        this.regionShrink = regionShrink;
        return this;
    }
    public String getRegionShrink() {
        return this.regionShrink;
    }

    public DetectPedestrianIntrusionShrinkRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

}
