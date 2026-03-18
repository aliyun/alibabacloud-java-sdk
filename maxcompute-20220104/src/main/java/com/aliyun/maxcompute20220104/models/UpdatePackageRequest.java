// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdatePackageRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static UpdatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePackageRequest self = new UpdatePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePackageRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
