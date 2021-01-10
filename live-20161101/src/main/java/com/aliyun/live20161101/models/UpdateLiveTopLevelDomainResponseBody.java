// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveTopLevelDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveTopLevelDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTopLevelDomainResponseBody self = new UpdateLiveTopLevelDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTopLevelDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
