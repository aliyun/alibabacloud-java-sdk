// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpsertUmodelDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelDataResponseBody self = new UpsertUmodelDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
