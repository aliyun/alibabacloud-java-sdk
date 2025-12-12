// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class RestartInstanceNodeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36E3AB2E-E0DA-5C7B-8E29-89EE44926515</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartInstanceNodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceNodeListResponseBody self = new RestartInstanceNodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartInstanceNodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
