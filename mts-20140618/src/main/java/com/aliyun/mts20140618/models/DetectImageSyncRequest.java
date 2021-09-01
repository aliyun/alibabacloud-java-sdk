// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DetectImageSyncRequest extends TeaModel {
    // 图片url链接
    @NameInMap("Image")
    public String image;

    public static DetectImageSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageSyncRequest self = new DetectImageSyncRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageSyncRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
