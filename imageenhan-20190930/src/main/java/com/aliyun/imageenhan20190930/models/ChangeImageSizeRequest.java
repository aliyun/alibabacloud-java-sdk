// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeRequest extends TeaModel {
    @NameInMap("Height")
    public Integer height;

    @NameInMap("Url")
    public String url;

    @NameInMap("Width")
    public Integer width;

    public static ChangeImageSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeRequest self = new ChangeImageSizeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ChangeImageSizeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ChangeImageSizeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
