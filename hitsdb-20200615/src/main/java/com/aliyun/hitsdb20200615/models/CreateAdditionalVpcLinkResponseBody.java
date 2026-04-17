// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAdditionalVpcLinkResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAdditionalVpcLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdditionalVpcLinkResponseBody self = new CreateAdditionalVpcLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdditionalVpcLinkResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAdditionalVpcLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
