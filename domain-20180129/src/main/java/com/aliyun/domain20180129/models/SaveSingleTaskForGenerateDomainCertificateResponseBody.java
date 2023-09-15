// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForGenerateDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
