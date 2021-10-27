// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataExportSrcDstTablesShrinkRequest extends TeaModel {
    @NameInMap("ExportParam")
    public String exportParamShrink;

    public static DescribeCustomDataExportSrcDstTablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataExportSrcDstTablesShrinkRequest self = new DescribeCustomDataExportSrcDstTablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataExportSrcDstTablesShrinkRequest setExportParamShrink(String exportParamShrink) {
        this.exportParamShrink = exportParamShrink;
        return this;
    }
    public String getExportParamShrink() {
        return this.exportParamShrink;
    }

}
