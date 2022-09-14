// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayDomain extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayName")
    public String gatewayName;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MustHttps")
    public String mustHttps;

    @NameInMap("Name")
    public String name;

    @NameInMap("Protocol")
    public String protocol;

    public static GatewayDomain build(java.util.Map<String, ?> map) throws Exception {
        GatewayDomain self = new GatewayDomain();
        return TeaModel.build(map, self);
    }

    public GatewayDomain setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GatewayDomain setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public GatewayDomain setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public GatewayDomain setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GatewayDomain setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GatewayDomain setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GatewayDomain setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GatewayDomain setMustHttps(String mustHttps) {
        this.mustHttps = mustHttps;
        return this;
    }
    public String getMustHttps() {
        return this.mustHttps;
    }

    public GatewayDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
