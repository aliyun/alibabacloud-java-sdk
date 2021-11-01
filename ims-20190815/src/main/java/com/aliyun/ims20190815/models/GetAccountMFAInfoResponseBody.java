// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoResponseBody extends TeaModel {
    @NameInMap("IsMFAEnable")
    public Boolean isMFAEnable;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountMFAInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoResponseBody self = new GetAccountMFAInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoResponseBody setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    public GetAccountMFAInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
