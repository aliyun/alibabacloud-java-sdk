// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static UpdateDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordResponse self = new UpdateDomainRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDomainRecordResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
