// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Insights extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Image")
    public ImageInsight image;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Video")
    public VideoInsight video;

    public static Insights build(java.util.Map<String, ?> map) throws Exception {
        Insights self = new Insights();
        return TeaModel.build(map, self);
    }

    public Insights setImage(ImageInsight image) {
        this.image = image;
        return this;
    }
    public ImageInsight getImage() {
        return this.image;
    }

    public Insights setVideo(VideoInsight video) {
        this.video = video;
        return this;
    }
    public VideoInsight getVideo() {
        return this.video;
    }

}
