// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CopyAntChainContractProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>45D67F6F-C723-4AD8-8462-F94EE5FF22E6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>DV80nJXq</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1563953475248</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>copy project description</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <strong>example:</strong>
         * <p>R6XMEdXe</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>copyproject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>v1.0.1</p>
         */
        @NameInMap("ProjectVersion")
        public String projectVersion;

        /**
         * <strong>example:</strong>
         * <p>1563953475248</p>
         */
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
