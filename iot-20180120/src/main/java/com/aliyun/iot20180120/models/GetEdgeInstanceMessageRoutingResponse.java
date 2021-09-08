// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceMessageRoutingResponse extends TeaModel {
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
    public GetEdgeInstanceMessageRoutingResponseData data;

    public static GetEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceMessageRoutingResponse self = new GetEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceMessageRoutingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeInstanceMessageRoutingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEdgeInstanceMessageRoutingResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceMessageRoutingResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeInstanceMessageRoutingResponse setData(GetEdgeInstanceMessageRoutingResponseData data) {
        this.data = data;
        return this;
    }
    public GetEdgeInstanceMessageRoutingResponseData getData() {
        return this.data;
    }

    public static class GetEdgeInstanceMessageRoutingResponseDataRouteContext extends TeaModel {
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

        public static GetEdgeInstanceMessageRoutingResponseDataRouteContext build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceMessageRoutingResponseDataRouteContext self = new GetEdgeInstanceMessageRoutingResponseDataRouteContext();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setSourceFcServiceName(String sourceFcServiceName) {
            this.sourceFcServiceName = sourceFcServiceName;
            return this;
        }
        public String getSourceFcServiceName() {
            return this.sourceFcServiceName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setSourceFcFunctionName(String sourceFcFunctionName) {
            this.sourceFcFunctionName = sourceFcFunctionName;
            return this;
        }
        public String getSourceFcFunctionName() {
            return this.sourceFcFunctionName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setSourceApplicationName(String sourceApplicationName) {
            this.sourceApplicationName = sourceApplicationName;
            return this;
        }
        public String getSourceApplicationName() {
            return this.sourceApplicationName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setTargetFcServiceName(String targetFcServiceName) {
            this.targetFcServiceName = targetFcServiceName;
            return this;
        }
        public String getTargetFcServiceName() {
            return this.targetFcServiceName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setTargetFcFunctionName(String targetFcFunctionName) {
            this.targetFcFunctionName = targetFcFunctionName;
            return this;
        }
        public String getTargetFcFunctionName() {
            return this.targetFcFunctionName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setTargetApplicationName(String targetApplicationName) {
            this.targetApplicationName = targetApplicationName;
            return this;
        }
        public String getTargetApplicationName() {
            return this.targetApplicationName;
        }

        public GetEdgeInstanceMessageRoutingResponseDataRouteContext setQos(String qos) {
            this.qos = qos;
            return this;
        }
        public String getQos() {
            return this.qos;
        }

    }

    public static class GetEdgeInstanceMessageRoutingResponseData extends TeaModel {
        @NameInMap("TopicFilter")
        @Validation(required = true)
        public String topicFilter;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

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
        public GetEdgeInstanceMessageRoutingResponseDataRouteContext routeContext;

        public static GetEdgeInstanceMessageRoutingResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceMessageRoutingResponseData self = new GetEdgeInstanceMessageRoutingResponseData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceMessageRoutingResponseData setTopicFilter(String topicFilter) {
            this.topicFilter = topicFilter;
            return this;
        }
        public String getTopicFilter() {
            return this.topicFilter;
        }

        public GetEdgeInstanceMessageRoutingResponseData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetEdgeInstanceMessageRoutingResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeInstanceMessageRoutingResponseData setSourceData(String sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public String getSourceData() {
            return this.sourceData;
        }

        public GetEdgeInstanceMessageRoutingResponseData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetEdgeInstanceMessageRoutingResponseData setTargetData(String targetData) {
            this.targetData = targetData;
            return this;
        }
        public String getTargetData() {
            return this.targetData;
        }

        public GetEdgeInstanceMessageRoutingResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceMessageRoutingResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceMessageRoutingResponseData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceMessageRoutingResponseData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceMessageRoutingResponseData setRouteContext(GetEdgeInstanceMessageRoutingResponseDataRouteContext routeContext) {
            this.routeContext = routeContext;
            return this;
        }
        public GetEdgeInstanceMessageRoutingResponseDataRouteContext getRouteContext() {
            return this.routeContext;
        }

    }

}
