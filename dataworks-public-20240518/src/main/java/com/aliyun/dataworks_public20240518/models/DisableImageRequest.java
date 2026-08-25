// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DisableImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static DisableImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableImageRequest self = new DisableImageRequest();
        return TeaModel.build(map, self);
    }

    public DisableImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
