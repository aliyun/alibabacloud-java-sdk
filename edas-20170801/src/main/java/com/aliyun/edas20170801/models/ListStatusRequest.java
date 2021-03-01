// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListStatusRequest extends TeaModel {
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

    public static ListStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatusRequest self = new ListStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListStatusRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListStatusRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListStatusRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListStatusRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public ListStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
