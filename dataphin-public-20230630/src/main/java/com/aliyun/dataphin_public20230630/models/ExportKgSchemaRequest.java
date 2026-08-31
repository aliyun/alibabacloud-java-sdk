// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExportKgSchemaRequest extends TeaModel {
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
     * <p>The format of the exported content. Valid values: json and yaml. Default value: yaml.</p>
     * 
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The version number. If this parameter is empty or set to -1, the model metadata in draft state is returned. If this parameter is set to 0, the model metadata of the latest version is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VersionId")
    public Integer versionId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportKgSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportKgSchemaRequest self = new ExportKgSchemaRequest();
        return TeaModel.build(map, self);
    }

    public ExportKgSchemaRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ExportKgSchemaRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ExportKgSchemaRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public ExportKgSchemaRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

    public ExportKgSchemaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
