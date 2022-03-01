// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentImageRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    public static SegmentImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentImageRequest self = new SegmentImageRequest();
        return TeaModel.build(map, self);
    }

    public SegmentImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
