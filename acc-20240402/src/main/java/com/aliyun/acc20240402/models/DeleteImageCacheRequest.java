// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class DeleteImageCacheRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imc-bp1dj*****</p>
     */
    @NameInMap("ImageCacheId")
    public String imageCacheId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageCacheRequest self = new DeleteImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageCacheRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteImageCacheRequest setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public DeleteImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
