// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignatureRequest extends TeaModel {
    /**
     * <p>The parameter used only by the frontend.</p>
     * 
     * <strong>example:</strong>
     * <p>仅前端使用</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeFileUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileUploadSignatureRequest self = new DescribeFileUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileUploadSignatureRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public DescribeFileUploadSignatureRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public DescribeFileUploadSignatureRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
