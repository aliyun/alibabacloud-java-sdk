// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsConfig extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to log request content (controls whether question-related attributes are generated). This parameter is deprecated in the new version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("logRequestContent")
    public Boolean logRequestContent;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to log response content (controls whether answer-related attributes are generated). This parameter is deprecated in the new version.</p>
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
         * <p>The log field configuration groups for the AI request log corresponding to the API path. Pass this parameter as a map. The valid keys of the map are fixed as basic and custom. The values are arrays of log field configurations for the corresponding group. basic indicates basic log fields, and custom indicates custom log fields. For the current API path, fieldPaths represents the complete desired state of the field configuration and does not support incremental appending or diff merging.</p>
         * <p>If pathFieldConfigs is not passed, is set to null, or is an empty array, the existing log field configurations are not updated. If a non-empty array is passed, the system performs a full desired state replacement based on the complete set of paths in the request. Historical path configurations that are not included are deleted.</p>
         * <p>For example, to add a custom field test to the /v1/chat/completions API path on top of the existing configuration, the caller must use a read-merge-write-back approach:</p>
         * <ol>
         * <li>Read all current path configurations.</li>
         * <li>Retain the complete basic array and custom array for the target API path /v1/chat/completions.</li>
         * <li>Append test to the current custom array.</li>
         * <li>Retain the configurations of other API paths as-is.</li>
         * <li>Submit the merged complete pathFieldConfigs.</li>
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
