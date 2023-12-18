// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The ID of the image. You can specify only one image ID.</p>
     * <br>
     * <p>You can delete only custom images that you created.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
