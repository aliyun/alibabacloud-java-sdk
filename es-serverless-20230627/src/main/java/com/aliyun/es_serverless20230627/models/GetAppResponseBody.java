// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetAppResponseBodyResult result;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setResult(GetAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppResponseBodyResult extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("appName")
        public String appName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("modifiedTime")
        public String modifiedTime;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public String status;

        @NameInMap("version")
        public String version;

        public static GetAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResult self = new GetAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAppResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetAppResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetAppResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
