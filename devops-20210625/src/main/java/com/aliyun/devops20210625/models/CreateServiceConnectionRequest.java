// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("authType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("connectionName")
    public String connectionName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("connectionType")
    public String connectionType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("serviceAuthId")
    public Long serviceAuthId;

    public static CreateServiceConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceConnectionRequest self = new CreateServiceConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceConnectionRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateServiceConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateServiceConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateServiceConnectionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateServiceConnectionRequest setServiceAuthId(Long serviceAuthId) {
        this.serviceAuthId = serviceAuthId;
        return this;
    }
    public Long getServiceAuthId() {
        return this.serviceAuthId;
    }

}
