// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CopyAntChainContractProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CopyAntChainContractProjectResponseBodyResult result;

    public static CopyAntChainContractProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyAntChainContractProjectResponseBody self = new CopyAntChainContractProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyAntChainContractProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyAntChainContractProjectResponseBody setResult(CopyAntChainContractProjectResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CopyAntChainContractProjectResponseBodyResult getResult() {
        return this.result;
    }

    public static class CopyAntChainContractProjectResponseBodyResult extends TeaModel {
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

        public static CopyAntChainContractProjectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CopyAntChainContractProjectResponseBodyResult self = new CopyAntChainContractProjectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CopyAntChainContractProjectResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CopyAntChainContractProjectResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CopyAntChainContractProjectResponseBodyResult setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public CopyAntChainContractProjectResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CopyAntChainContractProjectResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CopyAntChainContractProjectResponseBodyResult setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

        public CopyAntChainContractProjectResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
