// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveTopLevelDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveTopLevelDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTopLevelDomainResponse self = new UpdateLiveTopLevelDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTopLevelDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
