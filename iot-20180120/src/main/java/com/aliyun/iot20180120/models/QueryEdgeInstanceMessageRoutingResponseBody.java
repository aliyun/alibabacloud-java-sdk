// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceMessageRoutingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeInstanceMessageRoutingResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceMessageRoutingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceMessageRoutingResponseBody self = new QueryEdgeInstanceMessageRoutingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceMessageRoutingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceMessageRoutingResponseBody setData(QueryEdgeInstanceMessageRoutingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceMessageRoutingResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceMessageRoutingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceMessageRoutingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceMessageRoutingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext extends TeaModel {
        @NameInMap("Qos")
        public String qos;

        @NameInMap("SourceApplicationName")
        public String sourceApplicationName;

        @NameInMap("SourceFcFunctionName")
        public String sourceFcFunctionName;

        @NameInMap("SourceFcServiceName")
        public String sourceFcServiceName;

        @NameInMap("TargetApplicationName")
        public String targetApplicationName;

        @NameInMap("TargetFcFunctionName")
        public String targetFcFunctionName;

        @NameInMap("TargetFcServiceName")
        public String targetFcServiceName;

        public static QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext self = new QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setQos(String qos) {
            this.qos = qos;
            return this;
        }
        public String getQos() {
            return this.qos;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setSourceApplicationName(String sourceApplicationName) {
            this.sourceApplicationName = sourceApplicationName;
            return this;
        }
        public String getSourceApplicationName() {
            return this.sourceApplicationName;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setSourceFcFunctionName(String sourceFcFunctionName) {
            this.sourceFcFunctionName = sourceFcFunctionName;
            return this;
        }
        public String getSourceFcFunctionName() {
            return this.sourceFcFunctionName;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setSourceFcServiceName(String sourceFcServiceName) {
            this.sourceFcServiceName = sourceFcServiceName;
            return this;
        }
        public String getSourceFcServiceName() {
            return this.sourceFcServiceName;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setTargetApplicationName(String targetApplicationName) {
            this.targetApplicationName = targetApplicationName;
            return this;
        }
        public String getTargetApplicationName() {
            return this.targetApplicationName;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setTargetFcFunctionName(String targetFcFunctionName) {
            this.targetFcFunctionName = targetFcFunctionName;
            return this;
        }
        public String getTargetFcFunctionName() {
            return this.targetFcFunctionName;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext setTargetFcServiceName(String targetFcServiceName) {
            this.targetFcServiceName = targetFcServiceName;
            return this;
        }
        public String getTargetFcServiceName() {
            return this.targetFcServiceName;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("RouteContext")
        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext routeContext;

        @NameInMap("RouteId")
        public Integer routeId;

        @NameInMap("SourceData")
        public String sourceData;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("TargetData")
        public String targetData;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TopicFilter")
        public String topicFilter;

        public static QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute self = new QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setRouteContext(QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext routeContext) {
            this.routeContext = routeContext;
            return this;
        }
        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRouteRouteContext getRouteContext() {
            return this.routeContext;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setRouteId(Integer routeId) {
            this.routeId = routeId;
            return this;
        }
        public Integer getRouteId() {
            return this.routeId;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setSourceData(String sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public String getSourceData() {
            return this.sourceData;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setTargetData(String targetData) {
            this.targetData = targetData;
            return this;
        }
        public String getTargetData() {
            return this.targetData;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute setTopicFilter(String topicFilter) {
            this.topicFilter = topicFilter;
            return this;
        }
        public String getTopicFilter() {
            return this.topicFilter;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList extends TeaModel {
        @NameInMap("MessageRoute")
        public java.util.List<QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute> messageRoute;

        public static QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList self = new QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList setMessageRoute(java.util.List<QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute> messageRoute) {
            this.messageRoute = messageRoute;
            return this;
        }
        public java.util.List<QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteListMessageRoute> getMessageRoute() {
            return this.messageRoute;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("MessageRouteList")
        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList messageRouteList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceMessageRoutingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseBodyData self = new QueryEdgeInstanceMessageRoutingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyData setMessageRouteList(QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList messageRouteList) {
            this.messageRouteList = messageRouteList;
            return this;
        }
        public QueryEdgeInstanceMessageRoutingResponseBodyDataMessageRouteList getMessageRouteList() {
            return this.messageRouteList;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceMessageRoutingResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
