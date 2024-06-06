// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSourceConstituteResponseBody extends TeaModel {
    /**
     * <p>Response parameters</p>
     */
    @NameInMap("data")
    public java.util.List<ConstituteItem> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEmissionSourceConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSourceConstituteResponseBody self = new GetEmissionSourceConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmissionSourceConstituteResponseBody setData(java.util.List<ConstituteItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConstituteItem> getData() {
        return this.data;
    }

    public GetEmissionSourceConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
