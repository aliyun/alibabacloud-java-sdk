// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-pnlg1ds9rky4****</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHpcClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponseBody self = new CreateHpcClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHpcClusterResponseBody setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateHpcClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
