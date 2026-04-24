// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    public static GetImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRequest self = new GetImageRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetImageRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

}
