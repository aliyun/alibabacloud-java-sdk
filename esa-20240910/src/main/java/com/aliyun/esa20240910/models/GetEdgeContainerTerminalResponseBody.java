// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerTerminalResponseBody extends TeaModel {
    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>c497b44c2a59f4ae0bd2826edc40a2c6e</p>
     */
    @NameInMap("Cluster")
    public String cluster;

    /**
     * <p>The container name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the container group.</p>
     * 
     * <strong>example:</strong>
     * <p>1775b9e0-8463-457e-89e8-fb7b6d125b2e</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>af22f4xxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The information about the shared token.</p>
     * 
     * <strong>example:</strong>
     * <p>af22f4-xxxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetEdgeContainerTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerTerminalResponseBody self = new GetEdgeContainerTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerTerminalResponseBody setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetEdgeContainerTerminalResponseBody setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public GetEdgeContainerTerminalResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetEdgeContainerTerminalResponseBody setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public GetEdgeContainerTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerTerminalResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetEdgeContainerTerminalResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
