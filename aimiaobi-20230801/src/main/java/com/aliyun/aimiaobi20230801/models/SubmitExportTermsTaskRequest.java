// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitExportTermsTaskRequest extends TeaModel {
    /**
     * <p>Name of the dictionary. Optional. If you do not specify a value, the default name is used.</p>
     */
    @NameInMap("TermsName")
    public String termsName;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
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
