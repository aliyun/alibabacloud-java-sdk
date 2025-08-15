// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventServicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDataEventServicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>851038F3-33AB-4C49-97D7-6AB37D35****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataEventServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventServicesResponseBody self = new ListDataEventServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataEventServicesResponseBody setData(ListDataEventServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataEventServicesResponseBodyData getData() {
        return this.data;
    }

    public ListDataEventServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataEventServicesResponseBodyDataServiceInfos extends TeaModel {
        @NameInMap("EventNames")
        public java.util.List<String> eventNames;

        /**
         * <strong>example:</strong>
         * <p>Cms</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static ListDataEventServicesResponseBodyDataServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDataEventServicesResponseBodyDataServiceInfos self = new ListDataEventServicesResponseBodyDataServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListDataEventServicesResponseBodyDataServiceInfos setEventNames(java.util.List<String> eventNames) {
            this.eventNames = eventNames;
            return this;
        }
        public java.util.List<String> getEventNames() {
            return this.eventNames;
        }

        public ListDataEventServicesResponseBodyDataServiceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListDataEventServicesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>VjE6bHJlTGoxdm1M****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("ServiceInfos")
        public java.util.List<ListDataEventServicesResponseBodyDataServiceInfos> serviceInfos;

        public static ListDataEventServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataEventServicesResponseBodyData self = new ListDataEventServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataEventServicesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDataEventServicesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDataEventServicesResponseBodyData setServiceInfos(java.util.List<ListDataEventServicesResponseBodyDataServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListDataEventServicesResponseBodyDataServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

    }

}
