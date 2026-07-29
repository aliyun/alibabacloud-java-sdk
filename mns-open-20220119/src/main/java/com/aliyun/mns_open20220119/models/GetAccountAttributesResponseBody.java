// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetAccountAttributesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetAccountAttributesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response status.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAccountAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAttributesResponseBody self = new GetAccountAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAccountAttributesResponseBody setData(GetAccountAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountAttributesResponseBodyData getData() {
        return this.data;
    }

    public GetAccountAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAccountAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountAttributesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the Log Management feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogEnabled")
        public Boolean logEnabled;

        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>Indicates whether the message trace feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MessageTraceEnabled")
        public Boolean messageTraceEnabled;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetAccountAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountAttributesResponseBodyData self = new GetAccountAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountAttributesResponseBodyData setLogEnabled(Boolean logEnabled) {
            this.logEnabled = logEnabled;
            return this;
        }
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        public GetAccountAttributesResponseBodyData setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetAccountAttributesResponseBodyData setMessageTraceEnabled(Boolean messageTraceEnabled) {
            this.messageTraceEnabled = messageTraceEnabled;
            return this;
        }
        public Boolean getMessageTraceEnabled() {
            return this.messageTraceEnabled;
        }

        public GetAccountAttributesResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
