// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTemplateVersionsRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li>DEV: development environment.</li>
     * <li>PROD: production environment.</li>
     * </ul>
     * <p>Default value for dev_prod projects: DEV.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

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
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static GetBatchTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTemplateVersionsRequest self = new GetBatchTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTemplateVersionsRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetBatchTemplateVersionsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetBatchTemplateVersionsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetBatchTemplateVersionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetBatchTemplateVersionsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
