// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaObject extends TeaModel {
    /**
     * <p>The identifier for the media file.</p>
     * <ul>
     * <li>If Type is set to OSS, the value is the URL of the media file. The following formats are supported: oss://... and https://...</li>
     * <li>If Type is set to Media, the value is the ID of the media asset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucket.loction.aliyuncs.com/path/to/video.mp4">http://bucket.loction.aliyuncs.com/path/to/video.mp4</a></p>
     */
    @NameInMap("Media")
    public String media;

    /**
     * <p>The type of media source. Valid values:</p>
     * <ul>
     * <li>OSS: an OSS object.</li>
     * <li>Media: a media asset.</li>
     * <li>ExternalURL: a publicly accessible external URL. This is not available for public use.</li>
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
