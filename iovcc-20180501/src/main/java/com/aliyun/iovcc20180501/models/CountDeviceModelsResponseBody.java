// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModelCount")
    public Integer modelCount;

    public static CountDeviceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceModelsResponseBody self = new CountDeviceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDeviceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDeviceModelsResponseBody setModelCount(Integer modelCount) {
        this.modelCount = modelCount;
        return this;
    }
    public Integer getModelCount() {
        return this.modelCount;
    }

}
