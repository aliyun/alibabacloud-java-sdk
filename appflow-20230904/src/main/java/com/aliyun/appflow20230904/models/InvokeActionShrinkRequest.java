// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class InvokeActionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>action-xxx</p>
     */
    @NameInMap("ActionId")
    public String actionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ActionVersion")
    public String actionVersion;

    @NameInMap("AuthConfig")
    public String authConfigShrink;

    @NameInMap("Body")
    public String bodyShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-xxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    @NameInMap("Headers")
    public String headersShrink;

    @NameInMap("Path")
    public String pathShrink;

    @NameInMap("Query")
    public String queryShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    public static InvokeActionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionShrinkRequest self = new InvokeActionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvokeActionShrinkRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public InvokeActionShrinkRequest setActionVersion(String actionVersion) {
        this.actionVersion = actionVersion;
        return this;
    }
    public String getActionVersion() {
        return this.actionVersion;
    }

    public InvokeActionShrinkRequest setAuthConfigShrink(String authConfigShrink) {
        this.authConfigShrink = authConfigShrink;
        return this;
    }
    public String getAuthConfigShrink() {
        return this.authConfigShrink;
    }

    public InvokeActionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public InvokeActionShrinkRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public InvokeActionShrinkRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    public InvokeActionShrinkRequest setHeadersShrink(String headersShrink) {
        this.headersShrink = headersShrink;
        return this;
    }
    public String getHeadersShrink() {
        return this.headersShrink;
    }

    public InvokeActionShrinkRequest setPathShrink(String pathShrink) {
        this.pathShrink = pathShrink;
        return this;
    }
    public String getPathShrink() {
        return this.pathShrink;
    }

    public InvokeActionShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

    public InvokeActionShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
