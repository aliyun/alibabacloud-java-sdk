// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportPreCheckTaskShrinkRequest extends TeaModel {
    @NameInMap("ExportParam")
    public String exportParamShrink;

    public static CreateCustomDataExportPreCheckTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportPreCheckTaskShrinkRequest self = new CreateCustomDataExportPreCheckTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportPreCheckTaskShrinkRequest setExportParamShrink(String exportParamShrink) {
        this.exportParamShrink = exportParamShrink;
        return this;
    }
    public String getExportParamShrink() {
        return this.exportParamShrink;
    }

}
