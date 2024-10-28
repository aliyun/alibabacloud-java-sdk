// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerLogsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerLogsResponseBody self = new GetEdgeContainerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerLogsResponseBody setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public GetEdgeContainerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
