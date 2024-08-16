// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1F59F19C-EFD2-40B1-94D5-65B40CA8E34A</p>
     */
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
