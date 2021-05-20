// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetDataServiceApplicationResponseBodyData data;

    public static GetDataServiceApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationResponseBody self = new GetDataServiceApplicationResponseBody();
        return TeaModel.build(map, self);
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

    public GetDataServiceApplicationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApplicationResponseBody setData(GetDataServiceApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApplicationResponseBodyData getData() {
        return this.data;
    }

    public static class GetDataServiceApplicationResponseBodyData extends TeaModel {
        @NameInMap("ApplicationCode")
        public String applicationCode;

        @NameInMap("ApplicationKey")
        public String applicationKey;

        @NameInMap("ApplicationSecret")
        public String applicationSecret;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationId")
        public Long applicationId;

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

        public GetDataServiceApplicationResponseBodyData setApplicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }
        public String getApplicationKey() {
            return this.applicationKey;
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

        public GetDataServiceApplicationResponseBodyData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetDataServiceApplicationResponseBodyData setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

    }

}
