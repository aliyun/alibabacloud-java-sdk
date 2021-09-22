// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrFaceRequest extends TeaModel {
    // ["xxx1.jpg", "xxx2.jpg"]
    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    public static AttrFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttrFaceRequest self = new AttrFaceRequest();
        return TeaModel.build(map, self);
    }

    public AttrFaceRequest setPictureUrl(java.util.List<String> pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public java.util.List<String> getPictureUrl() {
        return this.pictureUrl;
    }

}
