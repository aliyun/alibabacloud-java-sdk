// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordId")
    public String recordId;

    public static UpdateDomainRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordResponseBody self = new UpdateDomainRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDomainRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
