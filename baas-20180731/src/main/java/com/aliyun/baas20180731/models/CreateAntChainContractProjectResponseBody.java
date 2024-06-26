// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainContractProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainContractProjectResponseBodyResult result;

    public static CreateAntChainContractProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractProjectResponseBody self = new CreateAntChainContractProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainContractProjectResponseBody setResult(CreateAntChainContractProjectResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainContractProjectResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainContractProjectResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectVersion")
        public String projectVersion;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static CreateAntChainContractProjectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainContractProjectResponseBodyResult self = new CreateAntChainContractProjectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainContractProjectResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateAntChainContractProjectResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateAntChainContractProjectResponseBodyResult setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public CreateAntChainContractProjectResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateAntChainContractProjectResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateAntChainContractProjectResponseBodyResult setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

        public CreateAntChainContractProjectResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
