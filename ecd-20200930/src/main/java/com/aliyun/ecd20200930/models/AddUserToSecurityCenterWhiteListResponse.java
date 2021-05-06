// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToSecurityCenterWhiteListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddUserToSecurityCenterWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToSecurityCenterWhiteListResponse self = new AddUserToSecurityCenterWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToSecurityCenterWhiteListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
