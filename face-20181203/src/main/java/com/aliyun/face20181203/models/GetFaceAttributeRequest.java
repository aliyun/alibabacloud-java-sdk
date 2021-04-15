// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class GetFaceAttributeRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Content")
    public String content;

    public static GetFaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFaceAttributeRequest self = new GetFaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetFaceAttributeRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetFaceAttributeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
