// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaObject extends TeaModel {
    /**
     * <p>The file media asset.</p>
     * <ul>
     * <li>If Type is OSS, Media is a URL and supports the OSS and HTTP protocols.     </li>
     * <li>If Type is Media, Media is a media asset ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucket.loction.aliyuncs.com/path/to/video.mp4">http://bucket.loction.aliyuncs.com/path/to/video.mp4</a></p>
     */
    @NameInMap("Media")
    public String media;

    /**
     * <p>The input type. Valid values:</p>
     * <ul>
     * <li>OSS: Alibaba Cloud OSS file </li>
     * <li>Media: Media asset</li>
     * <li>ExternalURL: External URL, not currently publicly supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Type")
    public String type;

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

}
