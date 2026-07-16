// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ReverseImageConfig extends TeaModel {
    /**
     * <p>The image-to-image search configuration.</p>
     */
    @NameInMap("Image")
    public ImageReverseImageConfig image;

    /**
     * <p>The image-to-video search configuration.</p>
     */
    @NameInMap("Video")
    public VideoReverseImageConfig video;

    public static ReverseImageConfig build(java.util.Map<String, ?> map) throws Exception {
        ReverseImageConfig self = new ReverseImageConfig();
        return TeaModel.build(map, self);
    }

    public ReverseImageConfig setImage(ImageReverseImageConfig image) {
        this.image = image;
        return this;
    }
    public ImageReverseImageConfig getImage() {
        return this.image;
    }

    public ReverseImageConfig setVideo(VideoReverseImageConfig video) {
        this.video = video;
        return this;
    }
    public VideoReverseImageConfig getVideo() {
        return this.video;
    }

}
