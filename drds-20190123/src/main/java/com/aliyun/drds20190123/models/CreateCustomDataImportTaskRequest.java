// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportTaskRequest extends TeaModel {
    @NameInMap("ImportParam")
    public java.util.Map<String, ?> importParam;

    public static CreateCustomDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportTaskRequest self = new CreateCustomDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportTaskRequest setImportParam(java.util.Map<String, ?> importParam) {
        this.importParam = importParam;
        return this;
    }
    public java.util.Map<String, ?> getImportParam() {
        return this.importParam;
    }

}
