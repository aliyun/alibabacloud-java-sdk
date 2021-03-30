// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttRootTopicsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootTopics")
    public ListMqttRootTopicsResponseBodyRootTopics rootTopics;

    public static ListMqttRootTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqttRootTopicsResponseBody self = new ListMqttRootTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqttRootTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqttRootTopicsResponseBody setRootTopics(ListMqttRootTopicsResponseBodyRootTopics rootTopics) {
        this.rootTopics = rootTopics;
        return this;
    }
    public ListMqttRootTopicsResponseBodyRootTopics getRootTopics() {
        return this.rootTopics;
    }

    public static class ListMqttRootTopicsResponseBodyRootTopicsPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMqttRootTopicsResponseBodyRootTopicsPagination build(java.util.Map<String, ?> map) throws Exception {
            ListMqttRootTopicsResponseBodyRootTopicsPagination self = new ListMqttRootTopicsResponseBodyRootTopicsPagination();
            return TeaModel.build(map, self);
        }

        public ListMqttRootTopicsResponseBodyRootTopicsPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListMqttRootTopicsResponseBodyRootTopicsList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("CreateTime")
        public Integer createTime;

        @NameInMap("RootTopic")
        public String rootTopic;

        public static ListMqttRootTopicsResponseBodyRootTopicsList build(java.util.Map<String, ?> map) throws Exception {
            ListMqttRootTopicsResponseBodyRootTopicsList self = new ListMqttRootTopicsResponseBodyRootTopicsList();
            return TeaModel.build(map, self);
        }

        public ListMqttRootTopicsResponseBodyRootTopicsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsList setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public ListMqttRootTopicsResponseBodyRootTopicsList setRootTopic(String rootTopic) {
            this.rootTopic = rootTopic;
            return this;
        }
        public String getRootTopic() {
            return this.rootTopic;
        }

    }

    public static class ListMqttRootTopicsResponseBodyRootTopics extends TeaModel {
        @NameInMap("Pagination")
        public ListMqttRootTopicsResponseBodyRootTopicsPagination pagination;

        @NameInMap("List")
        public java.util.List<ListMqttRootTopicsResponseBodyRootTopicsList> list;

        public static ListMqttRootTopicsResponseBodyRootTopics build(java.util.Map<String, ?> map) throws Exception {
            ListMqttRootTopicsResponseBodyRootTopics self = new ListMqttRootTopicsResponseBodyRootTopics();
            return TeaModel.build(map, self);
        }

        public ListMqttRootTopicsResponseBodyRootTopics setPagination(ListMqttRootTopicsResponseBodyRootTopicsPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListMqttRootTopicsResponseBodyRootTopicsPagination getPagination() {
            return this.pagination;
        }

        public ListMqttRootTopicsResponseBodyRootTopics setList(java.util.List<ListMqttRootTopicsResponseBodyRootTopicsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMqttRootTopicsResponseBodyRootTopicsList> getList() {
            return this.list;
        }

    }

}
