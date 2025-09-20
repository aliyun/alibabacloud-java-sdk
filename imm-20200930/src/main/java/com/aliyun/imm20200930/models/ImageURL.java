// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageURL extends TeaModel {
    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("URL")
    public String URL;

    public static ImageURL build(java.util.Map<String, ?> map) throws Exception {
        ImageURL self = new ImageURL();
        return TeaModel.build(map, self);
    }

    public ImageURL setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public ImageURL setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
