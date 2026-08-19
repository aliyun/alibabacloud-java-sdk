// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessShrinkRequest extends TeaModel {
    /**
     * <p>The description of the approval flow. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an approval flow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The matched approval templates.</p>
     */
    @NameInMap("MatchSchemas")
    public String matchSchemasShrink;

    /**
     * <p>The flow name. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_process</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The list of approval nodes. You can define up to 5 approval nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static CreateApprovalProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApprovalProcessShrinkRequest self = new CreateApprovalProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApprovalProcessShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApprovalProcessShrinkRequest setMatchSchemasShrink(String matchSchemasShrink) {
        this.matchSchemasShrink = matchSchemasShrink;
        return this;
    }
    public String getMatchSchemasShrink() {
        return this.matchSchemasShrink;
    }

    public CreateApprovalProcessShrinkRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateApprovalProcessShrinkRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

}
