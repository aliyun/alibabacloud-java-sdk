// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleRequest extends TeaModel {
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
     * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxyType&quot;:&quot;https&quot;,&quot;ProxyPorts&quot;:[443]}]</p>
     */
    @NameInMap("ProxyTypes")
    public String proxyTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.xxx.xxx.1</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
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

    public static ModifyWebRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebRuleRequest self = new ModifyWebRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebRuleRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public ModifyWebRuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyWebRuleRequest setProxyTypes(String proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public String getProxyTypes() {
        return this.proxyTypes;
    }

    public ModifyWebRuleRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public ModifyWebRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebRuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

}
