// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyTlsConfigRequest extends TeaModel {
    /**
     * <p>The details of the TLS policy. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>ssl_protocols</strong>: the version of TLS. This field is required. Data type: string. Valid values:</p>
     * <ul>
     * <li><strong>tls1.0</strong>: TLS 1.0 and later</li>
     * <li><strong>tls1.1</strong>: TLS 1.1 and later</li>
     * <li><strong>tls1.2</strong>: TLS 1.2 and later</li>
     * </ul>
     * </li>
     * <li><p><strong>ssl_ciphers</strong>: the type of the cipher suite. This field is required. Data type: string. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: all cipher suites, which include strong and weak cipher suites</li>
     * <li><strong>improved</strong>: enhanced cipher suites</li>
     * <li><strong>strong</strong>: strong cipher suites</li>
     * <li><strong>default</strong>: default cipher suites, which include only strong cipher suites</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ssl_protocols&quot;:&quot;tls1.0&quot;,&quot;ssl_ciphers&quot;:&quot;all&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyTlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTlsConfigRequest self = new ModifyTlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTlsConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyTlsConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyTlsConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
