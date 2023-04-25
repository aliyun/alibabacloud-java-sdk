// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertRequest extends TeaModel {
    /**
     * <p>The public key of the certificate that you want to associate. This parameter must be used together with **CertName** and **Key**.</p>
     * <br>
     * <p>> If you specify **CertName**, **Cert**, and **Key**, you do not need to specify **CertId**.</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The ID of the certificate that you want to associate. If the certificate that you want to associate has been issued in Certificate Management Service, you can specify the certificate ID to associate the certificate.</p>
     * <br>
     * <p>> If you specify the certificate ID, you do not need to specify a value for the **CertName**, **Cert**, and **Key** parameters.</p>
     */
    @NameInMap("CertId")
    public Integer certId;

    /**
     * <p>The name of the certificate that you want to associate. This parameter must be used together with the **Cert** and **Key** parameters.</p>
     * <br>
     * <p>> If you specify a value for the **CertName**, **Cert**, and **Key** parameters, you do not need to specify a value for the **CertId** parameter.</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The private key of the certificate that you want to associate. This parameter must be used together with **CertName** and **Cert**.</p>
     * <br>
     * <p>> If you specify **CertName**, **Cert**, and **Key**, you do not need to specify **CertId**.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AssociateWebCertRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateWebCertRequest self = new AssociateWebCertRequest();
        return TeaModel.build(map, self);
    }

    public AssociateWebCertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public AssociateWebCertRequest setCertId(Integer certId) {
        this.certId = certId;
        return this;
    }
    public Integer getCertId() {
        return this.certId;
    }

    public AssociateWebCertRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AssociateWebCertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AssociateWebCertRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AssociateWebCertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
