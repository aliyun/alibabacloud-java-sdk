// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddBlacklistResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AddBlacklistResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static AddBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistResponseBody self = new AddBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBlacklistResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddBlacklistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddBlacklistResponseBody setModel(AddBlacklistResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AddBlacklistResponseBodyModel getModel() {
        return this.model;
    }

    public AddBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddBlacklistResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AddBlacklistResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AddBlacklistResponseBodyModel extends TeaModel {
        /**
         * <p>错误手机号</p>
         */
        @NameInMap("UnHandleNumbers")
        public java.util.List<String> unHandleNumbers;

        public static AddBlacklistResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AddBlacklistResponseBodyModel self = new AddBlacklistResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AddBlacklistResponseBodyModel setUnHandleNumbers(java.util.List<String> unHandleNumbers) {
            this.unHandleNumbers = unHandleNumbers;
            return this;
        }
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

    }

}
