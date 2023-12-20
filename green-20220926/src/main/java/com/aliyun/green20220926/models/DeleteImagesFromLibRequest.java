// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteImagesFromLibRequest extends TeaModel {
    @NameInMap("ImageIds")
    public String imageIds;

    @NameInMap("LibId")
    public String libId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteImagesFromLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesFromLibRequest self = new DeleteImagesFromLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImagesFromLibRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public DeleteImagesFromLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public DeleteImagesFromLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
