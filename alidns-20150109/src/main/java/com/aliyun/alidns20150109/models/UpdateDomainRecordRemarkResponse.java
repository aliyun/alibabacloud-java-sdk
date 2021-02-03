// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRemarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDomainRecordRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRemarkResponse self = new UpdateDomainRecordRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRemarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
