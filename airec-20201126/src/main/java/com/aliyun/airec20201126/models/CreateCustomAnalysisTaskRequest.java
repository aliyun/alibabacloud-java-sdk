// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateCustomAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ITEM_CUSTOM</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateCustomAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAnalysisTaskRequest self = new CreateCustomAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAnalysisTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
