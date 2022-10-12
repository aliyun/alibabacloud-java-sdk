// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeAdvanceRequest extends TeaModel {
    @NameInMap("Height")
    public Integer height;

    @NameInMap("Url")
    public java.io.InputStream urlObject;

    @NameInMap("Width")
    public Integer width;

    public static ChangeImageSizeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeAdvanceRequest self = new ChangeImageSizeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ChangeImageSizeAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

    public ChangeImageSizeAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
