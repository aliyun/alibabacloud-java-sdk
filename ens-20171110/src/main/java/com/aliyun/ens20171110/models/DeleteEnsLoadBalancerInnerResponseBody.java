// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsLoadBalancerInnerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnsLoadBalancerInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsLoadBalancerInnerResponseBody self = new DeleteEnsLoadBalancerInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnsLoadBalancerInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
