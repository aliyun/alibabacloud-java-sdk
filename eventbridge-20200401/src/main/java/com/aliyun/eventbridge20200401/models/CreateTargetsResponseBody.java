// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTargetsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetsResponseBody self = new CreateTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTargetsResponseBody setData(CreateTargetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTargetsResponseBodyData getData() {
        return this.data;
    }

    public CreateTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTargetsResponseBodyDataErrorEntries extends TeaModel {
        @NameInMap("EntryId")
        public String entryId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static CreateTargetsResponseBodyDataErrorEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateTargetsResponseBodyDataErrorEntries self = new CreateTargetsResponseBodyDataErrorEntries();
            return TeaModel.build(map, self);
        }

        public CreateTargetsResponseBodyDataErrorEntries setEntryId(String entryId) {
            this.entryId = entryId;
            return this;
        }
        public String getEntryId() {
            return this.entryId;
        }

        public CreateTargetsResponseBodyDataErrorEntries setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateTargetsResponseBodyDataErrorEntries setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class CreateTargetsResponseBodyData extends TeaModel {
        @NameInMap("ErrorEntries")
        public java.util.List<CreateTargetsResponseBodyDataErrorEntries> errorEntries;

        @NameInMap("ErrorEntriesCount")
        public Integer errorEntriesCount;

        public static CreateTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTargetsResponseBodyData self = new CreateTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTargetsResponseBodyData setErrorEntries(java.util.List<CreateTargetsResponseBodyDataErrorEntries> errorEntries) {
            this.errorEntries = errorEntries;
            return this;
        }
        public java.util.List<CreateTargetsResponseBodyDataErrorEntries> getErrorEntries() {
            return this.errorEntries;
        }

        public CreateTargetsResponseBodyData setErrorEntriesCount(Integer errorEntriesCount) {
            this.errorEntriesCount = errorEntriesCount;
            return this;
        }
        public Integer getErrorEntriesCount() {
            return this.errorEntriesCount;
        }

    }

}
