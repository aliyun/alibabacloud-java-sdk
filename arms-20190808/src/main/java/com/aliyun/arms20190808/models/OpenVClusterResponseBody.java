// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenVClusterResponseBody extends TeaModel {
    /**
     * <p>The response parameters in the JSON format.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenVClusterResponseBody self = new OpenVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenVClusterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
