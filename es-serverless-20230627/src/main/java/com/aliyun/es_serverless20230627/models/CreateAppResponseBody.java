// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateAppResponseBodyResult result;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setResult(CreateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppResponseBodyResult extends TeaModel {
        @NameInMap("instaneId")
        public String instaneId;

        public static CreateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResult self = new CreateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResult setInstaneId(String instaneId) {
            this.instaneId = instaneId;
            return this;
        }
        public String getInstaneId() {
            return this.instaneId;
        }

    }

}
