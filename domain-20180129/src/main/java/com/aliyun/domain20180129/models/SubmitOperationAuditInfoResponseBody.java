// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationAuditInfoResponseBody extends TeaModel {
    /**
     * <p>The system-generated record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DKCF6F8-243C-40EC-8035-4B12FEFD7C22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitOperationAuditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationAuditInfoResponseBody self = new SubmitOperationAuditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitOperationAuditInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitOperationAuditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
