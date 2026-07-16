// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsUserDefinedLabelConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The list of custom labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<InsightsLabel> labels;

    /**
     * <p>The custom label matching mode. The SDK passes this as an optional string.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static VideoInsightsUserDefinedLabelConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsUserDefinedLabelConfig self = new VideoInsightsUserDefinedLabelConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsUserDefinedLabelConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public VideoInsightsUserDefinedLabelConfig setLabels(java.util.List<InsightsLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<InsightsLabel> getLabels() {
        return this.labels;
    }

    public VideoInsightsUserDefinedLabelConfig setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
