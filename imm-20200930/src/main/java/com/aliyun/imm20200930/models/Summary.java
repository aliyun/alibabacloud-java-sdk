// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Summary extends TeaModel {
    @NameInMap("Image")
    public Illustration image;

    @NameInMap("Text")
    public String text;

    public static Summary build(java.util.Map<String, ?> map) throws Exception {
        Summary self = new Summary();
        return TeaModel.build(map, self);
    }

    public Summary setImage(Illustration image) {
        this.image = image;
        return this;
    }
    public Illustration getImage() {
        return this.image;
    }

    public Summary setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
