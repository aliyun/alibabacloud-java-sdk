// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetImageRequest extends TeaModel {
    @NameInMap("AdditionalRegionIds")
    public java.util.List<String> additionalRegionIds;

    /**
     * <p>Image source. Valid values:</p>
     * <ul>
     * <li><p>Public: public images provided by Alibaba Cloud.</p>
     * </li>
     * <li><p>Custom: custom images that you added.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <p>Image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-2ze74g5mvy4pjg*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Image type. Valid values:</p>
     * <ul>
     * <li><p>VM: virtual machine image.</p>
     * </li>
     * <li><p>Container: container image.</p>
     * </li>
     * </ul>
     * <p>Default value: VM</p>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    public static GetImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRequest self = new GetImageRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRequest setAdditionalRegionIds(java.util.List<String> additionalRegionIds) {
        this.additionalRegionIds = additionalRegionIds;
        return this;
    }
    public java.util.List<String> getAdditionalRegionIds() {
        return this.additionalRegionIds;
    }

    public GetImageRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public GetImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

}
