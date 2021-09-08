// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceMessageRoutingRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RouteId")
    @Validation(required = true)
    public Long routeId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TopicFilter")
    public String topicFilter;

    @NameInMap("SourceType")
    @Validation(required = true)
    public String sourceType;

    @NameInMap("SourceData")
    public String sourceData;

    @NameInMap("TargetType")
    @Validation(required = true)
    public String targetType;

    @NameInMap("TargetData")
    public String targetData;

    @NameInMap("TargetIotHubQos")
    public Integer targetIotHubQos;

    public static UpdateEdgeInstanceMessageRoutingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceMessageRoutingRequest self = new UpdateEdgeInstanceMessageRoutingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceMessageRoutingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setTopicFilter(String topicFilter) {
        this.topicFilter = topicFilter;
        return this;
    }
    public String getTopicFilter() {
        return this.topicFilter;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setSourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }
    public String getSourceData() {
        return this.sourceData;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setTargetData(String targetData) {
        this.targetData = targetData;
        return this;
    }
    public String getTargetData() {
        return this.targetData;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setTargetIotHubQos(Integer targetIotHubQos) {
        this.targetIotHubQos = targetIotHubQos;
        return this;
    }
    public Integer getTargetIotHubQos() {
        return this.targetIotHubQos;
    }

}
