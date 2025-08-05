// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SetSuccessInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static SetSuccessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessInstanceResponseBody self = new SetSuccessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSuccessInstanceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetSuccessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
