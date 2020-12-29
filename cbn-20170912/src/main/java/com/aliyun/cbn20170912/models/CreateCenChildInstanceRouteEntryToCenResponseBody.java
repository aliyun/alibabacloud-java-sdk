// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenChildInstanceRouteEntryToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToCenResponseBody self = new CreateCenChildInstanceRouteEntryToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
