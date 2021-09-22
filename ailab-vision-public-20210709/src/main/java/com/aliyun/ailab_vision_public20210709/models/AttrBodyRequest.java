// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrBodyRequest extends TeaModel {
    // pic list
    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    public static AttrBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttrBodyRequest self = new AttrBodyRequest();
        return TeaModel.build(map, self);
    }

    public AttrBodyRequest setPictureUrl(java.util.List<String> pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public java.util.List<String> getPictureUrl() {
        return this.pictureUrl;
    }

}
