// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamOpsRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the real-time task file. The value is a string representing a positive integer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7333610201479808</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the operation tenant. The gateway verifies that the current identity has access to the tenant and then injects the tenant ID into the backend.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The optional ID of the operator user. This parameter follows the gateway identity verification rules and is not directly bound to the backend user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListStreamOpsRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStreamOpsRecordsRequest self = new ListStreamOpsRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListStreamOpsRecordsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListStreamOpsRecordsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListStreamOpsRecordsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListStreamOpsRecordsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
