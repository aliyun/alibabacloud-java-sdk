// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileRequest extends TeaModel {
    /**
     * <p>Not in use.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Cluster")
    public String cluster;

    /**
     * <p>The Anti-DDoS Global Mitigation Policy for Protection for Website Services. The structure is as follows:</p>
     * <ul>
     * <li><strong>global_rule_mode</strong>: String type. Optional. The protection level of the DDoS global mitigation feature. Valid values:<ul>
     * <li><strong>weak</strong>: Loose.</li>
     * <li><strong>default</strong>: Normal.</li>
     * <li><strong>hard</strong>: Strict.</li>
     * </ul>
     * </li>
     * <li><strong>global_rule_enable</strong>: Integer type. Optional. The switch of the DDoS global mitigation feature. Valid values:<ul>
     * <li><strong>0</strong>: Shutdown.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>The Blacklist/Whitelist feature of the custom mitigation policies for Protection for Website Services. The structure is as follows:</p>
     * <ul>
     * <li><strong>bwlist_enable</strong>: Integer type. Optional. The switch of the custom mitigation policy blacklist/whitelist. Valid values:<ul>
     * <li><strong>0</strong>: Shutdown.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;global_rule_mode&quot;:&quot;hard&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
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
