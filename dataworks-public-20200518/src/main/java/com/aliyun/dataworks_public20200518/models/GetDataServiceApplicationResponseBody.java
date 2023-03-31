// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationResponseBody extends TeaModel {
    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public GetDataServiceApplicationResponseBodyData data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationResponseBody self = new GetDataServiceApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApplicationResponseBody setData(GetDataServiceApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApplicationResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApplicationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The AppCode for simple authentication. You can select simple authentication or signature authentication when you call an API operation.</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The AppKey for signature authentication. You can select simple authentication or signature authentication when you call an API operation.</p>
         */
        @NameInMap("ApplicationKey")
        public String applicationKey;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The AppSecret for signature authentication. You can select simple authentication or signature authentication when you call an API operation.</p>
         */
        @NameInMap("ApplicationSecret")
        public String applicationSecret;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetDataServiceApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApplicationResponseBodyData self = new GetDataServiceApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApplicationResponseBodyData setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public GetDataServiceApplicationResponseBodyData setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public GetDataServiceApplicationResponseBodyData setApplicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }
        public String getApplicationKey() {
            return this.applicationKey;
        }

        public GetDataServiceApplicationResponseBodyData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetDataServiceApplicationResponseBodyData setApplicationSecret(String applicationSecret) {
            this.applicationSecret = applicationSecret;
            return this;
        }
        public String getApplicationSecret() {
            return this.applicationSecret;
        }

        public GetDataServiceApplicationResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
