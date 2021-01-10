// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttClientSubscriptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientSubscriptions")
    public ListMqttClientSubscriptionsResponseBodyClientSubscriptions clientSubscriptions;

    public static ListMqttClientSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqttClientSubscriptionsResponseBody self = new ListMqttClientSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqttClientSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqttClientSubscriptionsResponseBody setClientSubscriptions(ListMqttClientSubscriptionsResponseBodyClientSubscriptions clientSubscriptions) {
        this.clientSubscriptions = clientSubscriptions;
        return this;
    }
    public ListMqttClientSubscriptionsResponseBodyClientSubscriptions getClientSubscriptions() {
        return this.clientSubscriptions;
    }

    public static class ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination build(java.util.Map<String, ?> map) throws Exception {
            ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination self = new ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination();
            return TeaModel.build(map, self);
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("QoS")
        public Integer qoS;

        public static ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList build(java.util.Map<String, ?> map) throws Exception {
            ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList self = new ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList();
            return TeaModel.build(map, self);
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList setQoS(Integer qoS) {
            this.qoS = qoS;
            return this;
        }
        public Integer getQoS() {
            return this.qoS;
        }

    }

    public static class ListMqttClientSubscriptionsResponseBodyClientSubscriptions extends TeaModel {
        @NameInMap("Pagination")
        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination pagination;

        @NameInMap("List")
        public java.util.List<ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList> list;

        public static ListMqttClientSubscriptionsResponseBodyClientSubscriptions build(java.util.Map<String, ?> map) throws Exception {
            ListMqttClientSubscriptionsResponseBodyClientSubscriptions self = new ListMqttClientSubscriptionsResponseBodyClientSubscriptions();
            return TeaModel.build(map, self);
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptions setPagination(ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListMqttClientSubscriptionsResponseBodyClientSubscriptionsPagination getPagination() {
            return this.pagination;
        }

        public ListMqttClientSubscriptionsResponseBodyClientSubscriptions setList(java.util.List<ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMqttClientSubscriptionsResponseBodyClientSubscriptionsList> getList() {
            return this.list;
        }

    }

}
