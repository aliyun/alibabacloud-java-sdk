// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PutTargetsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutTargetsResponseBody self = new PutTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutTargetsResponseBody setData(PutTargetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutTargetsResponseBodyData getData() {
        return this.data;
    }

    public PutTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutTargetsResponseBodyDataErrorEntries extends TeaModel {
        @NameInMap("EntryId")
        public String entryId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static PutTargetsResponseBodyDataErrorEntries build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsResponseBodyDataErrorEntries self = new PutTargetsResponseBodyDataErrorEntries();
            return TeaModel.build(map, self);
        }

        public PutTargetsResponseBodyDataErrorEntries setEntryId(String entryId) {
            this.entryId = entryId;
            return this;
        }
        public String getEntryId() {
            return this.entryId;
        }

        public PutTargetsResponseBodyDataErrorEntries setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PutTargetsResponseBodyDataErrorEntries setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class PutTargetsResponseBodyData extends TeaModel {
        @NameInMap("ErrorEntries")
        public java.util.List<PutTargetsResponseBodyDataErrorEntries> errorEntries;

        @NameInMap("ErrorEntriesCount")
        public Integer errorEntriesCount;

        public static PutTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutTargetsResponseBodyData self = new PutTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutTargetsResponseBodyData setErrorEntries(java.util.List<PutTargetsResponseBodyDataErrorEntries> errorEntries) {
            this.errorEntries = errorEntries;
            return this;
        }
        public java.util.List<PutTargetsResponseBodyDataErrorEntries> getErrorEntries() {
            return this.errorEntries;
        }

        public PutTargetsResponseBodyData setErrorEntriesCount(Integer errorEntriesCount) {
            this.errorEntriesCount = errorEntriesCount;
            return this;
        }
        public Integer getErrorEntriesCount() {
            return this.errorEntriesCount;
        }

    }

}
