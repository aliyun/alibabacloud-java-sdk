// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppKeyRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUpstreamAppKeyRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppKeyRelationResponseBody self = new DeleteUpstreamAppKeyRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppKeyRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
