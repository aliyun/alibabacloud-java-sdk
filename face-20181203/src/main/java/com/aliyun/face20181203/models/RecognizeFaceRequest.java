// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class RecognizeFaceRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Content")
    public String content;

    public static RecognizeFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceRequest self = new RecognizeFaceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public RecognizeFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public RecognizeFaceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
