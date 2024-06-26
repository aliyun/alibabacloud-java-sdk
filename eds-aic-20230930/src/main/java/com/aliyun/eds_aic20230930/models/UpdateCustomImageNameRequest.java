// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCustomImageNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>imagename</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static UpdateCustomImageNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomImageNameRequest self = new UpdateCustomImageNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomImageNameRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateCustomImageNameRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
