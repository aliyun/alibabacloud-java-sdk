// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class ReidBodyRequest extends TeaModel {
    // pictureUrl list
    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    public static ReidBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        ReidBodyRequest self = new ReidBodyRequest();
        return TeaModel.build(map, self);
    }

    public ReidBodyRequest setPictureUrl(java.util.List<String> pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public java.util.List<String> getPictureUrl() {
        return this.pictureUrl;
    }

}
