// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelCommonSchemaRefResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpsertUmodelCommonSchemaRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelCommonSchemaRefResponseBody self = new UpsertUmodelCommonSchemaRefResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelCommonSchemaRefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
