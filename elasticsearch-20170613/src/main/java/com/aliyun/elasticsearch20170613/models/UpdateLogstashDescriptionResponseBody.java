// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateLogstashDescriptionResponseBodyResult result;

    public static UpdateLogstashDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashDescriptionResponseBody self = new UpdateLogstashDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLogstashDescriptionResponseBody setResult(UpdateLogstashDescriptionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLogstashDescriptionResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLogstashDescriptionResponseBodyResult extends TeaModel {
        @NameInMap("description")
        public String description;

        public static UpdateLogstashDescriptionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogstashDescriptionResponseBodyResult self = new UpdateLogstashDescriptionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLogstashDescriptionResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
