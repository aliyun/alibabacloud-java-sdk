// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateDataStreamResponseBodyResult result;

    public static CreateDataStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataStreamResponseBody self = new CreateDataStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataStreamResponseBody setResult(CreateDataStreamResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDataStreamResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateDataStreamResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ds-</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateDataStreamResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataStreamResponseBodyResult self = new CreateDataStreamResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDataStreamResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
