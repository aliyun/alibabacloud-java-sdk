// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindSceneRuleFromEdgeInstanceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static UnbindSceneRuleFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSceneRuleFromEdgeInstanceRequest self = new UnbindSceneRuleFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
