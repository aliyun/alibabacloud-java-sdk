// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveRecordVodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordVodConfigResponse self = new AddLiveRecordVodConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordVodConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
