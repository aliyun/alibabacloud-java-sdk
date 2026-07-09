// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorResponseBody extends TeaModel {
    /**
     * <p>The evaluator details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;trace_task_completion&quot;,&quot;type&quot;:&quot;AGENT&quot;,&quot;currentVersion&quot;:&quot;1.0.0&quot;}</p>
     */
    @NameInMap("evaluator")
    public GetEvaluatorResponseBodyEvaluator evaluator;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEvaluatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorResponseBody self = new GetEvaluatorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorResponseBody setEvaluator(GetEvaluatorResponseBodyEvaluator evaluator) {
        this.evaluator = evaluator;
        return this;
    }
    public GetEvaluatorResponseBodyEvaluator getEvaluator() {
        return this.evaluator;
    }

    public GetEvaluatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEvaluatorResponseBodyEvaluatorVersions extends TeaModel {
        /**
         * <p>The time when the version was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>初始版本</p>
         */
        @NameInMap("versionDescription")
        public String versionDescription;

        public static GetEvaluatorResponseBodyEvaluatorVersions build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluatorResponseBodyEvaluatorVersions self = new GetEvaluatorResponseBodyEvaluatorVersions();
            return TeaModel.build(map, self);
        }

        public GetEvaluatorResponseBodyEvaluatorVersions setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetEvaluatorResponseBodyEvaluatorVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetEvaluatorResponseBodyEvaluatorVersions setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class GetEvaluatorResponseBodyEvaluator extends TeaModel {
        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The list of annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;__en&quot;]</p>
         */
        @NameInMap("annotations")
        public java.util.List<String> annotations;

        /**
         * <p>The configuration of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;prompt&quot;:&quot;请评估任务完成度&quot;}</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The time when the evaluator was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The version number returned in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The evaluator description.</p>
         * 
         * <strong>example:</strong>
         * <p>判断 Agent 是否完成用户任务</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>链路任务完成度</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The evaluation metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_task_completion</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The evaluator name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The evaluator properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>The evaluator type.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the evaluator was last updated. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        /**
         * <p>The list of versions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;version&quot;:&quot;1.0.0&quot;}]</p>
         */
        @NameInMap("versions")
        public java.util.List<GetEvaluatorResponseBodyEvaluatorVersions> versions;

        public static GetEvaluatorResponseBodyEvaluator build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluatorResponseBodyEvaluator self = new GetEvaluatorResponseBodyEvaluator();
            return TeaModel.build(map, self);
        }

        public GetEvaluatorResponseBodyEvaluator setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetEvaluatorResponseBodyEvaluator setAnnotations(java.util.List<String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

        public GetEvaluatorResponseBodyEvaluator setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public GetEvaluatorResponseBodyEvaluator setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetEvaluatorResponseBodyEvaluator setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GetEvaluatorResponseBodyEvaluator setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEvaluatorResponseBodyEvaluator setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEvaluatorResponseBodyEvaluator setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetEvaluatorResponseBodyEvaluator setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetEvaluatorResponseBodyEvaluator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEvaluatorResponseBodyEvaluator setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetEvaluatorResponseBodyEvaluator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEvaluatorResponseBodyEvaluator setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetEvaluatorResponseBodyEvaluator setVersions(java.util.List<GetEvaluatorResponseBodyEvaluatorVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetEvaluatorResponseBodyEvaluatorVersions> getVersions() {
            return this.versions;
        }

    }

}
