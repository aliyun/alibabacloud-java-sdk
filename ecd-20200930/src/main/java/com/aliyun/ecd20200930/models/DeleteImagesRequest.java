// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteImagesRequest extends TeaModel {
    @NameInMap("DeleteCascadedBundle")
    public Boolean deleteCascadedBundle;

    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The operation that you want to perform. Set the value to DeleteImages.</p>
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
