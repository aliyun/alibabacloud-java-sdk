// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateDataImportPreCheckTaskShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static CreateEvaluateDataImportPreCheckTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateDataImportPreCheckTaskShrinkRequest self = new CreateEvaluateDataImportPreCheckTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateDataImportPreCheckTaskShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
