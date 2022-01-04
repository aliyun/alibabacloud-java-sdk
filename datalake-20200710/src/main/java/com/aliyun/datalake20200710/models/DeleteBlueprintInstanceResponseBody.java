// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DeleteBlueprintInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlueprintInstanceResponseBody self = new DeleteBlueprintInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBlueprintInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBlueprintInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
