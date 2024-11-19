// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceMessageRoutingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nF9oXo7kLRWQ********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>le_lite2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <h1></h1>
     */
    @NameInMap("SourceData")
    public String sourceData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>58c46749ac934db3925fe5********</p>
     */
    @NameInMap("TargetData")
    public String targetData;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TargetIotHubQos")
    public Integer targetIotHubQos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
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
