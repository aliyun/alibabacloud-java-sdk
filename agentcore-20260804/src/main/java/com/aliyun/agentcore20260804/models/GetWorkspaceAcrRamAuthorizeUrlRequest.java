// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceAcrRamAuthorizeUrlRequest extends TeaModel {
    /**
     * <p>The ID of the ACR Enterprise instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-1234567890abcdef</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The target ACR namespace, which corresponds to artifact.container.namespace of the agent. This is not a Kubernetes namespace. This parameter, together with the instance and repository, determines the authorization scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The name of the target repository, which corresponds to artifact.container.repo of the agent. The name cannot contain tags, namespaces, or path separators. Wildcards are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-image</p>
     */
    @NameInMap("repository")
    public String repository;

    public static GetWorkspaceAcrRamAuthorizeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceAcrRamAuthorizeUrlRequest self = new GetWorkspaceAcrRamAuthorizeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceAcrRamAuthorizeUrlRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public GetWorkspaceAcrRamAuthorizeUrlRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetWorkspaceAcrRamAuthorizeUrlRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
