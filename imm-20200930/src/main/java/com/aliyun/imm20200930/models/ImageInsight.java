// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageInsight extends TeaModel {
    /**
     * <p>Image summary.</p>
     * <blockquote>
     * <p> Not supported.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    public static ImageInsight build(java.util.Map<String, ?> map) throws Exception {
        ImageInsight self = new ImageInsight();
        return TeaModel.build(map, self);
    }

    public ImageInsight setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public ImageInsight setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
