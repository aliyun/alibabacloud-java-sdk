// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DistributeImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DistributeRegionList")
    public java.util.List<String> distributeRegionList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    public static DistributeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DistributeImageRequest self = new DistributeImageRequest();
        return TeaModel.build(map, self);
    }

    public DistributeImageRequest setDistributeRegionList(java.util.List<String> distributeRegionList) {
        this.distributeRegionList = distributeRegionList;
        return this;
    }
    public java.util.List<String> getDistributeRegionList() {
        return this.distributeRegionList;
    }

    public DistributeImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
