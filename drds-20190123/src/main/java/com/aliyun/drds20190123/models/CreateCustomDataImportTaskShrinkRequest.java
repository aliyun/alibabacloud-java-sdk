// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportTaskShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static CreateCustomDataImportTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportTaskShrinkRequest self = new CreateCustomDataImportTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportTaskShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
