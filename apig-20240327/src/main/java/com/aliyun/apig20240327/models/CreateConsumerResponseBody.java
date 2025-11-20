// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public CreateConsumerResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>479AE38F-A574-52F7-87EA-E91199999F9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerResponseBody self = new CreateConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsumerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConsumerResponseBody setData(CreateConsumerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConsumerResponseBodyData getData() {
        return this.data;
    }

    public CreateConsumerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConsumerResponseBodyData extends TeaModel {
        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-cvnjramm1hks1r3fmmug</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        public static CreateConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerResponseBodyData self = new CreateConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConsumerResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

    }

}
