// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RollbackImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The image version to roll back to.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    public static RollbackImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackImageRequest self = new RollbackImageRequest();
        return TeaModel.build(map, self);
    }

    public RollbackImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RollbackImageRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

}
