// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckGrantResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DB002CE5-5E6C-5F11-AE15-B525299A40F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</li>
     * <li><strong>0</strong>: Anti-DDoS Origin is not authorized to obtain information about the assets within the current Alibaba Cloud account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
