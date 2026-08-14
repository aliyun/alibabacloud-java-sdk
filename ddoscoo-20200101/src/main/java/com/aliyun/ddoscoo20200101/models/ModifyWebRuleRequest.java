// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("HttpsExt")
    public String httpsExt;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyTypes")
    public String proxyTypes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
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
