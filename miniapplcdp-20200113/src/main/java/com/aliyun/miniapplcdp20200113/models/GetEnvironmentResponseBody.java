// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetEnvironmentResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("AccountOpsEndpoint")
        public String accountOpsEndpoint;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentPublishId")
        public String currentPublishId;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishingId")
        public String publishingId;

        public static GetEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyData self = new GetEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyData setAccountOpsEndpoint(String accountOpsEndpoint) {
            this.accountOpsEndpoint = accountOpsEndpoint;
            return this;
        }
        public String getAccountOpsEndpoint() {
            return this.accountOpsEndpoint;
        }

        public GetEnvironmentResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetEnvironmentResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEnvironmentResponseBodyData setCurrentPublishId(String currentPublishId) {
            this.currentPublishId = currentPublishId;
            return this;
        }
        public String getCurrentPublishId() {
            return this.currentPublishId;
        }

        public GetEnvironmentResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetEnvironmentResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetEnvironmentResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetEnvironmentResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEnvironmentResponseBodyData setPublishingId(String publishingId) {
            this.publishingId = publishingId;
            return this;
        }
        public String getPublishingId() {
            return this.publishingId;
        }

    }

}
