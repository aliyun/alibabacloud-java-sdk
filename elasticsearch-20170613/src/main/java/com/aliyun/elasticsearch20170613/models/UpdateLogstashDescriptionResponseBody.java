// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashDescriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result returned.</p>
     */
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
        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>logstash_name</p>
         */
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
