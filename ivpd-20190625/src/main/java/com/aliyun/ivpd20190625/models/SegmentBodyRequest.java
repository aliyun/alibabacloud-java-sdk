// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentBodyRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static SegmentBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyRequest self = new SegmentBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentBodyRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
