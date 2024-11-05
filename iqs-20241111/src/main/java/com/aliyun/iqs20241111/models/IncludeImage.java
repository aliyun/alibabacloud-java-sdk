// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class IncludeImage extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>324</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <strong>example:</strong>
     * <p><a href="http://k.sinaimg.cn/n/sinakd20121/594/w2048h946/20240328/74cf-32c0d62e843df76567d760b4459d57c1.jpg/w700d1q75cms.jpg">http://k.sinaimg.cn/n/sinakd20121/594/w2048h946/20240328/74cf-32c0d62e843df76567d760b4459d57c1.jpg/w700d1q75cms.jpg</a></p>
     */
    @NameInMap("imageLink")
    public String imageLink;

    /**
     * <strong>example:</strong>
     * <p>700</p>
     */
    @NameInMap("width")
    public Integer width;

    public static IncludeImage build(java.util.Map<String, ?> map) throws Exception {
        IncludeImage self = new IncludeImage();
        return TeaModel.build(map, self);
    }

    public IncludeImage setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public IncludeImage setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }
    public String getImageLink() {
        return this.imageLink;
    }

    public IncludeImage setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
