// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8b1cd755-4928-4b02-adee-e5d41d7b1939</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForGenerateDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForGenerateDomainCertificateResponseBody self = new SaveBatchTaskForGenerateDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForGenerateDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForGenerateDomainCertificateResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
