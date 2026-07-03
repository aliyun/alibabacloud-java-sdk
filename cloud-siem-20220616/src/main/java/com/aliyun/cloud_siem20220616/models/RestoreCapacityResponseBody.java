// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class RestoreCapacityResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the delete command was sent. Valid values:</p>
     * <ul>
     * <li><p>true: The delete command was sent and the cleanup is in progress.</p>
     * </li>
     * <li><p>false: The command failed to send.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-58D4-55B2-87B9-74D413F7****</p>
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
