// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteTargetsResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteTargetsResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBusNotExist</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78FA9EAC-F0C0-58B0-871E-9F9756CE1D29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the event body that failed to be processed.</p>
         * 
         * <strong>example:</strong>
         * <p>target5</p>
         */
        @NameInMap("EntryId")
        public String entryId;

        /**
         * <p>The returned error code.</p>
         * 
         * <strong>example:</strong>
         * <p>EventRuleTargetIdDuplicate</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The id of event target is duplicate!</p>
         */
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
        /**
         * <p>The information about the event body that failed to be processed.</p>
         */
        @NameInMap("ErrorEntries")
        public java.util.List<DeleteTargetsResponseBodyDataErrorEntries> errorEntries;

        /**
         * <p>The number of event bodies that failed to be processed. Valid values: 0: No event bodies failed to be processed. An integer other than 0: the number of event bodies that failed to be processed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
