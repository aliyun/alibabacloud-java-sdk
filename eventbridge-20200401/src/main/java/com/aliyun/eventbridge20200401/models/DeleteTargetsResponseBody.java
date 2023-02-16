// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteTargetsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTargetsResponseBody self = new DeleteTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTargetsResponseBody setData(DeleteTargetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteTargetsResponseBodyData getData() {
        return this.data;
    }

    public DeleteTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteTargetsResponseBodyDataErrorEntries extends TeaModel {
        @NameInMap("EntryId")
        public String entryId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static DeleteTargetsResponseBodyDataErrorEntries build(java.util.Map<String, ?> map) throws Exception {
            DeleteTargetsResponseBodyDataErrorEntries self = new DeleteTargetsResponseBodyDataErrorEntries();
            return TeaModel.build(map, self);
        }

        public DeleteTargetsResponseBodyDataErrorEntries setEntryId(String entryId) {
            this.entryId = entryId;
            return this;
        }
        public String getEntryId() {
            return this.entryId;
        }

        public DeleteTargetsResponseBodyDataErrorEntries setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteTargetsResponseBodyDataErrorEntries setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class DeleteTargetsResponseBodyData extends TeaModel {
        @NameInMap("ErrorEntries")
        public java.util.List<DeleteTargetsResponseBodyDataErrorEntries> errorEntries;

        @NameInMap("ErrorEntriesCount")
        public Integer errorEntriesCount;

        public static DeleteTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteTargetsResponseBodyData self = new DeleteTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteTargetsResponseBodyData setErrorEntries(java.util.List<DeleteTargetsResponseBodyDataErrorEntries> errorEntries) {
            this.errorEntries = errorEntries;
            return this;
        }
        public java.util.List<DeleteTargetsResponseBodyDataErrorEntries> getErrorEntries() {
            return this.errorEntries;
        }

        public DeleteTargetsResponseBodyData setErrorEntriesCount(Integer errorEntriesCount) {
            this.errorEntriesCount = errorEntriesCount;
            return this;
        }
        public Integer getErrorEntriesCount() {
            return this.errorEntriesCount;
        }

    }

}
