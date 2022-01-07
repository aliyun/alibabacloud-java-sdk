// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceMessageRoutingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEdgeInstanceMessageRoutingResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEdgeInstanceMessageRoutingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceMessageRoutingResponseBody self = new GetEdgeInstanceMessageRoutingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceMessageRoutingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceMessageRoutingResponseBody setData(GetEdgeInstanceMessageRoutingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeInstanceMessageRoutingResponseBodyData getData() {
        return this.data;
    }

    public GetEdgeInstanceMessageRoutingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeInstanceMessageRoutingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeInstanceMessageRoutingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext extends TeaModel {
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

        public static GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext self = new GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setQos(String qos) {
            this.qos = qos;
            return this;
        }
        public String getQos() {
            return this.qos;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setSourceApplicationName(String sourceApplicationName) {
            this.sourceApplicationName = sourceApplicationName;
            return this;
        }
        public String getSourceApplicationName() {
            return this.sourceApplicationName;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setSourceFcFunctionName(String sourceFcFunctionName) {
            this.sourceFcFunctionName = sourceFcFunctionName;
            return this;
        }
        public String getSourceFcFunctionName() {
            return this.sourceFcFunctionName;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setSourceFcServiceName(String sourceFcServiceName) {
            this.sourceFcServiceName = sourceFcServiceName;
            return this;
        }
        public String getSourceFcServiceName() {
            return this.sourceFcServiceName;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setTargetApplicationName(String targetApplicationName) {
            this.targetApplicationName = targetApplicationName;
            return this;
        }
        public String getTargetApplicationName() {
            return this.targetApplicationName;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setTargetFcFunctionName(String targetFcFunctionName) {
            this.targetFcFunctionName = targetFcFunctionName;
            return this;
        }
        public String getTargetFcFunctionName() {
            return this.targetFcFunctionName;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext setTargetFcServiceName(String targetFcServiceName) {
            this.targetFcServiceName = targetFcServiceName;
            return this;
        }
        public String getTargetFcServiceName() {
            return this.targetFcServiceName;
        }

    }

    public static class GetEdgeInstanceMessageRoutingResponseBodyData extends TeaModel {
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
        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext routeContext;

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

        public static GetEdgeInstanceMessageRoutingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceMessageRoutingResponseBodyData self = new GetEdgeInstanceMessageRoutingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setRouteContext(GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext routeContext) {
            this.routeContext = routeContext;
            return this;
        }
        public GetEdgeInstanceMessageRoutingResponseBodyDataRouteContext getRouteContext() {
            return this.routeContext;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setSourceData(String sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public String getSourceData() {
            return this.sourceData;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setTargetData(String targetData) {
            this.targetData = targetData;
            return this;
        }
        public String getTargetData() {
            return this.targetData;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetEdgeInstanceMessageRoutingResponseBodyData setTopicFilter(String topicFilter) {
            this.topicFilter = topicFilter;
            return this;
        }
        public String getTopicFilter() {
            return this.topicFilter;
        }

    }

}
