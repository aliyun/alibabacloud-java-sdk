// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskUdfLineagesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12113111</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>131211211</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetBatchTaskUdfLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskUdfLineagesRequest self = new GetBatchTaskUdfLineagesRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskUdfLineagesRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetBatchTaskUdfLineagesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetBatchTaskUdfLineagesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
