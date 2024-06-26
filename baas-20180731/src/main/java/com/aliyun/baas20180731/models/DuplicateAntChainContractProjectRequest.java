// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DuplicateAntChainContractProjectRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectVersion")
    public String projectVersion;

    public static DuplicateAntChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DuplicateAntChainContractProjectRequest self = new DuplicateAntChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public DuplicateAntChainContractProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DuplicateAntChainContractProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DuplicateAntChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DuplicateAntChainContractProjectRequest setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public String getProjectVersion() {
        return this.projectVersion;
    }

}
