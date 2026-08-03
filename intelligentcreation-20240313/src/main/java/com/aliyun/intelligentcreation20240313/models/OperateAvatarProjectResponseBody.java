// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OperateAvatarProjectResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static OperateAvatarProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateAvatarProjectResponseBody self = new OperateAvatarProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateAvatarProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateAvatarProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
