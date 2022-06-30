// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyDomainResourceRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("HttpsExt")
    public String httpsExt;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ProxyTypes")
    public java.util.List<ModifyDomainResourceRequestProxyTypes> proxyTypes;

    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    @NameInMap("RsType")
    public Integer rsType;

    public static ModifyDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResourceRequest self = new ModifyDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainResourceRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public ModifyDomainResourceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyDomainResourceRequest setProxyTypes(java.util.List<ModifyDomainResourceRequestProxyTypes> proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public java.util.List<ModifyDomainResourceRequestProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    public ModifyDomainResourceRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public ModifyDomainResourceRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public static class ModifyDomainResourceRequestProxyTypes extends TeaModel {
        @NameInMap("ProxyPorts")
        public java.util.List<Integer> proxyPorts;

        @NameInMap("ProxyType")
        public String proxyType;

        public static ModifyDomainResourceRequestProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainResourceRequestProxyTypes self = new ModifyDomainResourceRequestProxyTypes();
            return TeaModel.build(map, self);
        }

        public ModifyDomainResourceRequestProxyTypes setProxyPorts(java.util.List<Integer> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<Integer> getProxyPorts() {
            return this.proxyPorts;
        }

        public ModifyDomainResourceRequestProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}
