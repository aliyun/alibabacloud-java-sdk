// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteSubDomainRecordsResponseBody extends TeaModel {
    @NameInMap("RR")
    public String RR;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DeleteSubDomainRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubDomainRecordsResponseBody self = new DeleteSubDomainRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubDomainRecordsResponseBody setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public DeleteSubDomainRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSubDomainRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
