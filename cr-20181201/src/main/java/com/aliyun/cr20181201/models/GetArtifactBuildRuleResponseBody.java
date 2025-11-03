// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildRuleResponseBody extends TeaModel {
    /**
     * <p>The type of the artifact. Valid values:</p>
     * <ul>
     * <li><code>ACCELERATED_IMAGE</code>: accelerated images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The ID of the artifact building rule.</p>
     * 
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
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>Additional parameters.</p>
     */
    @NameInMap("Parameters")
    public GetArtifactBuildRuleResponseBodyParameters parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A3E98F6-296C-54AC-A612-B75E7777D4C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the effective range of the artifact building rule.</p>
     * <ul>
     * <li>The parameter value is the ID of the image repository.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>crr-8dz3aedjqlmk****</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <p>The effective range of the artifact building rule. Valid values:</p>
     * <ul>
     * <li><code>REPOSITORY</code>: The artifact building rule is effective in the repository level.</li>
     * </ul>
     * 
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
        /**
         * <p>Indicates whether the index-only mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ImageIndexOnly")
        public Boolean imageIndexOnly;

        /**
         * <p>The list of files that you want to prefetch when you use the image acceleration feature. Each entry contains the Base64-encoded absolute path of a file.</p>
         * 
         * <strong>example:</strong>
         * <p>L2hvbWUvdGVzdC8=</p>
         */
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
