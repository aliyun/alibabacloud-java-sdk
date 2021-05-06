// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSitesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteOfficeSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSitesResponse self = new DeleteOfficeSitesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSitesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
