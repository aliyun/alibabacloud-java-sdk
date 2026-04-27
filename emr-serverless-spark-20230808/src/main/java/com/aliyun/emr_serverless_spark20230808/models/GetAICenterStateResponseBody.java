// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetAICenterStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("state")
    public String state;

    public static GetAICenterStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICenterStateResponseBody self = new GetAICenterStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICenterStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICenterStateResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
