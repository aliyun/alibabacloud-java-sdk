// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUserDefinedEventSourcesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUserDefinedEventSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefinedEventSourcesResponseBody self = new ListUserDefinedEventSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDefinedEventSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserDefinedEventSourcesResponseBody setData(ListUserDefinedEventSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserDefinedEventSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListUserDefinedEventSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserDefinedEventSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDefinedEventSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        @NameInMap("Method")
        public java.util.List<String> method;

        @NameInMap("Referer")
        public java.util.List<String> referer;

        @NameInMap("SecurityConfig")
        public String securityConfig;

        @NameInMap("Type")
        public String type;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setSecurityConfig(String securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public String getSecurityConfig() {
            return this.securityConfig;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Offset")
        public String offset;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Timestamp")
        public Float timestamp;

        @NameInMap("Topic")
        public String topic;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTimestamp(Float timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Float getTimestamp() {
            return this.timestamp;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters extends TeaModel {
        @NameInMap("ConsumePosition")
        public String consumePosition;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        @NameInMap("RoleName")
        public String roleName;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceList extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Ctime")
        public Float ctime;

        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("ExternalSourceType")
        public String externalSourceType;

        @NameInMap("Name")
        public String name;

        @NameInMap("SourceHttpEventParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters sourceHttpEventParameters;

        @NameInMap("SourceMNSParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters sourceMNSParameters;

        @NameInMap("SourceRabbitMQParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters sourceRabbitMQParameters;

        @NameInMap("SourceRocketMQParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>SourceSLSParameters</p>
         */
        @NameInMap("SourceSLSParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters sourceSLSParameters;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceList self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceList();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setCtime(Float ctime) {
            this.ctime = ctime;
            return this;
        }
        public Float getCtime() {
            return this.ctime;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setExternalSourceType(String externalSourceType) {
            this.externalSourceType = externalSourceType;
            return this;
        }
        public String getExternalSourceType() {
            return this.externalSourceType;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceHttpEventParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters sourceHttpEventParameters) {
            this.sourceHttpEventParameters = sourceHttpEventParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters getSourceHttpEventParameters() {
            return this.sourceHttpEventParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceMNSParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceRabbitMQParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceRocketMQParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceSLSParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyData extends TeaModel {
        @NameInMap("EventSourceList")
        public java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> eventSourceList;

        public static ListUserDefinedEventSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyData self = new ListUserDefinedEventSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyData setEventSourceList(java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> eventSourceList) {
            this.eventSourceList = eventSourceList;
            return this;
        }
        public java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

    }

}
