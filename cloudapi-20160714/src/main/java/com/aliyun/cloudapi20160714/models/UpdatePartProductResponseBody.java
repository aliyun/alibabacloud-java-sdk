// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePartProductResponseBody extends TeaModel {
    @NameInMap("isSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePartProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartProductResponseBody self = new UpdatePartProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePartProductResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdatePartProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
