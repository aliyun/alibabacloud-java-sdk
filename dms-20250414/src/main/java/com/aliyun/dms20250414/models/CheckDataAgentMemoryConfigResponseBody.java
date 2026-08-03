// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CheckDataAgentMemoryConfigResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public CheckDataAgentMemoryConfigResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
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
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckDataAgentMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDataAgentMemoryConfigResponseBody self = new CheckDataAgentMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDataAgentMemoryConfigResponseBody setData(CheckDataAgentMemoryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDataAgentMemoryConfigResponseBodyData getData() {
        return this.data;
    }

    public CheckDataAgentMemoryConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckDataAgentMemoryConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckDataAgentMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDataAgentMemoryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckDataAgentMemoryConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether memory generation is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether memory recall is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecallEnabled")
        public Boolean recallEnabled;

        public static CheckDataAgentMemoryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDataAgentMemoryConfigResponseBodyData self = new CheckDataAgentMemoryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDataAgentMemoryConfigResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CheckDataAgentMemoryConfigResponseBodyData setRecallEnabled(Boolean recallEnabled) {
            this.recallEnabled = recallEnabled;
            return this;
        }
        public Boolean getRecallEnabled() {
            return this.recallEnabled;
        }

    }

}
