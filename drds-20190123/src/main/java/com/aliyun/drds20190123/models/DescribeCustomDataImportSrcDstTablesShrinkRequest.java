// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataImportSrcDstTablesShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static DescribeCustomDataImportSrcDstTablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataImportSrcDstTablesShrinkRequest self = new DescribeCustomDataImportSrcDstTablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataImportSrcDstTablesShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
