// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveRecordVodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordVodConfigResponse self = new DeleteLiveRecordVodConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordVodConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
