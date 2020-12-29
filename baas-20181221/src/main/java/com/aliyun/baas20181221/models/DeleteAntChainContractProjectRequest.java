// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteAntChainContractProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractProjectRequest self = new DeleteAntChainContractProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
