// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchDomainRemarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveBatchDomainRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchDomainRemarkResponseBody self = new SaveBatchDomainRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchDomainRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
