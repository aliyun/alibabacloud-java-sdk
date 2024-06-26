// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateMemberRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UpdateMemberRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberRoleResponseBody self = new UpdateMemberRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemberRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMemberRoleResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
