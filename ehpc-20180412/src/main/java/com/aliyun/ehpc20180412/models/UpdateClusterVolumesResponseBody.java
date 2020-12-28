// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesResponseBody extends TeaModel {
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
