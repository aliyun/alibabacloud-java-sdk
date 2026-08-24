// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddDataAgentMemoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddDataAgentMemoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddDataAgentMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataAgentMemoryResponseBody self = new AddDataAgentMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataAgentMemoryResponseBody setData(AddDataAgentMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataAgentMemoryResponseBodyData getData() {
        return this.data;
    }

    public AddDataAgentMemoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddDataAgentMemoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddDataAgentMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDataAgentMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDataAgentMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dlc1********63eqm</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AddDataAgentMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataAgentMemoryResponseBodyData self = new AddDataAgentMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataAgentMemoryResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public AddDataAgentMemoryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
