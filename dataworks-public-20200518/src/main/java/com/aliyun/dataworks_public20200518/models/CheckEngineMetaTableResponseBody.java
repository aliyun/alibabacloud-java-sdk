// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckEngineMetaTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaTableResponseBody self = new CheckEngineMetaTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaTableResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckEngineMetaTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
