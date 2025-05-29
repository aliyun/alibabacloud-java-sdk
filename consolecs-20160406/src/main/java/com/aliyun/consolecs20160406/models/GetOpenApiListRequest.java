// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.consolecs20160406.models;

import com.aliyun.tea.*;

public class GetOpenApiListRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetOpenApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiListRequest self = new GetOpenApiListRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenApiListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
