// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractProjectRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProjectVersion")
    public String projectVersion;

    @NameInMap("ProjectDescription")
    public String projectDescription;

    public static CreateAntChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractProjectRequest self = new CreateAntChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractProjectRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateAntChainContractProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAntChainContractProjectRequest setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

    public CreateAntChainContractProjectRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

}
