// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceCustomDomain extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>protocol为http时无需填写;</p>
     */
    @NameInMap("cert")
    public String cert;

    /**
     * <strong>example:</strong>
     * <p>1688627798017</p>
     */
    @NameInMap("date")
    public Long date;

    /**
     * <strong>example:</strong>
     * <p>mydomain.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>grafana-cn-***********</p>
     */
    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>protocol为http时无需填写;</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("privateZone")
    public String privateZone;

    /**
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>CreateSucceed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
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
