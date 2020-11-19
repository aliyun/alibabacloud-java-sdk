// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportTaskRequest extends TeaModel {
    @NameInMap("ExportParam")
    public java.util.Map<String, ?> exportParam;

    public static CreateCustomDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportTaskRequest self = new CreateCustomDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportTaskRequest setExportParam(java.util.Map<String, ?> exportParam) {
        this.exportParam = exportParam;
        return this;
    }
    public java.util.Map<String, ?> getExportParam() {
        return this.exportParam;
    }

}
