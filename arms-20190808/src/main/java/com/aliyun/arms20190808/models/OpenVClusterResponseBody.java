// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenVClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster ID. The value is a string.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID. You can use the ID to find logs and troubleshoot issues.</p>
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
