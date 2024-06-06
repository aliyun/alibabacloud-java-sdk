// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEpdInventoryConstituteResponseBody extends TeaModel {
    /**
     * <p>List of environmental impact results.</p>
     */
    @NameInMap("data")
    public java.util.List<EpdInventoryConstituteItem> data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEpdInventoryConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEpdInventoryConstituteResponseBody self = new GetEpdInventoryConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEpdInventoryConstituteResponseBody setData(java.util.List<EpdInventoryConstituteItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EpdInventoryConstituteItem> getData() {
        return this.data;
    }

    public GetEpdInventoryConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
