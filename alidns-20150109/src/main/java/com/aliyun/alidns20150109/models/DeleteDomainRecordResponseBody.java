// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRecordResponseBody self = new DeleteDomainRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DeleteDomainRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
