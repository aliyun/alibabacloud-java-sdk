// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsHighlightLabelConfig extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Labels")
    public java.util.List<InsightsLabel> labels;

    public static VideoInsightsHighlightLabelConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsHighlightLabelConfig self = new VideoInsightsHighlightLabelConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsHighlightLabelConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public VideoInsightsHighlightLabelConfig setLabels(java.util.List<InsightsLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<InsightsLabel> getLabels() {
        return this.labels;
    }

}
