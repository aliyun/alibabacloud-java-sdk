// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeployGroupId")
    public String deployGroupId;

    @NameInMap("ListenerHealthCheckUrl")
    public String listenerHealthCheckUrl;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("SlbId")
    public String slbId;

    @NameInMap("VForwardingUrlRule")
    public String VForwardingUrlRule;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    public static BindEcsSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEcsSlbRequest self = new BindEcsSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindEcsSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindEcsSlbRequest setDeployGroupId(String deployGroupId) {
        this.deployGroupId = deployGroupId;
        return this;
    }
    public String getDeployGroupId() {
        return this.deployGroupId;
    }

    public BindEcsSlbRequest setListenerHealthCheckUrl(String listenerHealthCheckUrl) {
        this.listenerHealthCheckUrl = listenerHealthCheckUrl;
        return this;
    }
    public String getListenerHealthCheckUrl() {
        return this.listenerHealthCheckUrl;
    }

    public BindEcsSlbRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public BindEcsSlbRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public BindEcsSlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public BindEcsSlbRequest setVForwardingUrlRule(String VForwardingUrlRule) {
        this.VForwardingUrlRule = VForwardingUrlRule;
        return this;
    }
    public String getVForwardingUrlRule() {
        return this.VForwardingUrlRule;
    }

    public BindEcsSlbRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public BindEcsSlbRequest setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

}
