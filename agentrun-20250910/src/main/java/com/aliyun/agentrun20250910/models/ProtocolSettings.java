// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProtocolSettings extends TeaModel {
    @NameInMap("A2AAgentCard")
    @Deprecated
    public String a2AAgentCard;

    @NameInMap("a2aAgentCard")
    @Deprecated
    public String a2aAgentCard;

    @NameInMap("a2aAgentCardUrl")
    @Deprecated
    public String a2aAgentCardUrl;

    /**
     * <p>协议配置的 JSON 字符串</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>请求头</p>
     */
    @NameInMap("headers")
    @Deprecated
    public String headers;

    /**
     * <p>请求体JSON模式</p>
     */
    @NameInMap("inputBodyJsonSchema")
    @Deprecated
    public String inputBodyJsonSchema;

    /**
     * <p>HTTP方法</p>
     */
    @NameInMap("method")
    @Deprecated
    public String method;

    /**
     * <p>可选展示名/别名，不再作为协议类型标识</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>响应体JSON模式</p>
     */
    @NameInMap("outputBodyJsonSchema")
    @Deprecated
    public String outputBodyJsonSchema;

    /**
     * <p>协议路径</p>
     */
    @NameInMap("path")
    @Deprecated
    public String path;

    /**
     * <p>协议路径前缀，建议使用 config</p>
     */
    @NameInMap("pathPrefix")
    @Deprecated
    public String pathPrefix;

    /**
     * <p>请求内容类型</p>
     */
    @NameInMap("requestContentType")
    @Deprecated
    public String requestContentType;

    /**
     * <p>响应内容类型</p>
     */
    @NameInMap("responseContentType")
    @Deprecated
    public String responseContentType;

    /**
     * <p>协议类型标识，用于校验与去重；合法取值由后端校验</p>
     */
    @NameInMap("type")
    public String type;

    public static ProtocolSettings build(java.util.Map<String, ?> map) throws Exception {
        ProtocolSettings self = new ProtocolSettings();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ProtocolSettings setA2AAgentCard(String a2AAgentCard) {
        this.a2AAgentCard = a2AAgentCard;
        return this;
    }
    public String getA2AAgentCard() {
        return this.a2AAgentCard;
    }

    @Deprecated
    public ProtocolSettings setA2aAgentCard(String a2aAgentCard) {
        this.a2aAgentCard = a2aAgentCard;
        return this;
    }
    public String getA2aAgentCard() {
        return this.a2aAgentCard;
    }

    @Deprecated
    public ProtocolSettings setA2aAgentCardUrl(String a2aAgentCardUrl) {
        this.a2aAgentCardUrl = a2aAgentCardUrl;
        return this;
    }
    public String getA2aAgentCardUrl() {
        return this.a2aAgentCardUrl;
    }

    public ProtocolSettings setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    @Deprecated
    public ProtocolSettings setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    @Deprecated
    public ProtocolSettings setInputBodyJsonSchema(String inputBodyJsonSchema) {
        this.inputBodyJsonSchema = inputBodyJsonSchema;
        return this;
    }
    public String getInputBodyJsonSchema() {
        return this.inputBodyJsonSchema;
    }

    @Deprecated
    public ProtocolSettings setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ProtocolSettings setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    @Deprecated
    public ProtocolSettings setOutputBodyJsonSchema(String outputBodyJsonSchema) {
        this.outputBodyJsonSchema = outputBodyJsonSchema;
        return this;
    }
    public String getOutputBodyJsonSchema() {
        return this.outputBodyJsonSchema;
    }

    @Deprecated
    public ProtocolSettings setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    @Deprecated
    public ProtocolSettings setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    @Deprecated
    public ProtocolSettings setRequestContentType(String requestContentType) {
        this.requestContentType = requestContentType;
        return this;
    }
    public String getRequestContentType() {
        return this.requestContentType;
    }

    @Deprecated
    public ProtocolSettings setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ProtocolSettings setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
