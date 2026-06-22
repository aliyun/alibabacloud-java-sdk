// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsLabelConfig extends TeaModel {
    @NameInMap("Highlight")
    public VideoInsightsHighlightLabelConfig highlight;

    @NameInMap("System")
    public VideoInsightsSystemLabelConfig system;

    @NameInMap("UserDefined")
    public VideoInsightsUserDefinedLabelConfig userDefined;

    public static VideoInsightsLabelConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsLabelConfig self = new VideoInsightsLabelConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsLabelConfig setHighlight(VideoInsightsHighlightLabelConfig highlight) {
        this.highlight = highlight;
        return this;
    }
    public VideoInsightsHighlightLabelConfig getHighlight() {
        return this.highlight;
    }

    public VideoInsightsLabelConfig setSystem(VideoInsightsSystemLabelConfig system) {
        this.system = system;
        return this;
    }
    public VideoInsightsSystemLabelConfig getSystem() {
        return this.system;
    }

    public VideoInsightsLabelConfig setUserDefined(VideoInsightsUserDefinedLabelConfig userDefined) {
        this.userDefined = userDefined;
        return this;
    }
    public VideoInsightsUserDefinedLabelConfig getUserDefined() {
        return this.userDefined;
    }

}
