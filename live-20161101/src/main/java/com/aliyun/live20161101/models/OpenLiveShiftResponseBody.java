// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class OpenLiveShiftResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenLiveShiftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenLiveShiftResponseBody self = new OpenLiveShiftResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenLiveShiftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
