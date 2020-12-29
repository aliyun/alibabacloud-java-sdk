// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCenVbrHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVbrHealthCheckResponseBody self = new EnableCenVbrHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCenVbrHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
