// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MatchSchemas")
    public String matchSchemasShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static UpdateApprovalProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessShrinkRequest self = new UpdateApprovalProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApprovalProcessShrinkRequest setMatchSchemasShrink(String matchSchemasShrink) {
        this.matchSchemasShrink = matchSchemasShrink;
        return this;
    }
    public String getMatchSchemasShrink() {
        return this.matchSchemasShrink;
    }

    public UpdateApprovalProcessShrinkRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateApprovalProcessShrinkRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public UpdateApprovalProcessShrinkRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

}
