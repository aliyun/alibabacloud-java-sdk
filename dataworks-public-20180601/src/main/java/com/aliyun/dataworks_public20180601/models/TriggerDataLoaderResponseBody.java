// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class TriggerDataLoaderResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static TriggerDataLoaderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerDataLoaderResponseBody self = new TriggerDataLoaderResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerDataLoaderResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public TriggerDataLoaderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
