// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BundleId")
    @Validation(required = true)
    public String bundleId;

    public static CreateBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleResponse self = new CreateBundleResponse();
        return TeaModel.build(map, self);
    }

    public CreateBundleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBundleResponse setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

}
