// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-5vb5q8sk0lyoscx8539ds</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    public static CreateEnsRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsRouteEntryResponseBody self = new CreateEnsRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnsRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEnsRouteEntryResponseBody setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

}
