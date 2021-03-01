// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ExecuteStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExecuteStatusResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatusResponseBody self = new ExecuteStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteStatusResponseBody setData(ExecuteStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteStatusResponseBodyData getData() {
        return this.data;
    }

    public ExecuteStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TenantId")
        public String tenantId;

        public static ExecuteStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatusResponseBodyData self = new ExecuteStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecuteStatusResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ExecuteStatusResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ExecuteStatusResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ExecuteStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ExecuteStatusResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ExecuteStatusResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ExecuteStatusResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ExecuteStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecuteStatusResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
