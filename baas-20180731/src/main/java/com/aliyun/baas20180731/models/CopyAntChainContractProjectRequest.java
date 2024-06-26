// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CopyAntChainContractProjectRequest extends TeaModel {
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
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
