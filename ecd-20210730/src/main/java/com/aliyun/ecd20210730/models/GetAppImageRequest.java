// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    public static GetAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageRequest self = new GetAppImageRequest();
        return TeaModel.build(map, self);
    }

    public GetAppImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
