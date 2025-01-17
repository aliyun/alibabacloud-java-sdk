// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaObject extends TeaModel {
    @NameInMap("Media")
    public String media;

    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    public static MediaObject build(java.util.Map<String, ?> map) throws Exception {
        MediaObject self = new MediaObject();
        return TeaModel.build(map, self);
    }

    public MediaObject setMedia(String media) {
        this.media = media;
        return this;
    }
    public String getMedia() {
        return this.media;
    }

    public MediaObject setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MediaObject setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
