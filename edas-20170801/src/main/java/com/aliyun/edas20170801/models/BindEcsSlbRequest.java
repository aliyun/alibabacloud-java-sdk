// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93fdd228-*****-ed2ae98de18d</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group whose application you want to bind. You can call the ListDeployGroup operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62077.html">ListDeployGroup</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>577f4c50-16ee-43d8-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("DeployGroupId")
    public String deployGroupId;

    /**
     * <p>The health check URL.</p>
     * 
     * <strong>example:</strong>
     * <p>/_ehc.html</p>
     */
    @NameInMap("ListenerHealthCheckUrl")
    public String listenerHealthCheckUrl;

    /**
     * <p>The listener port for the SLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol for the SLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the SLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-uf6j54m3a****cj01jx8</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The forwarding rule of the SLB listener.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/forwarding</p>
     */
    @NameInMap("VForwardingUrlRule")
    public String VForwardingUrlRule;

    /**
     * <p>The ID of the vServer group for the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-2ze<strong><strong>6l</strong></strong>*</p>
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
