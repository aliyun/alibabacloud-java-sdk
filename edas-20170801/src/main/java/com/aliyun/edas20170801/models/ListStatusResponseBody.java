// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListStatusResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatusResponseBody self = new ListStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatusResponseBody setData(java.util.List<ListStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStatusResponseBodyData> getData() {
        return this.data;
    }

    public ListStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStatusResponseBodyData extends TeaModel {
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

        @NameInMap("TenantId")
        public String tenantId;

        public static ListStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStatusResponseBodyData self = new ListStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStatusResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListStatusResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListStatusResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListStatusResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListStatusResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListStatusResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListStatusResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
