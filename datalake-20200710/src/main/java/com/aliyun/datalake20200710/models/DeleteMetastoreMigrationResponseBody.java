// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreMigrationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DeleteMetastoreMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreMigrationResponseBody self = new DeleteMetastoreMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetastoreMigrationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
