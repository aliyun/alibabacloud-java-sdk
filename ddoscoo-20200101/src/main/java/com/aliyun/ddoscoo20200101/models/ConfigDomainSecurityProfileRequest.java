// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;global_rule_mode\&quot;:\&quot;hard\&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live.abcde.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static ConfigDomainSecurityProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainSecurityProfileRequest self = new ConfigDomainSecurityProfileRequest();
        return TeaModel.build(map, self);
    }

    public ConfigDomainSecurityProfileRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ConfigDomainSecurityProfileRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigDomainSecurityProfileRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
