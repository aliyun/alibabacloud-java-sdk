// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FDF34727-1664-44C1-A8DA-3EB72D60****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateDescriptionResponseBodyResult result;

    public static UpdateDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDescriptionResponseBody self = new UpdateDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDescriptionResponseBody setResult(UpdateDescriptionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateDescriptionResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateDescriptionResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aliyunes_test_name</p>
         */
        @NameInMap("description")
        public String description;

        public static UpdateDescriptionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateDescriptionResponseBodyResult self = new UpdateDescriptionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateDescriptionResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
