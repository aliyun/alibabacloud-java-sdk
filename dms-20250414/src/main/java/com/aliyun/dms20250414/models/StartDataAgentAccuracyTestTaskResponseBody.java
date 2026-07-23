// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartDataAgentAccuracyTestTaskResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public StartDataAgentAccuracyTestTaskResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D94F5232-xxx-EH0H28FGGI5I</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>True: The request was successful.                                 </li>
     * <li>False: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static StartDataAgentAccuracyTestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDataAgentAccuracyTestTaskResponseBody self = new StartDataAgentAccuracyTestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDataAgentAccuracyTestTaskResponseBody setData(StartDataAgentAccuracyTestTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartDataAgentAccuracyTestTaskResponseBodyData getData() {
        return this.data;
    }

    public StartDataAgentAccuracyTestTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartDataAgentAccuracyTestTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartDataAgentAccuracyTestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDataAgentAccuracyTestTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class StartDataAgentAccuracyTestTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the accuracy test task.</p>
         * 
         * <strong>example:</strong>
         * <p>692abb8f-xxx-77fec862db34</p>
         */
        @NameInMap("AccuracyTestTaskId")
        public String accuracyTestTaskId;

        public static StartDataAgentAccuracyTestTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartDataAgentAccuracyTestTaskResponseBodyData self = new StartDataAgentAccuracyTestTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartDataAgentAccuracyTestTaskResponseBodyData setAccuracyTestTaskId(String accuracyTestTaskId) {
            this.accuracyTestTaskId = accuracyTestTaskId;
            return this;
        }
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

    }

}
