// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageReverseImageConfig extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    public static ImageReverseImageConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageReverseImageConfig self = new ImageReverseImageConfig();
        return TeaModel.build(map, self);
    }

    public ImageReverseImageConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
