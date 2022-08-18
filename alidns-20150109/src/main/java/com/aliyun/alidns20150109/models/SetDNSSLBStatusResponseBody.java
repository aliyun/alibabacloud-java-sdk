// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusResponseBody extends TeaModel {
    @NameInMap("Open")
    public Boolean open;

    @NameInMap("RecordCount")
    public Long recordCount;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDNSSLBStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDNSSLBStatusResponseBody self = new SetDNSSLBStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDNSSLBStatusResponseBody setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public SetDNSSLBStatusResponseBody setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public SetDNSSLBStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
