// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyTypes")
    public java.util.List<CreateDomainResourceRequestProxyTypes> proxyTypes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    public static CreateDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResourceRequest self = new CreateDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainResourceRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public CreateDomainResourceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateDomainResourceRequest setProxyTypes(java.util.List<CreateDomainResourceRequestProxyTypes> proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public java.util.List<CreateDomainResourceRequestProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    public CreateDomainResourceRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public CreateDomainResourceRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public static class CreateDomainResourceRequestProxyTypes extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<Integer> proxyPorts;

        @NameInMap("ProxyType")
        public String proxyType;

        public static CreateDomainResourceRequestProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResourceRequestProxyTypes self = new CreateDomainResourceRequestProxyTypes();
            return TeaModel.build(map, self);
        }

        public CreateDomainResourceRequestProxyTypes setProxyPorts(java.util.List<Integer> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<Integer> getProxyPorts() {
            return this.proxyPorts;
        }

        public CreateDomainResourceRequestProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}
