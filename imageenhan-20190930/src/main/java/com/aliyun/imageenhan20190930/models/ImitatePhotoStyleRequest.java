// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("StyleUrl")
    public String styleUrl;

    public static ImitatePhotoStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleRequest self = new ImitatePhotoStyleRequest();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ImitatePhotoStyleRequest setStyleUrl(String styleUrl) {
        this.styleUrl = styleUrl;
        return this;
    }
    public String getStyleUrl() {
        return this.styleUrl;
    }

}
