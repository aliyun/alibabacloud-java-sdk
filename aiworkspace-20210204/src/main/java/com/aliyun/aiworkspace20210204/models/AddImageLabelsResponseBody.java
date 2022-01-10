// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageLabelsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static AddImageLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageLabelsResponseBody self = new AddImageLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
