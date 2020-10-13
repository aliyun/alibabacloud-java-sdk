// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinRequest extends TeaModel {
    @NameInMap("URL")
    @Validation(required = true)
    public String URL;

    public static SegmentSkinRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinRequest self = new SegmentSkinRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSkinRequest setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
