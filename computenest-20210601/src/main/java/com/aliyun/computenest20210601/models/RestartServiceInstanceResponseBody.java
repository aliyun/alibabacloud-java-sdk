// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RestartServiceInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartServiceInstanceResponseBody self = new RestartServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
