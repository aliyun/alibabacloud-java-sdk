// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class RemoveImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp14wakr1rkxtb******</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the images. Valid values:</p>
     * <ul>
     * <li>VM: Virtual Machine Image</li>
     * <li>Container: container image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

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

    public RemoveImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

}
