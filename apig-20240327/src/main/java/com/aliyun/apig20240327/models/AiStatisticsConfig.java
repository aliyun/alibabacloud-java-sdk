// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsConfig extends TeaModel {
    /**
     * <p>Specifies whether to log request content (controls whether question-related attributes are generated).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("logRequestContent")
    public Boolean logRequestContent;

    /**
     * <p>Specifies whether to log response content (controls whether answer-related attributes are generated).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("logResponseContent")
    public Boolean logResponseContent;

    /**
     * <p>The list of custom field collection configurations, configured by API path.</p>
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
         * <p>The field collection configuration.</p>
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
