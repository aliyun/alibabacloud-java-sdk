// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceCustomDomain extends TeaModel {
    @NameInMap("cert")
    public String cert;

    @NameInMap("date")
    public Long date;

    @NameInMap("domain")
    public String domain;

    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("id")
    public Long id;

    @NameInMap("key")
    public String key;

    @NameInMap("privateZone")
    public String privateZone;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("status")
    public String status;

    @NameInMap("uri")
    public String uri;

    public static GrafanaWorkspaceCustomDomain build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceCustomDomain self = new GrafanaWorkspaceCustomDomain();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceCustomDomain setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public GrafanaWorkspaceCustomDomain setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public GrafanaWorkspaceCustomDomain setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GrafanaWorkspaceCustomDomain setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceCustomDomain setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceCustomDomain setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GrafanaWorkspaceCustomDomain setPrivateZone(String privateZone) {
        this.privateZone = privateZone;
        return this;
    }
    public String getPrivateZone() {
        return this.privateZone;
    }

    public GrafanaWorkspaceCustomDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GrafanaWorkspaceCustomDomain setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrafanaWorkspaceCustomDomain setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
