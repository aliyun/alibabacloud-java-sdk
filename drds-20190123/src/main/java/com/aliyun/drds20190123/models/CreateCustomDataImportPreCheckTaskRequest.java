// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportPreCheckTaskRequest extends TeaModel {
    @NameInMap("ImportParam")
    public java.util.Map<String, ?> importParam;

    public static CreateCustomDataImportPreCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportPreCheckTaskRequest self = new CreateCustomDataImportPreCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportPreCheckTaskRequest setImportParam(java.util.Map<String, ?> importParam) {
        this.importParam = importParam;
        return this;
    }
    public java.util.Map<String, ?> getImportParam() {
        return this.importParam;
    }

}
