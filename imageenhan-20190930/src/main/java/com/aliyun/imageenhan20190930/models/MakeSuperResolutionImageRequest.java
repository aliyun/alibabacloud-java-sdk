// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static MakeSuperResolutionImageRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageRequest self = new MakeSuperResolutionImageRequest();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
