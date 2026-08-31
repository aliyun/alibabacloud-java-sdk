// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfByVersionRequest extends TeaModel {
    /**
     * <p>The ID of the user-defined function.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1123</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>1030111021</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionId")
    public Long versionId;

    public static GetUdfByVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUdfByVersionRequest self = new GetUdfByVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetUdfByVersionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUdfByVersionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetUdfByVersionRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetUdfByVersionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetUdfByVersionRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
