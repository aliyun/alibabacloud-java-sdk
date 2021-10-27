// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportPreCheckTaskShrinkRequest extends TeaModel {
    @NameInMap("ImportParam")
    public String importParamShrink;

    public static CreateCustomDataImportPreCheckTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportPreCheckTaskShrinkRequest self = new CreateCustomDataImportPreCheckTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportPreCheckTaskShrinkRequest setImportParamShrink(String importParamShrink) {
        this.importParamShrink = importParamShrink;
        return this;
    }
    public String getImportParamShrink() {
        return this.importParamShrink;
    }

}
