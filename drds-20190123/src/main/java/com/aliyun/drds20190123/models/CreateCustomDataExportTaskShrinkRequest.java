// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportTaskShrinkRequest extends TeaModel {
    @NameInMap("ExportParam")
    public String exportParamShrink;

    public static CreateCustomDataExportTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportTaskShrinkRequest self = new CreateCustomDataExportTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportTaskShrinkRequest setExportParamShrink(String exportParamShrink) {
        this.exportParamShrink = exportParamShrink;
        return this;
    }
    public String getExportParamShrink() {
        return this.exportParamShrink;
    }

}
