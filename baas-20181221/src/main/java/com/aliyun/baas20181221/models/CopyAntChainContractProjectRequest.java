// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CopyAntChainContractProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>copy project description</p>
     */
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2L9VK68g</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>copyproject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.1</p>
     */
    @NameInMap("ProjectVersion")
    public String projectVersion;

    public static CopyAntChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyAntChainContractProjectRequest self = new CopyAntChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public CopyAntChainContractProjectRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public CopyAntChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CopyAntChainContractProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CopyAntChainContractProjectRequest setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

}
