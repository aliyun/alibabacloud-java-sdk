// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetExtraDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ExtraDataSource result;

    public static GetExtraDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExtraDataSourceResponseBody self = new GetExtraDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExtraDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExtraDataSourceResponseBody setResult(ExtraDataSource result) {
        this.result = result;
        return this;
    }
    public ExtraDataSource getResult() {
        return this.result;
    }

}
