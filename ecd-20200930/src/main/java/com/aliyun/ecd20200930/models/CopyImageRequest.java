// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyImageRequest extends TeaModel {
    /**
     * <p>The description of the image copy. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DestinationDescription")
    public String destinationDescription;

    /**
     * <p>The name of the image copy. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `acs:` or `aliyun`. The name cannot contain `http://` or `https://`. The name can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("DestinationImageName")
    public String destinationImageName;

    /**
     * <p>The destination region to which you want to copy the image.</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The ID of the image that is copied to the destination region.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~DescribeRegions~~) operation to query the most recent region list.</p>
     */
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
