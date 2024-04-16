// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListEnvironmentsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setData(ListEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvironmentsResponseBodyDataItems extends TeaModel {
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

        public static ListEnvironmentsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataItems self = new ListEnvironmentsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataItems setAccountOpsEndpoint(String accountOpsEndpoint) {
            this.accountOpsEndpoint = accountOpsEndpoint;
            return this;
        }
        public String getAccountOpsEndpoint() {
            return this.accountOpsEndpoint;
        }

        public ListEnvironmentsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEnvironmentsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnvironmentsResponseBodyDataItems setCurrentPublishId(String currentPublishId) {
            this.currentPublishId = currentPublishId;
            return this;
        }
        public String getCurrentPublishId() {
            return this.currentPublishId;
        }

        public ListEnvironmentsResponseBodyDataItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEnvironmentsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListEnvironmentsResponseBodyDataItems setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListEnvironmentsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEnvironmentsResponseBodyDataItems setPublishingId(String publishingId) {
            this.publishingId = publishingId;
            return this;
        }
        public String getPublishingId() {
            return this.publishingId;
        }

    }

    public static class ListEnvironmentsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListEnvironmentsResponseBodyDataItems> items;

        public static ListEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyData self = new ListEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyData setItems(java.util.List<ListEnvironmentsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
