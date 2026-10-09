// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class AssignCertificateCountRequest extends TeaModel {
    /**
     * <p>The identifier of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1f0167b4-ee84-XXX-49bc4d39fa68</p>
     */
    @NameInMap("CaIdentifier")
    public String caIdentifier;

    /**
     * <p>The total number of certificate records.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CertTotalCount")
    public Integer certTotalCount;

    /**
     * <p>The ID of the data source to which the certificate belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>33285</p>
     */
    @NameInMap("Id")
    public Long id;

    public static AssignCertificateCountRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignCertificateCountRequest self = new AssignCertificateCountRequest();
        return TeaModel.build(map, self);
    }

    public AssignCertificateCountRequest setCaIdentifier(String caIdentifier) {
        this.caIdentifier = caIdentifier;
        return this;
    }
    public String getCaIdentifier() {
        return this.caIdentifier;
    }

    public AssignCertificateCountRequest setCertTotalCount(Integer certTotalCount) {
        this.certTotalCount = certTotalCount;
        return this;
    }
    public Integer getCertTotalCount() {
        return this.certTotalCount;
    }

    public AssignCertificateCountRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
