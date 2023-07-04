// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateTaskCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public UpdateTaskCustomerResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static UpdateTaskCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskCustomerResponseBody self = new UpdateTaskCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskCustomerResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateTaskCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTaskCustomerResponseBody setModel(UpdateTaskCustomerResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public UpdateTaskCustomerResponseBodyModel getModel() {
        return this.model;
    }

    public UpdateTaskCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTaskCustomerResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public UpdateTaskCustomerResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class UpdateTaskCustomerResponseBodyModel extends TeaModel {
        /**
         * <p>错误手机列表</p>
         */
        @NameInMap("UnHandleNumbers")
        public java.util.List<String> unHandleNumbers;

        public static UpdateTaskCustomerResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskCustomerResponseBodyModel self = new UpdateTaskCustomerResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateTaskCustomerResponseBodyModel setUnHandleNumbers(java.util.List<String> unHandleNumbers) {
            this.unHandleNumbers = unHandleNumbers;
            return this;
        }
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

    }

}
