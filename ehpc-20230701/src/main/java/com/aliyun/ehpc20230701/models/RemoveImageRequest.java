// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class RemoveImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    public static RemoveImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageRequest self = new RemoveImageRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RemoveImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
