// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiAuthorityResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the authorization was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataServiceApiAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiAuthorityResponseBody self = new CreateDataServiceApiAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataServiceApiAuthorityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
