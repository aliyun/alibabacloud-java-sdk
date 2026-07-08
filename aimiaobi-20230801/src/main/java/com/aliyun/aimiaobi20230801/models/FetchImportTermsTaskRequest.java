// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImportTermsTaskRequest extends TeaModel {
    /**
     * <p>The FileKey of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FetchImportTermsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchImportTermsTaskRequest self = new FetchImportTermsTaskRequest();
        return TeaModel.build(map, self);
    }

    public FetchImportTermsTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FetchImportTermsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
