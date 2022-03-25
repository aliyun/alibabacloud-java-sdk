// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyDisableOneResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CompanyDisableOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyDisableOneResponseBody self = new CompanyDisableOneResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyDisableOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompanyDisableOneResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
