// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAcrRamAuthorizationRequest extends TeaModel {
    /**
     * <p>The ACR Enterprise instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-1234567890abcdef</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The target ACR namespace, which corresponds to Agent artifact.container.namespace. This is not a Kubernetes namespace. Together with the instance and repository, it determines the authorization scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The target repository name, which corresponds to Agent artifact.container.repo. It does not include a tag, namespace, or path separator. Wildcards are not accepted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-image</p>
     */
    @NameInMap("repository")
    public String repository;

    public static VerifyWorkspaceAcrRamAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAcrRamAuthorizationRequest self = new VerifyWorkspaceAcrRamAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAcrRamAuthorizationRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public VerifyWorkspaceAcrRamAuthorizationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public VerifyWorkspaceAcrRamAuthorizationRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
