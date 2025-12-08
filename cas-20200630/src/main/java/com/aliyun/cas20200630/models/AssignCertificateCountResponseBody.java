// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class AssignCertificateCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CertCount")
    public Integer certCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentYearFreeCertCount")
    public Integer currentYearFreeCertCount;

    /**
     * <strong>example:</strong>
     * <p>E77C4794-F24F-58CB-9929-F0F0C0EDE7B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssignCertificateCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignCertificateCountResponseBody self = new AssignCertificateCountResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignCertificateCountResponseBody setCertCount(Integer certCount) {
        this.certCount = certCount;
        return this;
    }
    public Integer getCertCount() {
        return this.certCount;
    }

    public AssignCertificateCountResponseBody setCurrentYearFreeCertCount(Integer currentYearFreeCertCount) {
        this.currentYearFreeCertCount = currentYearFreeCertCount;
        return this;
    }
    public Integer getCurrentYearFreeCertCount() {
        return this.currentYearFreeCertCount;
    }

    public AssignCertificateCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
