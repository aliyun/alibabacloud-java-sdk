// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteUserSearchCompanyResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserSearchCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSearchCompanyResponseBody self = new DeleteUserSearchCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserSearchCompanyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteUserSearchCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
