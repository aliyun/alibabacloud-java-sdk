// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceMessageRoutingRequest extends TeaModel {
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
     * <p>le_lite1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

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
     * <p>1</p>
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

    public static UpdateEdgeInstanceMessageRoutingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceMessageRoutingRequest self = new UpdateEdgeInstanceMessageRoutingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceMessageRoutingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setSourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }
    public String getSourceData() {
        return this.sourceData;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
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

    public UpdateEdgeInstanceMessageRoutingRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateEdgeInstanceMessageRoutingRequest setTopicFilter(String topicFilter) {
        this.topicFilter = topicFilter;
        return this;
    }
    public String getTopicFilter() {
        return this.topicFilter;
    }

}
