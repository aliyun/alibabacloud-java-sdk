// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4261A4C3-B8B5-4555-AEBC-944C3EAB23DB</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>DV80nJXq</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1563951889044</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>project description</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <strong>example:</strong>
         * <p>R38DAbop</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>projectname</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("ProjectVersion")
        public String projectVersion;

        /**
         * <strong>example:</strong>
         * <p>1563951889140</p>
         */
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
