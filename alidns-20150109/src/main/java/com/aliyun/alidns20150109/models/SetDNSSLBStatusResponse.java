// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordCount")
    @Validation(required = true)
    public Long recordCount;

    @NameInMap("Open")
    @Validation(required = true)
    public Boolean open;

    public static SetDNSSLBStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDNSSLBStatusResponse self = new SetDNSSLBStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDNSSLBStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDNSSLBStatusResponse setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public SetDNSSLBStatusResponse setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

}
