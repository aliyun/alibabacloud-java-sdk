// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>Success: The call succeeded.</li>
     * <li>Other codes: The call failed. For more information about error codes, see Error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public PutTargetsResponseBodyData data;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The event rule not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FB52207-7621-5292-BDF2-A17E2E984160</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EventRuleTargetIdDuplicate</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
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
         * <p>The ID of the failed event target.</p>
         */
        @NameInMap("ErrorEntries")
        public java.util.List<PutTargetsResponseBodyDataErrorEntries> errorEntries;

        /**
         * <p>The number of failed event targets. Valid values:</p>
         * <ul>
         * <li>0: All event targets succeeded.</li>
         * <li>An integer other than 0: indicates the number of failed event targets.</li>
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
