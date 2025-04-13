// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiSourcePointBatchUploadRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static MultiSourcePointBatchUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiSourcePointBatchUploadRequest self = new MultiSourcePointBatchUploadRequest();
        return TeaModel.build(map, self);
    }

    public MultiSourcePointBatchUploadRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
