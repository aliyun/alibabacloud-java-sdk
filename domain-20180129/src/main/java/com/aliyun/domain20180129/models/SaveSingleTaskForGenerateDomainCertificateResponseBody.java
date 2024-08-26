// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E68AB12-3D1F-5B9A-A358-F6B7852AD0B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2741a831-d9ea-4dfb-af94-61948c0478c3</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForGenerateDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForGenerateDomainCertificateResponseBody self = new SaveSingleTaskForGenerateDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForGenerateDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForGenerateDomainCertificateResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
