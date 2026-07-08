// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditTermsRequest extends TeaModel {
    /**
     * <p>List of rule IDs for user logon audit terms to delete.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>Unique identifier for the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteAuditTermsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuditTermsRequest self = new DeleteAuditTermsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuditTermsRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public DeleteAuditTermsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
