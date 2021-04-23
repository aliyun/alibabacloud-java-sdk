// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckServiceForRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Deletable")
    public Boolean deletable;

    public static CheckServiceForRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceForRoleResponseBody self = new CheckServiceForRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceForRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceForRoleResponseBody setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

}
