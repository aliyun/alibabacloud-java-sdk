// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyTlsConfigRequest extends TeaModel {
    /**
     * <p>The details of the TLS security policy, expressed as a JSON-formatted string with the following structure.</p>
     * <ul>
     * <li><strong>ssl_protocols</strong>: String type, required. The TLS version. Valid values:<ul>
     * <li><strong>tls1.0</strong>: TLS 1.0 and later are supported.</li>
     * <li><strong>tls1.1</strong>: TLS 1.1 and later are supported.</li>
     * <li><strong>tls1.2</strong>: TLS 1.2 and later are supported.</li>
     * </ul>
     * </li>
     * <li><strong>ssl_ciphers</strong>: String type, required. The cipher suite type. Valid values:<ul>
     * <li><strong>all</strong>: all cipher suites, including strong and weak cipher suites</li>
     * <li><strong>improved</strong>: enhanced cipher suites</li>
     * <li><strong>strong</strong>: strong cipher suites only</li>
     * <li><strong>default</strong>: default cipher suites, which include only strong cipher suites</li>
     * </ul>
     * </li>
     * <li><strong>ssl_13_enabled</strong>: Boolean type, optional. Specifies whether to enable TLS 1.3. Valid values:<ul>
     * <li><strong>true</strong>: Enables TLS 1.3.</li>
     * <li><strong>false</strong>: Disables TLS 1.3.</li>
     * </ul>
     * </li>
     * <li><strong>custom_ciphers</strong>: Array type, optional. The list of custom cipher suites for TLS versions earlier than 1.3.</li>
     * <li><strong>tls_13_custom_ciphers</strong>: Array type, optional. The list of custom cipher suites for TLS 1.3. If TLS 1.3 is enabled, select at least one cipher suite for TLS versions earlier than 1.3.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ssl_protocols&quot;: &quot;tls1.2&quot;,
     *   &quot;ssl_ciphers&quot;: &quot;default&quot;,
     *   &quot;ssl_13_enabled&quot;: true,
     *   &quot;custom_ciphers&quot;: [
     *     &quot;ECDHE-ECDSA-AES128-GCM-SHA256&quot;
     *   ],
     *   &quot;tls_13_custom_ciphers&quot;: [
     *     &quot;TLS_AES_256_GCM_SHA384&quot;
     *   ]
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
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

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
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
