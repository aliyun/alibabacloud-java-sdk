// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamOpsRecordRequest extends TeaModel {
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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The ID of the operation record. Set this parameter to the opsRecordId value returned by the ListStreamOpsRecords operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>646</p>
     */
    @NameInMap("OpsRecordId")
    public String opsRecordId;

    /**
     * <p>The ID of the Dataphin project to which the task belongs. This parameter is used for permission verification in the production environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetStreamOpsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStreamOpsRecordRequest self = new GetStreamOpsRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetStreamOpsRecordRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStreamOpsRecordRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetStreamOpsRecordRequest setOpsRecordId(String opsRecordId) {
        this.opsRecordId = opsRecordId;
        return this;
    }
    public String getOpsRecordId() {
        return this.opsRecordId;
    }

    public GetStreamOpsRecordRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
