// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UpdateBlueprintInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlueprintInstanceResponseBody self = new UpdateBlueprintInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBlueprintInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBlueprintInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
