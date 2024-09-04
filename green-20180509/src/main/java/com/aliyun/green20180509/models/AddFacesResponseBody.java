// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFacesResponseBody self = new AddFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
