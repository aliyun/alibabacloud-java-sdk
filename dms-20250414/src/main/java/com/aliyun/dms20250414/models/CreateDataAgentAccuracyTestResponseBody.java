// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentAccuracyTestResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentAccuracyTestResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A61C2009-xxx-BE7E95CEDF2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateDataAgentAccuracyTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentAccuracyTestResponseBody self = new CreateDataAgentAccuracyTestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentAccuracyTestResponseBody setData(CreateDataAgentAccuracyTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentAccuracyTestResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentAccuracyTestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentAccuracyTestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentAccuracyTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentAccuracyTestResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentAccuracyTestResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID of the accuracy test.</p>
         * 
         * <strong>example:</strong>
         * <p>at-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestInsId")
        public String accuracyTestInsId;

        public static CreateDataAgentAccuracyTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentAccuracyTestResponseBodyData self = new CreateDataAgentAccuracyTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentAccuracyTestResponseBodyData setAccuracyTestInsId(String accuracyTestInsId) {
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }
        public String getAccuracyTestInsId() {
            return this.accuracyTestInsId;
        }

    }

}
