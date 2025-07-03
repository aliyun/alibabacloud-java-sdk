// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetImageShrinkRequest extends TeaModel {
    @NameInMap("AdditionalRegionIds")
    public String additionalRegionIdsShrink;

    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <strong>example:</strong>
     * <p>m-2ze74g5mvy4pjg*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

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
