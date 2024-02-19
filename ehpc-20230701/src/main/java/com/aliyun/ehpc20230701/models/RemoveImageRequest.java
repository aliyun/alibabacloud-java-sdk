// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class RemoveImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

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

}
