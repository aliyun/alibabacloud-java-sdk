// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAppRecordConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveAppRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAppRecordConfigResponseBody self = new DeleteLiveAppRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAppRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
