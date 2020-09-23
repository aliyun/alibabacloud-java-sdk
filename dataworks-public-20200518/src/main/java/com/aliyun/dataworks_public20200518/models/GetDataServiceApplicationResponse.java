// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDataServiceApplicationResponseData data;

    public static GetDataServiceApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationResponse self = new GetDataServiceApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApplicationResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApplicationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApplicationResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApplicationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceApplicationResponse setData(GetDataServiceApplicationResponseData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApplicationResponseData getData() {
        return this.data;
    }

    public static class GetDataServiceApplicationResponseData extends TeaModel {
        @NameInMap("ApplicationCode")
        @Validation(required = true)
        public String applicationCode;

        @NameInMap("ApplicationId")
        @Validation(required = true)
        public Long applicationId;

        @NameInMap("ApplicationKey")
        @Validation(required = true)
        public String applicationKey;

        @NameInMap("ApplicationName")
        @Validation(required = true)
        public String applicationName;

        @NameInMap("ApplicationSecret")
        @Validation(required = true)
        public String applicationSecret;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetDataServiceApplicationResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApplicationResponseData self = new GetDataServiceApplicationResponseData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApplicationResponseData setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public GetDataServiceApplicationResponseData setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public GetDataServiceApplicationResponseData setApplicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }
        public String getApplicationKey() {
            return this.applicationKey;
        }

        public GetDataServiceApplicationResponseData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetDataServiceApplicationResponseData setApplicationSecret(String applicationSecret) {
            this.applicationSecret = applicationSecret;
            return this;
        }
        public String getApplicationSecret() {
            return this.applicationSecret;
        }

        public GetDataServiceApplicationResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
