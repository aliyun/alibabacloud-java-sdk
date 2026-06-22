// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsMultiStreamConfig extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    public static VideoInsightsMultiStreamConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsMultiStreamConfig self = new VideoInsightsMultiStreamConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsMultiStreamConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
