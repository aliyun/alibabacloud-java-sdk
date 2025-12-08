// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class AssignCertificateCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CertTotalCount")
    public Integer certTotalCount;

    /**
     * <strong>example:</strong>
     * <p>33285</p>
     */
    @NameInMap("Id")
    public Long id;

    public static AssignCertificateCountRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignCertificateCountRequest self = new AssignCertificateCountRequest();
        return TeaModel.build(map, self);
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
