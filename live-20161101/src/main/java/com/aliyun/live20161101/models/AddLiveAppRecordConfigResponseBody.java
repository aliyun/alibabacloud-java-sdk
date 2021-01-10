// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveAppRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigResponseBody self = new AddLiveAppRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
