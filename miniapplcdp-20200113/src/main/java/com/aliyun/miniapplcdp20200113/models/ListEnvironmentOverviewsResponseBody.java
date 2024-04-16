// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListEnvironmentOverviewsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvironmentOverviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentOverviewsResponseBody self = new ListEnvironmentOverviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentOverviewsResponseBody setData(ListEnvironmentOverviewsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentOverviewsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentOverviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvironmentOverviewsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Config")
        public java.util.Map<String, String> config;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentPublish")
        public java.util.Map<String, String> currentPublish;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvStatus")
        public String envStatus;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("LatestAppAccessTime")
        public String latestAppAccessTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OpsRecord")
        public java.util.Map<String, String> opsRecord;

        @NameInMap("Publishing")
        public java.util.Map<String, String> publishing;

        public static ListEnvironmentOverviewsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentOverviewsResponseBodyDataItems self = new ListEnvironmentOverviewsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setCurrentPublish(java.util.Map<String, String> currentPublish) {
            this.currentPublish = currentPublish;
            return this;
        }
        public java.util.Map<String, String> getCurrentPublish() {
            return this.currentPublish;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setLatestAppAccessTime(String latestAppAccessTime) {
            this.latestAppAccessTime = latestAppAccessTime;
            return this;
        }
        public String getLatestAppAccessTime() {
            return this.latestAppAccessTime;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setOpsRecord(java.util.Map<String, String> opsRecord) {
            this.opsRecord = opsRecord;
            return this;
        }
        public java.util.Map<String, String> getOpsRecord() {
            return this.opsRecord;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setPublishing(java.util.Map<String, String> publishing) {
            this.publishing = publishing;
            return this;
        }
        public java.util.Map<String, String> getPublishing() {
            return this.publishing;
        }

    }

    public static class ListEnvironmentOverviewsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListEnvironmentOverviewsResponseBodyDataItems> items;

        public static ListEnvironmentOverviewsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentOverviewsResponseBodyData self = new ListEnvironmentOverviewsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentOverviewsResponseBodyData setItems(java.util.List<ListEnvironmentOverviewsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListEnvironmentOverviewsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
