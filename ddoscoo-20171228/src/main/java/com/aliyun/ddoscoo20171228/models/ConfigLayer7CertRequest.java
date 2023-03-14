// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CertRequest extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("CertId")
    public Integer certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ConfigLayer7CertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CertRequest self = new ConfigLayer7CertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public ConfigLayer7CertRequest setCertId(Integer certId) {
        this.certId = certId;
        return this;
    }
    public Integer getCertId() {
        return this.certId;
    }

    public ConfigLayer7CertRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ConfigLayer7CertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigLayer7CertRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConfigLayer7CertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
