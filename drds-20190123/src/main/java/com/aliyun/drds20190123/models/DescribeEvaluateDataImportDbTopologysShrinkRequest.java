// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDataImportDbTopologysShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static DescribeEvaluateDataImportDbTopologysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDataImportDbTopologysShrinkRequest self = new DescribeEvaluateDataImportDbTopologysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDataImportDbTopologysShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
