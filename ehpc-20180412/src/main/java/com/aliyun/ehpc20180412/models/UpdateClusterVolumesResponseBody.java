// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6757FA4-8FED-4602-B7F5-3550C0842122</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClusterVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterVolumesResponseBody self = new UpdateClusterVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
