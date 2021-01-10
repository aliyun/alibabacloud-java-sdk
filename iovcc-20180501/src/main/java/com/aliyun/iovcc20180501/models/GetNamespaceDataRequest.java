// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetNamespaceDataRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("DeviceIdType")
    public String deviceIdType;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AccountId")
    public String accountId;

    public static GetNamespaceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceDataRequest self = new GetNamespaceDataRequest();
        return TeaModel.build(map, self);
    }

    public GetNamespaceDataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetNamespaceDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetNamespaceDataRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public GetNamespaceDataRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public GetNamespaceDataRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetNamespaceDataRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetNamespaceDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
