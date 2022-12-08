// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteRecordResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordResponseBody self = new DeleteRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRecordResponseBody setData(DeleteRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteRecordResponseBodyData getData() {
        return this.data;
    }

    public DeleteRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRecordResponseBodyData extends TeaModel {
        @NameInMap("DeletedCount")
        public Integer deletedCount;

        public static DeleteRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteRecordResponseBodyData self = new DeleteRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteRecordResponseBodyData setDeletedCount(Integer deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }
        public Integer getDeletedCount() {
            return this.deletedCount;
        }

    }

}
