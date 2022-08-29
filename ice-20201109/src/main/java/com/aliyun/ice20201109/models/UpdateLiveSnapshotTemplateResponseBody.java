// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveSnapshotTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotTemplateResponseBody self = new UpdateLiveSnapshotTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
