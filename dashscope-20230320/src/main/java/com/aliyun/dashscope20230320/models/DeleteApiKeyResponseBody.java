// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class DeleteApiKeyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyResponseBody self = new DeleteApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
