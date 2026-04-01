// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PluginAnalysisResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<PluginAnalysisResponseBodyResult> result;

    public static PluginAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PluginAnalysisResponseBody self = new PluginAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public PluginAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PluginAnalysisResponseBody setResult(java.util.List<PluginAnalysisResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PluginAnalysisResponseBodyResult> getResult() {
        return this.result;
    }

    public static class PluginAnalysisResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>plugin description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("elasticsearchVersion")
        public String elasticsearchVersion;

        /**
         * <strong>example:</strong>
         * <p>plugin_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("securityPolicy")
        public String securityPolicy;

        /**
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("version")
        public String version;

        public static PluginAnalysisResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PluginAnalysisResponseBodyResult self = new PluginAnalysisResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PluginAnalysisResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PluginAnalysisResponseBodyResult setElasticsearchVersion(String elasticsearchVersion) {
            this.elasticsearchVersion = elasticsearchVersion;
            return this;
        }
        public String getElasticsearchVersion() {
            return this.elasticsearchVersion;
        }

        public PluginAnalysisResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PluginAnalysisResponseBodyResult setSecurityPolicy(String securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public String getSecurityPolicy() {
            return this.securityPolicy;
        }

        public PluginAnalysisResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
