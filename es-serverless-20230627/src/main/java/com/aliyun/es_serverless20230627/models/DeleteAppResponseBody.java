// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteAppResponseBodyResult result;

    public static DeleteAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResponseBody self = new DeleteAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppResponseBody setResult(DeleteAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteAppResponseBodyResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        public static DeleteAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppResponseBodyResult self = new DeleteAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAppResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
