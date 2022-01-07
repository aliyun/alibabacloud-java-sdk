// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceMessageRoutingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourceData")
    public String sourceData;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TargetData")
    public String targetData;

    @NameInMap("TargetIotHubQos")
    public Integer targetIotHubQos;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TopicFilter")
    public String topicFilter;

    public static CreateEdgeInstanceMessageRoutingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceMessageRoutingRequest self = new CreateEdgeInstanceMessageRoutingRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceMessageRoutingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeInstanceMessageRoutingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeInstanceMessageRoutingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeInstanceMessageRoutingRequest setSourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }
    public String getSourceData() {
        return this.sourceData;
    }

    public CreateEdgeInstanceMessageRoutingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateEdgeInstanceMessageRoutingRequest setTargetData(String targetData) {
        this.targetData = targetData;
        return this;
    }
    public String getTargetData() {
        return this.targetData;
    }

    public CreateEdgeInstanceMessageRoutingRequest setTargetIotHubQos(Integer targetIotHubQos) {
        this.targetIotHubQos = targetIotHubQos;
        return this;
    }
    public Integer getTargetIotHubQos() {
        return this.targetIotHubQos;
    }

    public CreateEdgeInstanceMessageRoutingRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateEdgeInstanceMessageRoutingRequest setTopicFilter(String topicFilter) {
        this.topicFilter = topicFilter;
        return this;
    }
    public String getTopicFilter() {
        return this.topicFilter;
    }

}
