// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReverseImageConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable the feature.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    public static VideoReverseImageConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoReverseImageConfig self = new VideoReverseImageConfig();
        return TeaModel.build(map, self);
    }

    public VideoReverseImageConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
