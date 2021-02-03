// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteSubDomainRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    public static DeleteSubDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubDomainRecordsResponse self = new DeleteSubDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubDomainRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSubDomainRecordsResponse setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public DeleteSubDomainRecordsResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
