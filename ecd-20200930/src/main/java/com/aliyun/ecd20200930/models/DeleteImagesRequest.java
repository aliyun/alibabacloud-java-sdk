// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteImagesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the associated template.</p>
     */
    @NameInMap("DeleteCascadedBundle")
    public Boolean deleteCascadedBundle;

    /**
     * <p>The image IDs. You can specify 1 to 100 image IDs.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesRequest self = new DeleteImagesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImagesRequest setDeleteCascadedBundle(Boolean deleteCascadedBundle) {
        this.deleteCascadedBundle = deleteCascadedBundle;
        return this;
    }
    public Boolean getDeleteCascadedBundle() {
        return this.deleteCascadedBundle;
    }

    public DeleteImagesRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public DeleteImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
