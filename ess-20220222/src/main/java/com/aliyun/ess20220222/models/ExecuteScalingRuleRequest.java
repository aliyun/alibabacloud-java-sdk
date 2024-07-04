// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExecuteScalingRuleRequest extends TeaModel {
    /**
     * <p>The threshold specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("BreachThreshold")
    public Float breachThreshold;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The metric value specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("MetricValue")
    public Float metricValue;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique identifier of the scaling rule.</p>
     * <blockquote>
     * <p> You can call this operation to execute simple scaling rules and step scaling rules. If you want to call this operation to execute a step scaling rule, you must specify <code>BreachThreshold</code> and <code>MetricValue</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ari:acs:ess:cn-hangzhou:140692647406****:scalingrule/asr-bp1dvirgwkoowxk7****</p>
     */
    @NameInMap("ScalingRuleAri")
    public String scalingRuleAri;

    public static ExecuteScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScalingRuleRequest self = new ExecuteScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteScalingRuleRequest setBreachThreshold(Float breachThreshold) {
        this.breachThreshold = breachThreshold;
        return this;
    }
    public Float getBreachThreshold() {
        return this.breachThreshold;
    }

    public ExecuteScalingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteScalingRuleRequest setMetricValue(Float metricValue) {
        this.metricValue = metricValue;
        return this;
    }
    public Float getMetricValue() {
        return this.metricValue;
    }

    public ExecuteScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ExecuteScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecuteScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExecuteScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExecuteScalingRuleRequest setScalingRuleAri(String scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
        return this;
    }
    public String getScalingRuleAri() {
        return this.scalingRuleAri;
    }

}
