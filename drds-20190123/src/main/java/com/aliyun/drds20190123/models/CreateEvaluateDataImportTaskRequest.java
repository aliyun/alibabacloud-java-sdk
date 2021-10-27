// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateDataImportTaskRequest extends TeaModel {
    @NameInMap("ImportParam")
    public java.util.Map<String, ?> importParam;

    public static CreateEvaluateDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateDataImportTaskRequest self = new CreateEvaluateDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateDataImportTaskRequest setImportParam(java.util.Map<String, ?> importParam) {
        this.importParam = importParam;
        return this;
    }
    public java.util.Map<String, ?> getImportParam() {
        return this.importParam;
    }

}
