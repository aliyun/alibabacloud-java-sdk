// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishDataServiceApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

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
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static PublishDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDataServiceApiRequest self = new PublishDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public PublishDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public PublishDataServiceApiRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishDataServiceApiRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public PublishDataServiceApiRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
