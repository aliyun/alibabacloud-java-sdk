// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayDomain extends TeaModel {
    // 使用的证书Id
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    // 网关ID
    @NameInMap("GatewayId")
    public Long gatewayId;

    // 网关名称
    @NameInMap("GatewayName")
    public String gatewayName;

    // 网关唯一标识
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // Domain Id
    @NameInMap("Id")
    public Long id;

    // 是否强制跳转
    @NameInMap("MustHttps")
    public String mustHttps;

    // Domain Name
    @NameInMap("Name")
    public String name;

    // domainn的协议
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
