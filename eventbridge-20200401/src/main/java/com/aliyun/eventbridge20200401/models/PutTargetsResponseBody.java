// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li><p>Success: The request was successful.</p>
     * </li>
     * <li><p>Other values indicate an error. For details, see Error codes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public PutTargetsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The event rule not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6FB52207-7621-5292-BDF2-A17E2E984160</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns true if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the failed event target.</p>
         * 
         * <strong>example:</strong>
         * <p>Mlm123456JHd2RsRoKw</p>
         */
        @NameInMap("EntryId")
        public String entryId;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>EventRuleTargetIdDuplicate</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The description of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>The id of event target is duplicate!</p>
         */
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
        /**
         * <p>Details about the event targets that failed to be processed.</p>
         */
        @NameInMap("ErrorEntries")
        public java.util.List<PutTargetsResponseBodyDataErrorEntries> errorEntries;

        /**
         * <p>The number of event targets that failed to be processed. A value of 0 indicates that all event targets were processed successfully.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
