// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketDomain extends TeaModel {
    /**
     * <p>The domain name address.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The network type.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("networkType")
    public String networkType;

    /**
     * <p>The port.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>The access protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static HiMarketDomain build(java.util.Map<String, ?> map) throws Exception {
        HiMarketDomain self = new HiMarketDomain();
        return TeaModel.build(map, self);
    }

    public HiMarketDomain setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public HiMarketDomain setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public HiMarketDomain setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public HiMarketDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
