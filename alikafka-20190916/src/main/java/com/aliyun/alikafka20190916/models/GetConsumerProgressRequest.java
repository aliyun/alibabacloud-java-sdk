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

    @NameInMap("HideLastTimestamp")
    public Boolean hideLastTimestamp;

    /**
     * <p>The ID of the instance.</p>
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
