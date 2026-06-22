// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ReverseImageConfig extends TeaModel {
    @NameInMap("Image")
    public ImageReverseImageConfig image;

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
