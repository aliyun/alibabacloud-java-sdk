// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RestartServiceInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
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
