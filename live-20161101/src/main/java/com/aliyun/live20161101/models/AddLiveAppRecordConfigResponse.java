// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveAppRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigResponse self = new AddLiveAppRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
