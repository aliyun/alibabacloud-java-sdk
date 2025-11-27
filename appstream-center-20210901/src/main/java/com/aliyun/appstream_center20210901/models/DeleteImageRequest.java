// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The ID of the RDS image.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
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
