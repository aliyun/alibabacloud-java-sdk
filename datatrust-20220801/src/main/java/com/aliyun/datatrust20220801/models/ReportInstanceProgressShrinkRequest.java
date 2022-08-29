// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ReportInstanceProgressShrinkRequest extends TeaModel {
    @NameInMap("ProgressInfo")
    public String progressInfoShrink;

    public static ReportInstanceProgressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportInstanceProgressShrinkRequest self = new ReportInstanceProgressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReportInstanceProgressShrinkRequest setProgressInfoShrink(String progressInfoShrink) {
        this.progressInfoShrink = progressInfoShrink;
        return this;
    }
    public String getProgressInfoShrink() {
        return this.progressInfoShrink;
    }

}
