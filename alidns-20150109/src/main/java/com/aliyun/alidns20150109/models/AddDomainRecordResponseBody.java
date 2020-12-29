// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordId")
    public String recordId;

    public static AddDomainRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordResponseBody self = new AddDomainRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDomainRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDomainRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
