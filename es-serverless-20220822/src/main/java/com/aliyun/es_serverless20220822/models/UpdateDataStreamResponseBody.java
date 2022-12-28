// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class UpdateDataStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateDataStreamResponseBodyResult result;

    public static UpdateDataStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStreamResponseBody self = new UpdateDataStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataStreamResponseBody setResult(UpdateDataStreamResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateDataStreamResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateDataStreamResponseBodyResult extends TeaModel {
        @NameInMap("appName")
        public String appName;

        public static UpdateDataStreamResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataStreamResponseBodyResult self = new UpdateDataStreamResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateDataStreamResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

}
