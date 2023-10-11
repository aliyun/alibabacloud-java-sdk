// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GrantHonorResponseBody extends TeaModel {
    @NameInMap("failedUserIds")
    public java.util.List<String> failedUserIds;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("successUserIds")
    public java.util.List<String> successUserIds;

    public static GrantHonorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantHonorResponseBody self = new GrantHonorResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantHonorResponseBody setFailedUserIds(java.util.List<String> failedUserIds) {
        this.failedUserIds = failedUserIds;
        return this;
    }
    public java.util.List<String> getFailedUserIds() {
        return this.failedUserIds;
    }

    public GrantHonorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantHonorResponseBody setSuccessUserIds(java.util.List<String> successUserIds) {
        this.successUserIds = successUserIds;
        return this;
    }
    public java.util.List<String> getSuccessUserIds() {
        return this.successUserIds;
    }

}
