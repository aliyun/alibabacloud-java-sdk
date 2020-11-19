// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeMyCatDbListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DbNames")
    @Validation(required = true)
    public java.util.List<String> dbNames;

    public static DescribeMyCatDbListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyCatDbListResponse self = new DescribeMyCatDbListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyCatDbListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyCatDbListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMyCatDbListResponse setDbNames(java.util.List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public java.util.List<String> getDbNames() {
        return this.dbNames;
    }

}
