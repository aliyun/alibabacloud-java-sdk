// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiFieldBatchUploadRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static MultiFieldBatchUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiFieldBatchUploadRequest self = new MultiFieldBatchUploadRequest();
        return TeaModel.build(map, self);
    }

    public MultiFieldBatchUploadRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
