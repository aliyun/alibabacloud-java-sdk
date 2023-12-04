// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckGrantResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account. Valid values:</p>
     * <br>
     * <p>*   **1**: Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     * <p>*   **0**: Anti-DDoS Origin is not authorized to obtain information about the assets within the current Alibaba Cloud account.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static CheckGrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckGrantResponseBody self = new CheckGrantResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckGrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckGrantResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
