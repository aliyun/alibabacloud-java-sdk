// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetDirQuotaResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDirQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDirQuotaResponseBody self = new SetDirQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDirQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetDirQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
