// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudIntegrationServiceTokenResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeCloudIntegrationServiceTokenResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudIntegrationServiceTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudIntegrationServiceTokenResponseBody self = new DescribeCloudIntegrationServiceTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudIntegrationServiceTokenResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeCloudIntegrationServiceTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudIntegrationServiceTokenResponseBody setResult(DescribeCloudIntegrationServiceTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeCloudIntegrationServiceTokenResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeCloudIntegrationServiceTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudIntegrationServiceTokenResponseBodyResultHistory extends TeaModel {
        @NameInMap("Service")
        public String service;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        public static DescribeCloudIntegrationServiceTokenResponseBodyResultHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudIntegrationServiceTokenResponseBodyResultHistory self = new DescribeCloudIntegrationServiceTokenResponseBodyResultHistory();
            return TeaModel.build(map, self);
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResultHistory setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResultHistory setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResultHistory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCloudIntegrationServiceTokenResponseBodyResult extends TeaModel {
        @NameInMap("History")
        public java.util.List<DescribeCloudIntegrationServiceTokenResponseBodyResultHistory> history;

        @NameInMap("Service")
        public String service;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        public static DescribeCloudIntegrationServiceTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudIntegrationServiceTokenResponseBodyResult self = new DescribeCloudIntegrationServiceTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResult setHistory(java.util.List<DescribeCloudIntegrationServiceTokenResponseBodyResultHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<DescribeCloudIntegrationServiceTokenResponseBodyResultHistory> getHistory() {
            return this.history;
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResult setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeCloudIntegrationServiceTokenResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
