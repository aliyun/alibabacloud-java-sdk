// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootARMServerInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebootARMServerInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootARMServerInstanceResponseBody self = new RebootARMServerInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootARMServerInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
