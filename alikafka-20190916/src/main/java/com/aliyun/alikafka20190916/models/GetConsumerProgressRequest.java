// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerProgressRequest extends TeaModel {
    /**
     * <p>The name of the consumer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka-test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>Specifies whether to hide LastTimestamp. Default value: false. Set this parameter to true.</p>
     * <blockquote>
     * <ul>
     * <li>If you set this parameter to true, LastTimestamp in the response is returned as -1. Otherwise, the actual value is returned. This is supported only for topics of the cloud storage type in reserved instances.</li>
     * <li>This operation processes a large amount of data and is resource-intensive. Set this parameter to true to reduce processing time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HideLastTimestamp")
    public Boolean hideLastTimestamp;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetConsumerProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerProgressRequest self = new GetConsumerProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerProgressRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetConsumerProgressRequest setHideLastTimestamp(Boolean hideLastTimestamp) {
        this.hideLastTimestamp = hideLastTimestamp;
        return this;
    }
    public Boolean getHideLastTimestamp() {
        return this.hideLastTimestamp;
    }

    public GetConsumerProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConsumerProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
