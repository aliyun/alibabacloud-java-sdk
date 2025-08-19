// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListAppsResponseBodyResult> result;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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

    public static class ListAppsResponseBodyResultTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListAppsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyResultTags self = new ListAppsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-abc</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>es-severless-test-app</p>
         */
        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public String appType;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-27T07:09:11.000Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>应用备注</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2022-12-27T07:09:11.000Z</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        /**
         * <p>OwnerID账号ID</p>
         * 
         * <strong>example:</strong>
         * <p>*********7595</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>代表region的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>代表资源状态的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListAppsResponseBodyResultTags> tags;

        /**
         * <strong>example:</strong>
         * <p>7.10</p>
         */
        @NameInMap("version")
        public String version;

        public static ListAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyResult self = new ListAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppsResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
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

        public ListAppsResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAppsResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
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

        public ListAppsResponseBodyResult setTags(java.util.List<ListAppsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAppsResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListAppsResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
