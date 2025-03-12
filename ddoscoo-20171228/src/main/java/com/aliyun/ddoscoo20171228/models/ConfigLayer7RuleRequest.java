// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7RuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-cn-XXXXXX</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;ProxyPorts&quot;:[80,8080],&quot;ProxyType&quot;:&quot;http&quot;},{&quot;ProxyPorts&quot;:[443],&quot;ProxyType&quot;:&quot;https&quot;}]rts\&quot;:[443],\&quot;ProxyType\&quot;:\&quot;https\&quot;}]</p>
     */
    @NameInMap("ProxyTypeList")
    public String proxyTypeList;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;ProxyPorts&quot;:[80,8080],&quot;ProxyType&quot;:&quot;http&quot;},{&quot;ProxyPorts&quot;:[443],&quot;ProxyType&quot;:&quot;https&quot;}]rts\&quot;:[443],\&quot;ProxyType\&quot;:\&quot;https\&quot;}]</p>
     */
    @NameInMap("ProxyTypes")
    public java.util.List<String> proxyTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    public static ConfigLayer7RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7RuleRequest self = new ConfigLayer7RuleRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7RuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigLayer7RuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ConfigLayer7RuleRequest setProxyTypeList(String proxyTypeList) {
        this.proxyTypeList = proxyTypeList;
        return this;
    }
    public String getProxyTypeList() {
        return this.proxyTypeList;
    }

    public ConfigLayer7RuleRequest setProxyTypes(java.util.List<String> proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public java.util.List<String> getProxyTypes() {
        return this.proxyTypes;
    }

    public ConfigLayer7RuleRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public ConfigLayer7RuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigLayer7RuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

}
