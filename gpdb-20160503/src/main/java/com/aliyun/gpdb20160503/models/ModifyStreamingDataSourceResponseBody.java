// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStreamingDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataSourceResponseBody self = new ModifyStreamingDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
