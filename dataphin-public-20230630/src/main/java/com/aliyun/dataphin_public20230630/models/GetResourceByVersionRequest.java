// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetResourceByVersionRequest extends TeaModel {
    /**
     * <p>The name of the resource file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>udf_sleep.jar</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>The ID of the operator user.</p>
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

    public static GetResourceByVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceByVersionRequest self = new GetResourceByVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceByVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetResourceByVersionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetResourceByVersionRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetResourceByVersionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetResourceByVersionRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
