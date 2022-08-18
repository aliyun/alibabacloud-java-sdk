// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static SetDomainRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRecordStatusResponseBody self = new SetDomainRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainRecordStatusResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public SetDomainRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDomainRecordStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
