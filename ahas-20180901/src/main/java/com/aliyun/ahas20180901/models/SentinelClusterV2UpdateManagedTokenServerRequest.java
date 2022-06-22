// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2UpdateManagedTokenServerRequest extends TeaModel {
    @NameInMap("HbTimestamp")
    public Long hbTimestamp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PrivateIp")
    public String privateIp;

    @NameInMap("PublicIp")
    public String publicIp;

    @NameInMap("ServerHost")
    public String serverHost;

    @NameInMap("ServerPort")
    public Integer serverPort;

    @NameInMap("ServerType")
    public Integer serverType;

    @NameInMap("VpcId")
    public String vpcId;

    public static SentinelClusterV2UpdateManagedTokenServerRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2UpdateManagedTokenServerRequest self = new SentinelClusterV2UpdateManagedTokenServerRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setHbTimestamp(Long hbTimestamp) {
        this.hbTimestamp = hbTimestamp;
        return this;
    }
    public Long getHbTimestamp() {
        return this.hbTimestamp;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setServerHost(String serverHost) {
        this.serverHost = serverHost;
        return this;
    }
    public String getServerHost() {
        return this.serverHost;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public Integer getServerPort() {
        return this.serverPort;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setServerType(Integer serverType) {
        this.serverType = serverType;
        return this;
    }
    public Integer getServerType() {
        return this.serverType;
    }

    public SentinelClusterV2UpdateManagedTokenServerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
