// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordVodConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveRecordVodConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordVodConfigResponseBody self = new DeleteLiveRecordVodConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordVodConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
