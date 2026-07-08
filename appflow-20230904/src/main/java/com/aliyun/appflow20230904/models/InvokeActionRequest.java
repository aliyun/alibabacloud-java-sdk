// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class InvokeActionRequest extends TeaModel {
    /**
     * <p>The action ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>action-xxx</p>
     */
    @NameInMap("ActionId")
    public String actionId;

    /**
     * <p>The action version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ActionVersion")
    public String actionVersion;

    /**
     * <p>The authentication information for the action.</p>
     */
    @NameInMap("AuthConfig")
    public InvokeActionRequestAuthConfig authConfig;

    /**
     * <p>The request body for the action.</p>
     */
    @NameInMap("Body")
    public java.util.Map<String, ?> body;

    /**
     * <p>The connector ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-xxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The connector version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    /**
     * <p>The request header parameters for the action.</p>
     */
    @NameInMap("Headers")
    public java.util.Map<String, String> headers;

    /**
     * <p>The path parameters for the action.</p>
     */
    @NameInMap("Path")
    public java.util.Map<String, String> path;

    /**
     * <p>The query parameters for the action.</p>
     */
    @NameInMap("Query")
    public java.util.Map<String, String> query;

    /**
     * <p>Specifies whether to use streaming output.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    public static InvokeActionRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionRequest self = new InvokeActionRequest();
        return TeaModel.build(map, self);
    }

    public InvokeActionRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public InvokeActionRequest setActionVersion(String actionVersion) {
        this.actionVersion = actionVersion;
        return this;
    }
    public String getActionVersion() {
        return this.actionVersion;
    }

    public InvokeActionRequest setAuthConfig(InvokeActionRequestAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public InvokeActionRequestAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public InvokeActionRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public InvokeActionRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public InvokeActionRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    public InvokeActionRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeActionRequest setPath(java.util.Map<String, String> path) {
        this.path = path;
        return this;
    }
    public java.util.Map<String, String> getPath() {
        return this.path;
    }

    public InvokeActionRequest setQuery(java.util.Map<String, String> query) {
        this.query = query;
        return this;
    }
    public java.util.Map<String, String> getQuery() {
        return this.query;
    }

    public InvokeActionRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class InvokeActionRequestAuthConfig extends TeaModel {
        /**
         * <p>The type of authentication information.</p>
         * 
         * <strong>example:</strong>
         * <p>raw</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The authentication content. Its value is a raw JSON object or a credential ID, as determined by the <code>Type</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AppId&quot;:&quot;xxxx&quot;,&quot;AppSecret&quot;:&quot;sk-xxx&quot;}</p>
         */
        @NameInMap("Value")
        public Object value;

        public static InvokeActionRequestAuthConfig build(java.util.Map<String, ?> map) throws Exception {
            InvokeActionRequestAuthConfig self = new InvokeActionRequestAuthConfig();
            return TeaModel.build(map, self);
        }

        public InvokeActionRequestAuthConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public InvokeActionRequestAuthConfig setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
