// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVbrHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCenVbrHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCenVbrHealthCheckResponseBody self = new DisableCenVbrHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCenVbrHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
