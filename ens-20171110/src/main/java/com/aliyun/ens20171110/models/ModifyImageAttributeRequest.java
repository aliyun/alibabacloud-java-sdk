// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5t4xwkfkbs0uxv0kymdb6uip7</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Image Name</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static ModifyImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeRequest self = new ModifyImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
