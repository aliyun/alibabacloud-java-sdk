// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetStatus extends TeaModel {
    @NameInMap("observedGeneration")
    public Long observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("outputs")
    public ToolsetStatusOutputs outputs;

    /**
     * <strong>example:</strong>
     * <p>Installed</p>
     */
    @NameInMap("phase")
    public String phase;

    public static ToolsetStatus build(java.util.Map<String, ?> map) throws Exception {
        ToolsetStatus self = new ToolsetStatus();
        return TeaModel.build(map, self);
    }

    public ToolsetStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public ToolsetStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public ToolsetStatus setOutputs(ToolsetStatusOutputs outputs) {
        this.outputs = outputs;
        return this;
    }
    public ToolsetStatusOutputs getOutputs() {
        return this.outputs;
    }

    public ToolsetStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public static class ToolsetStatusOutputsMcpServerConfig extends TeaModel {
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        @NameInMap("transportType")
        public String transportType;

        @NameInMap("url")
        public String url;

        public static ToolsetStatusOutputsMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            ToolsetStatusOutputsMcpServerConfig self = new ToolsetStatusOutputsMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public ToolsetStatusOutputsMcpServerConfig setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public ToolsetStatusOutputsMcpServerConfig setTransportType(String transportType) {
            this.transportType = transportType;
            return this;
        }
        public String getTransportType() {
            return this.transportType;
        }

        public ToolsetStatusOutputsMcpServerConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ToolsetStatusOutputsUrls extends TeaModel {
        @NameInMap("internetUrl")
        public String internetUrl;

        @NameInMap("intranetUrl")
        public String intranetUrl;

        public static ToolsetStatusOutputsUrls build(java.util.Map<String, ?> map) throws Exception {
            ToolsetStatusOutputsUrls self = new ToolsetStatusOutputsUrls();
            return TeaModel.build(map, self);
        }

        public ToolsetStatusOutputsUrls setInternetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }
        public String getInternetUrl() {
            return this.internetUrl;
        }

        public ToolsetStatusOutputsUrls setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

    }

    public static class ToolsetStatusOutputs extends TeaModel {
        @NameInMap("functionArn")
        public String functionArn;

        @NameInMap("mcpServerConfig")
        public ToolsetStatusOutputsMcpServerConfig mcpServerConfig;

        @NameInMap("openApiTools")
        public java.util.List<OpenAPIToolMeta> openApiTools;

        @NameInMap("tools")
        public java.util.List<MCPToolMeta> tools;

        @NameInMap("urls")
        public ToolsetStatusOutputsUrls urls;

        public static ToolsetStatusOutputs build(java.util.Map<String, ?> map) throws Exception {
            ToolsetStatusOutputs self = new ToolsetStatusOutputs();
            return TeaModel.build(map, self);
        }

        public ToolsetStatusOutputs setFunctionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }
        public String getFunctionArn() {
            return this.functionArn;
        }

        public ToolsetStatusOutputs setMcpServerConfig(ToolsetStatusOutputsMcpServerConfig mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public ToolsetStatusOutputsMcpServerConfig getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public ToolsetStatusOutputs setOpenApiTools(java.util.List<OpenAPIToolMeta> openApiTools) {
            this.openApiTools = openApiTools;
            return this;
        }
        public java.util.List<OpenAPIToolMeta> getOpenApiTools() {
            return this.openApiTools;
        }

        public ToolsetStatusOutputs setTools(java.util.List<MCPToolMeta> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<MCPToolMeta> getTools() {
            return this.tools;
        }

        public ToolsetStatusOutputs setUrls(ToolsetStatusOutputsUrls urls) {
            this.urls = urls;
            return this;
        }
        public ToolsetStatusOutputsUrls getUrls() {
            return this.urls;
        }

    }

}
