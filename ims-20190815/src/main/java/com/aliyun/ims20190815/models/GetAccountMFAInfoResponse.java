// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsMFAEnable")
    @Validation(required = true)
    public Boolean isMFAEnable;

    public static GetAccountMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoResponse self = new GetAccountMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountMFAInfoResponse setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

}
