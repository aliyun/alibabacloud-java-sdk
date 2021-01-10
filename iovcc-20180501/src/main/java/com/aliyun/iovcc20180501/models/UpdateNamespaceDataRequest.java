// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateNamespaceDataRequest extends TeaModel {
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

    @NameInMap("Path")
    public String path;

    @NameInMap("OldData")
    public String oldData;

    @NameInMap("NewData")
    public String newData;

    public static UpdateNamespaceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceDataRequest self = new UpdateNamespaceDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceDataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateNamespaceDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateNamespaceDataRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public UpdateNamespaceDataRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public UpdateNamespaceDataRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateNamespaceDataRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public UpdateNamespaceDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateNamespaceDataRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateNamespaceDataRequest setOldData(String oldData) {
        this.oldData = oldData;
        return this;
    }
    public String getOldData() {
        return this.oldData;
    }

    public UpdateNamespaceDataRequest setNewData(String newData) {
        this.newData = newData;
        return this;
    }
    public String getNewData() {
        return this.newData;
    }

}
