// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateAppResponseBodyResult result;

    public static UpdateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppResponseBody self = new UpdateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppResponseBody setResult(UpdateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateAppResponseBodyResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        public static UpdateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppResponseBodyResult self = new UpdateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateAppResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
