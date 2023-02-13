// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of created CA certificates, which includes root CA certificates and intermediate CA certificates.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCACertificateCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateCountResponseBody self = new DescribeCACertificateCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCACertificateCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
