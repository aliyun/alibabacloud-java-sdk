// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyTlsConfigRequest extends TeaModel {
    /**
     * <p>The details of the TLS policy. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **ssl_protocols**: the version of TLS. This field is required. Data type: string. Valid values:</p>
     * <br>
     * <p>    *   **tls1.0**: TLS 1.0 and later</p>
     * <p>    *   **tls1.1**: TLS 1.1 and later</p>
     * <p>    *   **tls1.2**: TLS 1.2 and later</p>
     * <br>
     * <p>*   **ssl_ciphers**: the type of the cipher suite. This field is required. Data type: string. Valid values:</p>
     * <br>
     * <p>    *   **all**: all cipher suites, which include strong and weak cipher suites</p>
     * <p>    *   **improved**: enhanced cipher suites</p>
     * <p>    *   **strong**: strong cipher suites</p>
     * <p>    *   **default**: default cipher suites, which include only strong cipher suites</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
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
