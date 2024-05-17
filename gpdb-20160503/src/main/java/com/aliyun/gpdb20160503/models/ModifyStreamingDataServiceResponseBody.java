// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStreamingDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataServiceResponseBody self = new ModifyStreamingDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
