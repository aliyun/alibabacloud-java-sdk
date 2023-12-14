// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class RestoreCapacityResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the release command has been sent. Valid values:</p>
     * <br>
     * <p>*   true: The command has been sent and the storage space is being released.</p>
     * <p>*   false: The command failed to be sent.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreCapacityResponseBody self = new RestoreCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreCapacityResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RestoreCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
