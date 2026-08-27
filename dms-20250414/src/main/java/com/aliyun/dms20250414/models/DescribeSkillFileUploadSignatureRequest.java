// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeSkillFileUploadSignatureRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aci5e5yd***********0crv</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeSkillFileUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillFileUploadSignatureRequest self = new DescribeSkillFileUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSkillFileUploadSignatureRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
