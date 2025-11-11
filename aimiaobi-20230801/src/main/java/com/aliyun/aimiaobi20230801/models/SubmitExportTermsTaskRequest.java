// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitExportTermsTaskRequest extends TeaModel {
    @NameInMap("TermsName")
    public String termsName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitExportTermsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportTermsTaskRequest self = new SubmitExportTermsTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitExportTermsTaskRequest setTermsName(String termsName) {
        this.termsName = termsName;
        return this;
    }
    public String getTermsName() {
        return this.termsName;
    }

    public SubmitExportTermsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
