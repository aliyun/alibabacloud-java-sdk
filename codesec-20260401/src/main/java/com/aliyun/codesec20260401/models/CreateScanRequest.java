// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateScanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanRequest self = new CreateScanRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanRequest setCodeBundleId(Long codeBundleId) {
        this.codeBundleId = codeBundleId;
        return this;
    }
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    public CreateScanRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateScanRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
