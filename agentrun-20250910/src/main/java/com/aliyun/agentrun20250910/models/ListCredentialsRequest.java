// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    /**
     * <p>Filters the results by credential type.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialAuthType</p>
     */
    @NameInMap("credentialAuthType")
    public String credentialAuthType;

    /**
     * <p>Filters the results by credential name.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialName</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>Filters the results by credential source type.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialSourceType</p>
     */
    @NameInMap("credentialSourceType")
    public String credentialSourceType;

    /**
     * <p>Filters the results based on the credential\&quot;s enabled status.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The page number of the results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of credentials to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results by provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>Unique identifier of the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>Multiple workspace identifiers</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1,ws-2</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsRequest self = new ListCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListCredentialsRequest setCredentialAuthType(String credentialAuthType) {
        this.credentialAuthType = credentialAuthType;
        return this;
    }
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    public ListCredentialsRequest setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public ListCredentialsRequest setCredentialSourceType(String credentialSourceType) {
        this.credentialSourceType = credentialSourceType;
        return this;
    }
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    public ListCredentialsRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListCredentialsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCredentialsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCredentialsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListCredentialsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListCredentialsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
