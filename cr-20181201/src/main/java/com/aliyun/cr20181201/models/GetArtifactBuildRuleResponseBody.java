// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <strong>example:</strong>
     * <p>crabr-o2670wqz2n70****</p>
     */
    @NameInMap("BuildRuleId")
    public String buildRuleId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Parameters")
    public GetArtifactBuildRuleResponseBodyParameters parameters;

    /**
     * <strong>example:</strong>
     * <p>7A3E98F6-296C-54AC-A612-B75E7777D4C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>crr-8dz3aedjqlmk****</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <strong>example:</strong>
     * <p>REPOSITORY</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static GetArtifactBuildRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildRuleResponseBody self = new GetArtifactBuildRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildRuleResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetArtifactBuildRuleResponseBody setBuildRuleId(String buildRuleId) {
        this.buildRuleId = buildRuleId;
        return this;
    }
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    public GetArtifactBuildRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactBuildRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactBuildRuleResponseBody setParameters(GetArtifactBuildRuleResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public GetArtifactBuildRuleResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public GetArtifactBuildRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactBuildRuleResponseBody setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public GetArtifactBuildRuleResponseBody setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public static class GetArtifactBuildRuleResponseBodyParameters extends TeaModel {
        @NameInMap("ImageIndexOnly")
        public Boolean imageIndexOnly;

        @NameInMap("PriorityFile")
        public String priorityFile;

        public static GetArtifactBuildRuleResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildRuleResponseBodyParameters self = new GetArtifactBuildRuleResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetArtifactBuildRuleResponseBodyParameters setImageIndexOnly(Boolean imageIndexOnly) {
            this.imageIndexOnly = imageIndexOnly;
            return this;
        }
        public Boolean getImageIndexOnly() {
            return this.imageIndexOnly;
        }

        public GetArtifactBuildRuleResponseBodyParameters setPriorityFile(String priorityFile) {
            this.priorityFile = priorityFile;
            return this;
        }
        public String getPriorityFile() {
            return this.priorityFile;
        }

    }

}
