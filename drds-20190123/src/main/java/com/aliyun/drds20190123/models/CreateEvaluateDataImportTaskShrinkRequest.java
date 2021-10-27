// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateDataImportTaskShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static CreateEvaluateDataImportTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateDataImportTaskShrinkRequest self = new CreateEvaluateDataImportTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateDataImportTaskShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
