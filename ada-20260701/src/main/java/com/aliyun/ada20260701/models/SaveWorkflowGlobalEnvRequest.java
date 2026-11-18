// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SaveWorkflowGlobalEnvRequest extends TeaModel {
    /**
     * <p>The configuration content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MODE=demo</p>
     */
    @NameInMap("Content")
    public String content;

    public static SaveWorkflowGlobalEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkflowGlobalEnvRequest self = new SaveWorkflowGlobalEnvRequest();
        return TeaModel.build(map, self);
    }

    public SaveWorkflowGlobalEnvRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
