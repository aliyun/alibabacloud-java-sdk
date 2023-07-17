// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckDataConsistencyResponseBody extends TeaModel {
    @NameInMap("IsDataConsistency")
    public Boolean isDataConsistency;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDataConsistencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDataConsistencyResponseBody self = new CheckDataConsistencyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDataConsistencyResponseBody setIsDataConsistency(Boolean isDataConsistency) {
        this.isDataConsistency = isDataConsistency;
        return this;
    }
    public Boolean getIsDataConsistency() {
        return this.isDataConsistency;
    }

    public CheckDataConsistencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
