// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFacesResponseBody self = new GetFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
