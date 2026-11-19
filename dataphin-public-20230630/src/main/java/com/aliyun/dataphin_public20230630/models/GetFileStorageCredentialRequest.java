// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetFileStorageCredentialRequest extends TeaModel {
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
     * <p>The project ID. This parameter is required when the temporary authorization is used to create resource files.</p>
     * 
     * <strong>example:</strong>
     * <p>1030131021</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The purpose of the authorization. Valid values:</p>
     * <ul>
     * <li>RESOURCE: Creates resource files.</li>
     * <li>COMPUTE_SOURCE_SETTING: Configures storage and compute sources.</li>
     * <li>NONE: Indicates no specific purpose.
     * Default value: NONE.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RESOURCE</p>
     */
    @NameInMap("Purpose")
    public String purpose;

    /**
     * <p>Specifies whether to use the internal network address. Default value: false.</p>
     */
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

    public GetFileStorageCredentialRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
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
