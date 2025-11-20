// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    /**
     * <p>credentialAuthType</p>
     * 
     * <strong>example:</strong>
     * <p>credentialAuthType</p>
     */
    @NameInMap("credentialAuthType")
    public String credentialAuthType;

    /**
     * <p>credentialName</p>
     * 
     * <strong>example:</strong>
     * <p>credentialName</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>credentialSourceType</p>
     * 
     * <strong>example:</strong>
     * <p>credentialSourceType</p>
     */
    @NameInMap("credentialSourceType")
    public String credentialSourceType;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

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

}
