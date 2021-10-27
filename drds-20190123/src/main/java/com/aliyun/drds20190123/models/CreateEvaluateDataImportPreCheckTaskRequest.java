// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateDataImportPreCheckTaskRequest extends TeaModel {
    @NameInMap("ImportParam")
    public java.util.Map<String, ?> importParam;

    public static CreateEvaluateDataImportPreCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateDataImportPreCheckTaskRequest self = new CreateEvaluateDataImportPreCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateDataImportPreCheckTaskRequest setImportParam(java.util.Map<String, ?> importParam) {
        this.importParam = importParam;
        return this;
    }
    public java.util.Map<String, ?> getImportParam() {
        return this.importParam;
    }

}
