// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBatchTaskRequest extends TeaModel {
    /**
     * <p>The remarks for the offline operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test xx</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The node ID in the node directory tree.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12113111</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>131211211</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static OfflineBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineBatchTaskRequest self = new OfflineBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public OfflineBatchTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public OfflineBatchTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public OfflineBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public OfflineBatchTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
