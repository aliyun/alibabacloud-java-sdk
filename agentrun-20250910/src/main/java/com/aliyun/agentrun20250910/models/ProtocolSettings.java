// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProtocolSettings extends TeaModel {
    /**
     * <p>A2A Agent Card</p>
     */
    @NameInMap("A2AAgentCard")
    public String a2AAgentCard;

    /**
     * <p>请求头</p>
     */
    @NameInMap("headers")
    public String headers;

    /**
     * <p>请求体JSON模式</p>
     */
    @NameInMap("inputBodyJsonSchema")
    public String inputBodyJsonSchema;

    /**
     * <p>HTTP方法</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>协议名称</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>响应体JSON模式</p>
     */
    @NameInMap("outputBodyJsonSchema")
    public String outputBodyJsonSchema;

    /**
     * <p>协议路径</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>协议路径前缀</p>
     */
    @NameInMap("pathPrefix")
    public String pathPrefix;

    /**
     * <p>请求内容类型</p>
     */
    @NameInMap("requestContentType")
    public String requestContentType;

    /**
     * <p>响应内容类型</p>
     */
    @NameInMap("responseContentType")
    public String responseContentType;

    public static ProtocolSettings build(java.util.Map<String, ?> map) throws Exception {
        ProtocolSettings self = new ProtocolSettings();
        return TeaModel.build(map, self);
    }

    public ProtocolSettings setA2AAgentCard(String a2AAgentCard) {
        this.a2AAgentCard = a2AAgentCard;
        return this;
    }
    public String getA2AAgentCard() {
        return this.a2AAgentCard;
    }

    public ProtocolSettings setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public ProtocolSettings setInputBodyJsonSchema(String inputBodyJsonSchema) {
        this.inputBodyJsonSchema = inputBodyJsonSchema;
        return this;
    }
    public String getInputBodyJsonSchema() {
        return this.inputBodyJsonSchema;
    }

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

    public ProtocolSettings setOutputBodyJsonSchema(String outputBodyJsonSchema) {
        this.outputBodyJsonSchema = outputBodyJsonSchema;
        return this;
    }
    public String getOutputBodyJsonSchema() {
        return this.outputBodyJsonSchema;
    }

    public ProtocolSettings setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ProtocolSettings setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public ProtocolSettings setRequestContentType(String requestContentType) {
        this.requestContentType = requestContentType;
        return this;
    }
    public String getRequestContentType() {
        return this.requestContentType;
    }

    public ProtocolSettings setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

}
