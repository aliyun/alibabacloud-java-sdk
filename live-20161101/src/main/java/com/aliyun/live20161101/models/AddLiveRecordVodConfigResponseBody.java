// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveRecordVodConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordVodConfigResponseBody self = new AddLiveRecordVodConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordVodConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
