// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AddTagsBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddTagsBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagsBatchResponseBody self = new AddTagsBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagsBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
