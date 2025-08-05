// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RemoveTaskParentRelationResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTaskParentRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskParentRelationResponseBody self = new RemoveTaskParentRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTaskParentRelationResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RemoveTaskParentRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
