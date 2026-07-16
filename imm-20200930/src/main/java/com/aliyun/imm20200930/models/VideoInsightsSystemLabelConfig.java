// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsSystemLabelConfig extends TeaModel {
    /**
     * <p>Specifies whether system labels are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    public static VideoInsightsSystemLabelConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsSystemLabelConfig self = new VideoInsightsSystemLabelConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsSystemLabelConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
