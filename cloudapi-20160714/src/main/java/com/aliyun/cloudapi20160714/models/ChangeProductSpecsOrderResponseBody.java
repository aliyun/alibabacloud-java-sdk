// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ChangeProductSpecsOrderResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeProductSpecsOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeProductSpecsOrderResponseBody self = new ChangeProductSpecsOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeProductSpecsOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ChangeProductSpecsOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
