// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>9999985</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
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
