// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class SourcePointBatchRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    public static SourcePointBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SourcePointBatchRequest self = new SourcePointBatchRequest();
        return TeaModel.build(map, self);
    }

    public SourcePointBatchRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

}
