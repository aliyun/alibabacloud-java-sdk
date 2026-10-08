// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsight extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The multilingual video information content.</p>
     */
    @NameInMap("MultilingualContent")
    public java.util.Map<String, MultilingualContentEntry> multilingualContent;

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

    public VideoInsight setMultilingualContent(java.util.Map<String, MultilingualContentEntry> multilingualContent) {
        this.multilingualContent = multilingualContent;
        return this;
    }
    public java.util.Map<String, MultilingualContentEntry> getMultilingualContent() {
        return this.multilingualContent;
    }

}
