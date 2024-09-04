// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacesResponseBody self = new DeleteFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
