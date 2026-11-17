// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsConfig extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to record the request content (controls whether question-related attributes are generated). This field is deprecated in new versions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("logRequestContent")
    public Boolean logRequestContent;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to record the response content (controls whether answer-related attributes are generated). This field is deprecated in new versions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("logResponseContent")
    public Boolean logResponseContent;

    /**
     * <p>The list of AI request log field collection configurations, configured by API path.</p>
     */
    @NameInMap("pathFieldConfigs")
    public java.util.List<AiStatisticsConfigPathFieldConfigs> pathFieldConfigs;

    public static AiStatisticsConfig build(java.util.Map<String, ?> map) throws Exception {
        AiStatisticsConfig self = new AiStatisticsConfig();
        return TeaModel.build(map, self);
    }

    public AiStatisticsConfig setLogRequestContent(Boolean logRequestContent) {
        this.logRequestContent = logRequestContent;
        return this;
    }
    public Boolean getLogRequestContent() {
        return this.logRequestContent;
    }

    public AiStatisticsConfig setLogResponseContent(Boolean logResponseContent) {
        this.logResponseContent = logResponseContent;
        return this;
    }
    public Boolean getLogResponseContent() {
        return this.logResponseContent;
    }

    public AiStatisticsConfig setPathFieldConfigs(java.util.List<AiStatisticsConfigPathFieldConfigs> pathFieldConfigs) {
        this.pathFieldConfigs = pathFieldConfigs;
        return this;
    }
    public java.util.List<AiStatisticsConfigPathFieldConfigs> getPathFieldConfigs() {
        return this.pathFieldConfigs;
    }

    public static class AiStatisticsConfigPathFieldConfigs extends TeaModel {
        /**
         * <p>The AI request log field configuration groups corresponding to the API path, passed as a map. The valid keys for the map are fixed to basic and custom, and the values are arrays of log field configurations for the corresponding groups. basic indicates basic log fields, and custom indicates custom log fields. For the current API path, fieldPaths represents the complete desired state of the field configuration. Incremental appending or diff merging is not supported.</p>
         * <p>If pathFieldConfigs is not passed, is passed as null, or is passed as an empty array, the existing log field configurations are not updated. If a non-empty array is passed, a desired state replacement is performed based on the complete set of paths in the request, and historical path configurations not included in the request are deleted.</p>
         * <p>For example, to add a custom field named test to the /v1/chat/completions API path based on the existing configuration, the caller must use the read-merge-full write-back approach:</p>
         * <ol>
         * <li>Read all current path configurations.</li>
         * <li>Retain the current complete basic and custom arrays for the target API path /v1/chat/completions.</li>
         * <li>Append test to the current custom array.</li>
         * <li>Retain the configurations for other API paths as they are.</li>
         * <li>Submit the merged and complete pathFieldConfigs.</li>
         * </ol>
         */
        @NameInMap("fieldPaths")
        public java.util.Map<String, AiStatisticsPathField> fieldPaths;

        /**
         * <p>The API path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        public static AiStatisticsConfigPathFieldConfigs build(java.util.Map<String, ?> map) throws Exception {
            AiStatisticsConfigPathFieldConfigs self = new AiStatisticsConfigPathFieldConfigs();
            return TeaModel.build(map, self);
        }

        public AiStatisticsConfigPathFieldConfigs setFieldPaths(java.util.Map<String, AiStatisticsPathField> fieldPaths) {
            this.fieldPaths = fieldPaths;
            return this;
        }
        public java.util.Map<String, AiStatisticsPathField> getFieldPaths() {
            return this.fieldPaths;
        }

        public AiStatisticsConfigPathFieldConfigs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
