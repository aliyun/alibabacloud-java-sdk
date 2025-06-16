// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditRequest extends TeaModel {
    @NameInMap("SubCodes")
    public java.util.List<String> subCodes;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitSmartAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartAuditRequest self = new SubmitSmartAuditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartAuditRequest setSubCodes(java.util.List<String> subCodes) {
        this.subCodes = subCodes;
        return this;
    }
    public java.util.List<String> getSubCodes() {
        return this.subCodes;
    }

    public SubmitSmartAuditRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitSmartAuditRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
