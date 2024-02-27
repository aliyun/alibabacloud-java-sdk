// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadCsrResponseBody extends TeaModel {
    /**
     * <p>CSR ID。</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCsrResponseBody self = new UploadCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCsrResponseBody setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

    public UploadCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
