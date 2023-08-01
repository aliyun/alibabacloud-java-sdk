// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group whose application you want to bind. You can call the ListDeployGroup operation to query the group ID. For more information, see [ListDeployGroup](~~62077~~).</p>
     */
    @NameInMap("DeployGroupId")
    public String deployGroupId;

    /**
     * <p>The health check URL.</p>
     */
    @NameInMap("ListenerHealthCheckUrl")
    public String listenerHealthCheckUrl;

    /**
     * <p>The listener port for the SLB instance.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol for the SLB instance.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The forwarding rule of the SLB listener.</p>
     */
    @NameInMap("VForwardingUrlRule")
    public String VForwardingUrlRule;

    /**
     * <p>The ID of the vServer group for the SLB instance.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The name of the vServer group.</p>
     */
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
