// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SubDomainInfo extends TeaModel {
    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-cpudb0llhtgl2djvq2sg</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network type. Valid values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Intranet</li>
     * <li>Internet</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("networkType")
    public String networkType;

    /**
     * <p>The protocol.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HTTPS</li>
     * <li>HTTP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static SubDomainInfo build(java.util.Map<String, ?> map) throws Exception {
        SubDomainInfo self = new SubDomainInfo();
        return TeaModel.build(map, self);
    }

    public SubDomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public SubDomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubDomainInfo setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SubDomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
