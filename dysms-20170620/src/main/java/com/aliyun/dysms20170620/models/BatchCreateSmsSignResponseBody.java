// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchCreateSmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchCreateSmsSignResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSmsSignResponseBody self = new BatchCreateSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateSmsSignResponseBody setData(BatchCreateSmsSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCreateSmsSignResponseBodyData getData() {
        return this.data;
    }

    public BatchCreateSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateSmsSignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateSmsSignResponseBodyData extends TeaModel {
        @NameInMap("AppliedNum")
        public Integer appliedNum;

        @NameInMap("AvailableNum")
        public Integer availableNum;

        @NameInMap("BatchCreateSmsSignResult")
        public String batchCreateSmsSignResult;

        public static BatchCreateSmsSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateSmsSignResponseBodyData self = new BatchCreateSmsSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateSmsSignResponseBodyData setAppliedNum(Integer appliedNum) {
            this.appliedNum = appliedNum;
            return this;
        }
        public Integer getAppliedNum() {
            return this.appliedNum;
        }

        public BatchCreateSmsSignResponseBodyData setAvailableNum(Integer availableNum) {
            this.availableNum = availableNum;
            return this;
        }
        public Integer getAvailableNum() {
            return this.availableNum;
        }

        public BatchCreateSmsSignResponseBodyData setBatchCreateSmsSignResult(String batchCreateSmsSignResult) {
            this.batchCreateSmsSignResult = batchCreateSmsSignResult;
            return this;
        }
        public String getBatchCreateSmsSignResult() {
            return this.batchCreateSmsSignResult;
        }

    }

}
