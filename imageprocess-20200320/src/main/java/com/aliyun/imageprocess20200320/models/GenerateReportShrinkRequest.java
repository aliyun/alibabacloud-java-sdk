// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GenerateReportShrinkRequest extends TeaModel {
    @NameInMap("ReportConfigs")
    public String reportConfigsShrink;

    public static GenerateReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportShrinkRequest self = new GenerateReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateReportShrinkRequest setReportConfigsShrink(String reportConfigsShrink) {
        this.reportConfigsShrink = reportConfigsShrink;
        return this;
    }
    public String getReportConfigsShrink() {
        return this.reportConfigsShrink;
    }

}
