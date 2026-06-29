// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineResponseBody extends TeaModel {
    /**
     * <p>The time when the Edge Routine was created. The time follows the RFC 3339 standard in the UTC time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The default access record.</p>
     * 
     * <strong>example:</strong>
     * <p>routine1.example.com</p>
     */
    @NameInMap("DefaultRelatedRecord")
    public String defaultRelatedRecord;

    /**
     * <p>The description of the Edge Routine.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of environment context.</p>
     */
    @NameInMap("Envs")
    public java.util.List<GetRoutineResponseBodyEnvs> envs;

    /**
     * <p>Indicates whether the Routine has the Assets tag.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasAssets")
    public Boolean hasAssets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRoutineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineResponseBody self = new GetRoutineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineResponseBody setDefaultRelatedRecord(String defaultRelatedRecord) {
        this.defaultRelatedRecord = defaultRelatedRecord;
        return this;
    }
    public String getDefaultRelatedRecord() {
        return this.defaultRelatedRecord;
    }

    public GetRoutineResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRoutineResponseBody setEnvs(java.util.List<GetRoutineResponseBodyEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<GetRoutineResponseBodyEnvs> getEnvs() {
        return this.envs;
    }

    public GetRoutineResponseBody setHasAssets(Boolean hasAssets) {
        this.hasAssets = hasAssets;
        return this;
    }
    public Boolean getHasAssets() {
        return this.hasAssets;
    }

    public GetRoutineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoutineResponseBodyEnvsCodeDeployCodeVersions extends TeaModel {
        /**
         * <p>The code version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1746583193971399525</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>The time when the code version was created. The time follows the RFC 3339 standard in the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-23T09:01:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>code version 1.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The canary release percentage of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Long percentage;

        public static GetRoutineResponseBodyEnvsCodeDeployCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyEnvsCodeDeployCodeVersions self = new GetRoutineResponseBodyEnvsCodeDeployCodeVersions();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyEnvsCodeDeployCodeVersions setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public GetRoutineResponseBodyEnvsCodeDeployCodeVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRoutineResponseBodyEnvsCodeDeployCodeVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoutineResponseBodyEnvsCodeDeployCodeVersions setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

    }

    public static class GetRoutineResponseBodyEnvsCodeDeploy extends TeaModel {
        /**
         * <p>The list of deployed code version numbers.</p>
         */
        @NameInMap("CodeVersions")
        public java.util.List<GetRoutineResponseBodyEnvsCodeDeployCodeVersions> codeVersions;

        /**
         * <p>The time when the deployment was created. The time follows the RFC 3339 standard in the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-11T09:21:36Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The deployment record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>589267</p>
         */
        @NameInMap("DeployId")
        public String deployId;

        /**
         * <p>The deployment strategy. Default value: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>percentage</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static GetRoutineResponseBodyEnvsCodeDeploy build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyEnvsCodeDeploy self = new GetRoutineResponseBodyEnvsCodeDeploy();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyEnvsCodeDeploy setCodeVersions(java.util.List<GetRoutineResponseBodyEnvsCodeDeployCodeVersions> codeVersions) {
            this.codeVersions = codeVersions;
            return this;
        }
        public java.util.List<GetRoutineResponseBodyEnvsCodeDeployCodeVersions> getCodeVersions() {
            return this.codeVersions;
        }

        public GetRoutineResponseBodyEnvsCodeDeploy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetRoutineResponseBodyEnvsCodeDeploy setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public GetRoutineResponseBodyEnvsCodeDeploy setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class GetRoutineResponseBodyEnvs extends TeaModel {
        /**
         * <p>The percentage-based canary release deployment information.</p>
         */
        @NameInMap("CodeDeploy")
        public GetRoutineResponseBodyEnvsCodeDeploy codeDeploy;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("Env")
        public String env;

        public static GetRoutineResponseBodyEnvs build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyEnvs self = new GetRoutineResponseBodyEnvs();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyEnvs setCodeDeploy(GetRoutineResponseBodyEnvsCodeDeploy codeDeploy) {
            this.codeDeploy = codeDeploy;
            return this;
        }
        public GetRoutineResponseBodyEnvsCodeDeploy getCodeDeploy() {
            return this.codeDeploy;
        }

        public GetRoutineResponseBodyEnvs setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

    }

}
