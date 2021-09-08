// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEdgeInstanceMessageRoutingResponseData data;

    public static QueryEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceMessageRoutingResponse self = new QueryEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceMessageRoutingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceMessageRoutingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceMessageRoutingResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceMessageRoutingResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceMessageRoutingResponse setData(QueryEdgeInstanceMessageRoutingResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceMessageRoutingResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext extends TeaModel {
        @NameInMap("SourceFcServiceName")
        @Validation(required = true)
        public String sourceFcServiceName;

        @NameInMap("SourceFcFunctionName")
        @Validation(required = true)
        public String sourceFcFunctionName;

        @NameInMap("SourceApplicationName")
        @Validation(required = true)
        public String sourceApplicationName;

        @NameInMap("TargetFcServiceName")
        @Validation(required = true)
        public String targetFcServiceName;

        @NameInMap("TargetFcFunctionName")
        @Validation(required = true)
        public String targetFcFunctionName;

        @NameInMap("TargetApplicationName")
        @Validation(required = true)
        public String targetApplicationName;

        @NameInMap("Qos")
        @Validation(required = true)
        public String qos;

        public static QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext self = new QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setSourceFcServiceName(String sourceFcServiceName) {
            this.sourceFcServiceName = sourceFcServiceName;
            return this;
        }
        public String getSourceFcServiceName() {
            return this.sourceFcServiceName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setSourceFcFunctionName(String sourceFcFunctionName) {
            this.sourceFcFunctionName = sourceFcFunctionName;
            return this;
        }
        public String getSourceFcFunctionName() {
            return this.sourceFcFunctionName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setSourceApplicationName(String sourceApplicationName) {
            this.sourceApplicationName = sourceApplicationName;
            return this;
        }
        public String getSourceApplicationName() {
            return this.sourceApplicationName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setTargetFcServiceName(String targetFcServiceName) {
            this.targetFcServiceName = targetFcServiceName;
            return this;
        }
        public String getTargetFcServiceName() {
            return this.targetFcServiceName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setTargetFcFunctionName(String targetFcFunctionName) {
            this.targetFcFunctionName = targetFcFunctionName;
            return this;
        }
        public String getTargetFcFunctionName() {
            return this.targetFcFunctionName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setTargetApplicationName(String targetApplicationName) {
            this.targetApplicationName = targetApplicationName;
            return this;
        }
        public String getTargetApplicationName() {
            return this.targetApplicationName;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext setQos(String qos) {
            this.qos = qos;
            return this;
        }
        public String getQos() {
            return this.qos;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute extends TeaModel {
        @NameInMap("RouteId")
        @Validation(required = true)
        public Integer routeId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TopicFilter")
        @Validation(required = true)
        public String topicFilter;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("SourceData")
        @Validation(required = true)
        public String sourceData;

        @NameInMap("TargetType")
        @Validation(required = true)
        public String targetType;

        @NameInMap("TargetData")
        @Validation(required = true)
        public String targetData;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        @NameInMap("RouteContext")
        @Validation(required = true)
        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext routeContext;

        public static QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute self = new QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setRouteId(Integer routeId) {
            this.routeId = routeId;
            return this;
        }
        public Integer getRouteId() {
            return this.routeId;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setTopicFilter(String topicFilter) {
            this.topicFilter = topicFilter;
            return this;
        }
        public String getTopicFilter() {
            return this.topicFilter;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setSourceData(String sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public String getSourceData() {
            return this.sourceData;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setTargetData(String targetData) {
            this.targetData = targetData;
            return this;
        }
        public String getTargetData() {
            return this.targetData;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute setRouteContext(QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext routeContext) {
            this.routeContext = routeContext;
            return this;
        }
        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRouteRouteContext getRouteContext() {
            return this.routeContext;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList extends TeaModel {
        @NameInMap("MessageRoute")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute> messageRoute;

        public static QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList self = new QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList setMessageRoute(java.util.List<QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute> messageRoute) {
            this.messageRoute = messageRoute;
            return this;
        }
        public java.util.List<QueryEdgeInstanceMessageRoutingResponseDataMessageRouteListMessageRoute> getMessageRoute() {
            return this.messageRoute;
        }

    }

    public static class QueryEdgeInstanceMessageRoutingResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("MessageRouteList")
        @Validation(required = true)
        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList messageRouteList;

        public static QueryEdgeInstanceMessageRoutingResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceMessageRoutingResponseData self = new QueryEdgeInstanceMessageRoutingResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceMessageRoutingResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceMessageRoutingResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceMessageRoutingResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceMessageRoutingResponseData setMessageRouteList(QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList messageRouteList) {
            this.messageRouteList = messageRouteList;
            return this;
        }
        public QueryEdgeInstanceMessageRoutingResponseDataMessageRouteList getMessageRouteList() {
            return this.messageRouteList;
        }

    }

}
