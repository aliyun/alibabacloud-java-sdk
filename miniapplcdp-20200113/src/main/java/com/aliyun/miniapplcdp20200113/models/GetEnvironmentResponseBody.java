// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetEnvironmentResponseBodyData data;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public static class GetEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("CurrentPublishId")
        public String currentPublishId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("PublishingId")
        public String publishingId;

        public static GetEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyData self = new GetEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyData setCurrentPublishId(String currentPublishId) {
            this.currentPublishId = currentPublishId;
            return this;
        }
        public String getCurrentPublishId() {
            return this.currentPublishId;
        }

        public GetEnvironmentResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
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

        public GetEnvironmentResponseBodyData setPublishingId(String publishingId) {
            this.publishingId = publishingId;
            return this;
        }
        public String getPublishingId() {
            return this.publishingId;
        }

    }

}
