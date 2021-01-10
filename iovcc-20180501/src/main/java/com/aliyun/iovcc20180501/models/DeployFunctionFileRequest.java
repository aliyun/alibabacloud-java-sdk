// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeployFunctionFileRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("DeployEnv")
    public Integer deployEnv;

    public static DeployFunctionFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployFunctionFileRequest self = new DeployFunctionFileRequest();
        return TeaModel.build(map, self);
    }

    public DeployFunctionFileRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeployFunctionFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeployFunctionFileRequest setDeployEnv(Integer deployEnv) {
        this.deployEnv = deployEnv;
        return this;
    }
    public Integer getDeployEnv() {
        return this.deployEnv;
    }

}
