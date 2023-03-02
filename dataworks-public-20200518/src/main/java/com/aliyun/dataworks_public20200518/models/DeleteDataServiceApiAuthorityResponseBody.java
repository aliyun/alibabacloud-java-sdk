// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiAuthorityResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the access permissions are revoked.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataServiceApiAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceApiAuthorityResponseBody self = new DeleteDataServiceApiAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceApiAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataServiceApiAuthorityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
