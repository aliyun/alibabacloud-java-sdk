// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListEnvironmentOverviewsResponseBodyData data;

    public static ListEnvironmentOverviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentOverviewsResponseBody self = new ListEnvironmentOverviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentOverviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentOverviewsResponseBody setData(ListEnvironmentOverviewsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentOverviewsResponseBodyData getData() {
        return this.data;
    }

    public static class ListEnvironmentOverviewsResponseBodyDataItems extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("EnvStatus")
        public String envStatus;

        @NameInMap("CurrentPublish")
        public java.util.Map<String, ?> currentPublish;

        @NameInMap("OpsRecord")
        public java.util.Map<String, ?> opsRecord;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Publishing")
        public java.util.Map<String, ?> publishing;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        @NameInMap("EnvType")
        public String envType;

        public static ListEnvironmentOverviewsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentOverviewsResponseBodyDataItems self = new ListEnvironmentOverviewsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setCurrentPublish(java.util.Map<String, ?> currentPublish) {
            this.currentPublish = currentPublish;
            return this;
        }
        public java.util.Map<String, ?> getCurrentPublish() {
            return this.currentPublish;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setOpsRecord(java.util.Map<String, ?> opsRecord) {
            this.opsRecord = opsRecord;
            return this;
        }
        public java.util.Map<String, ?> getOpsRecord() {
            return this.opsRecord;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setPublishing(java.util.Map<String, ?> publishing) {
            this.publishing = publishing;
            return this;
        }
        public java.util.Map<String, ?> getPublishing() {
            return this.publishing;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ListEnvironmentOverviewsResponseBodyDataItems setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
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
