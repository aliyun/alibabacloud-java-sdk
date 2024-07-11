// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileRequest extends TeaModel {
    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("Cluster")
    public String cluster;

    /**
     * <p>The configurations for the global mitigation policy feature. The configurations include the following fields:</p>
     * <ul>
     * <li><p><strong>global_rule_mode</strong>: optional. The mode for the global mitigation policy feature. Data type: string. Valid values:</p>
     * <ul>
     * <li><strong>weak</strong>: loose.</li>
     * <li><strong>default</strong>: normal.</li>
     * <li><strong>hard</strong>: strict.</li>
     * </ul>
     * </li>
     * <li><p><strong>global_rule_enable</strong>: optional. Specifies whether to enable the global mitigation policy feature. Data type: string. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;global_rule_mode\&quot;:\&quot;hard\&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
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
