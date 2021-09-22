// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class ReidFaceRequest extends TeaModel {
    // pic list
    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    public static ReidFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReidFaceRequest self = new ReidFaceRequest();
        return TeaModel.build(map, self);
    }

    public ReidFaceRequest setPictureUrl(java.util.List<String> pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public java.util.List<String> getPictureUrl() {
        return this.pictureUrl;
    }

}
