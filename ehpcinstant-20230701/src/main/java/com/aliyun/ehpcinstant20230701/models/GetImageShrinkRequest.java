// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetImageShrinkRequest extends TeaModel {
    /**
     * <p>The list of additional region IDs for which to query image information.</p>
     */
    @NameInMap("AdditionalRegionIds")
    public String additionalRegionIdsShrink;

    /**
     * <p>The image source. Valid values:</p>
     * <ul>
     * <li>Public: public images provided by Alibaba Cloud</li>
     * <li>Custom: custom images added by you</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-2ze74g5mvy4pjg*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li>VM: virtual machine image</li>
     * <li>Container: container image</li>
     * </ul>
     * <p>Default value: VM.</p>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    public static GetImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageShrinkRequest self = new GetImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetImageShrinkRequest setAdditionalRegionIdsShrink(String additionalRegionIdsShrink) {
        this.additionalRegionIdsShrink = additionalRegionIdsShrink;
        return this;
    }
    public String getAdditionalRegionIdsShrink() {
        return this.additionalRegionIdsShrink;
    }

    public GetImageShrinkRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public GetImageShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageShrinkRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

}
