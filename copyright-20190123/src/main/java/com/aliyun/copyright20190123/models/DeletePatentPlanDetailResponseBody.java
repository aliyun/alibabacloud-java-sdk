// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentPlanDetailResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static DeletePatentPlanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentPlanDetailResponseBody self = new DeletePatentPlanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePatentPlanDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeletePatentPlanDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
