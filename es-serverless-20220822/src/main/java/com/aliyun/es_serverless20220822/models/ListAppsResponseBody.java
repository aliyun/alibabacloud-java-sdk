// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListAppsResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setResult(java.util.List<ListAppsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAppsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppsResponseBodyResult extends TeaModel {
        // 代表资源名称的资源属性字段
        @NameInMap("appName")
        public String appName;

        // 代表创建时间的资源属性字段
        @NameInMap("createTime")
        public String createTime;

        // 应用备注
        @NameInMap("description")
        public String description;

        // 流量限流额
        @NameInMap("flowQuota")
        public String flowQuota;

        // OwnerID账号ID
        @NameInMap("ownerId")
        public String ownerId;

        // 代表region的资源属性字段
        @NameInMap("regionId")
        public String regionId;

        // 代表资源状态的资源属性字段
        @NameInMap("status")
        public String status;

        // 存储限流额
        @NameInMap("storageQuota")
        public String storageQuota;

        public static ListAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyResult self = new ListAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppsResponseBodyResult setFlowQuota(String flowQuota) {
            this.flowQuota = flowQuota;
            return this;
        }
        public String getFlowQuota() {
            return this.flowQuota;
        }

        public ListAppsResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListAppsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAppsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppsResponseBodyResult setStorageQuota(String storageQuota) {
            this.storageQuota = storageQuota;
            return this;
        }
        public String getStorageQuota() {
            return this.storageQuota;
        }

    }

}
