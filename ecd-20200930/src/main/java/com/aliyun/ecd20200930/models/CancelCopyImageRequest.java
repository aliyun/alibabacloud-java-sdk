// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCopyImageRequest extends TeaModel {
    /**
     * <p>The ID of the image that is being copied.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CancelCopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCopyImageRequest self = new CancelCopyImageRequest();
        return TeaModel.build(map, self);
    }

    public CancelCopyImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CancelCopyImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
