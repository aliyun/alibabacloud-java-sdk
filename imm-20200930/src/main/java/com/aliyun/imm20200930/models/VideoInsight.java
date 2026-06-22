// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsight extends TeaModel {
    /**
     * <p>Video summary.</p>
     * 
     * <strong>example:</strong>
     * <p>视频中展示了两个不同场景：一个是静止的白色盘子、黑色瓶子和透明玻璃杯，另一个是手拿着标有“YEZOLU”的洗发水瓶在浴室中缓慢上移。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The description of the video file.</p>
     * <blockquote>
     * <p> Not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>无。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    public static VideoInsight build(java.util.Map<String, ?> map) throws Exception {
        VideoInsight self = new VideoInsight();
        return TeaModel.build(map, self);
    }

    public VideoInsight setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public VideoInsight setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
