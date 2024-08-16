// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToCenResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C05000A4-2FC5-5B2C-9527-954044DE2CF3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenChildInstanceRouteEntryToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToCenResponseBody self = new DeleteCenChildInstanceRouteEntryToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
