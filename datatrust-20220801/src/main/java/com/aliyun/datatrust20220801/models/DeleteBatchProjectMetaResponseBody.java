// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteBatchProjectMetaResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<DeleteBatchProjectMetaResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteBatchProjectMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchProjectMetaResponseBody self = new DeleteBatchProjectMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBatchProjectMetaResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteBatchProjectMetaResponseBody setData(java.util.List<DeleteBatchProjectMetaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeleteBatchProjectMetaResponseBodyData> getData() {
        return this.data;
    }

    public DeleteBatchProjectMetaResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteBatchProjectMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteBatchProjectMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBatchProjectMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteBatchProjectMetaResponseBodyData extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("TargetTableId")
        public Long targetTableId;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static DeleteBatchProjectMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteBatchProjectMetaResponseBodyData self = new DeleteBatchProjectMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteBatchProjectMetaResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DeleteBatchProjectMetaResponseBodyData setTargetTableId(Long targetTableId) {
            this.targetTableId = targetTableId;
            return this;
        }
        public Long getTargetTableId() {
            return this.targetTableId;
        }

        public DeleteBatchProjectMetaResponseBodyData setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

}
