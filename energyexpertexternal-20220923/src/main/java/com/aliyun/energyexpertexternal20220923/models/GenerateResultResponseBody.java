// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GenerateResultResponseBody extends TeaModel {
    /**
     * <p>The returned data. `true` indicates that the request is successful, `false` indicates that the request fails.</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GenerateResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateResultResponseBody self = new GenerateResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateResultResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GenerateResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
