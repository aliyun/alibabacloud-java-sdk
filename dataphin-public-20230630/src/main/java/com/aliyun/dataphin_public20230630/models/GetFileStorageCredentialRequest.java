// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetFileStorageCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>1030131021</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>RESOURCE</p>
     */
    @NameInMap("Purpose")
    public String purpose;

    @NameInMap("UseVpcEndpoint")
    public Boolean useVpcEndpoint;

    public static GetFileStorageCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileStorageCredentialRequest self = new GetFileStorageCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetFileStorageCredentialRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetFileStorageCredentialRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetFileStorageCredentialRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public GetFileStorageCredentialRequest setUseVpcEndpoint(Boolean useVpcEndpoint) {
        this.useVpcEndpoint = useVpcEndpoint;
        return this;
    }
    public Boolean getUseVpcEndpoint() {
        return this.useVpcEndpoint;
    }

}
