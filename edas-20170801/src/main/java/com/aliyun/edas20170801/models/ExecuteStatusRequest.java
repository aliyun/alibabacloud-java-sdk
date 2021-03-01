// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ExecuteStatusRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Source")
    public String source;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("Status")
    public String status;

    public static ExecuteStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatusRequest self = new ExecuteStatusRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ExecuteStatusRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ExecuteStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExecuteStatusRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ExecuteStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ExecuteStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecuteStatusRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ExecuteStatusRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public ExecuteStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
