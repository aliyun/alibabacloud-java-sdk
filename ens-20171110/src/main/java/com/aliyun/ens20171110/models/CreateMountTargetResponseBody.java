// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateMountTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>70EACC9C-D07A-4A34-ADA4-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the mount target. Valid values:</p>
     * <ul>
     * <li>active</li>
     * <li>inactive</li>
     * <li>pending</li>
     * <li>deleting</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetResponseBody self = new CreateMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMountTargetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
