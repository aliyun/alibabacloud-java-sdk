// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class RecreateImageRequest extends TeaModel {
    @NameInMap("ImageUid")
    public String imageUid;

    public static RecreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecreateImageRequest self = new RecreateImageRequest();
        return TeaModel.build(map, self);
    }

    public RecreateImageRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

}
