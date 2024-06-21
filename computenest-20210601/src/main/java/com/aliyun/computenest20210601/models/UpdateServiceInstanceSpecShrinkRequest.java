// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public UpdateServiceInstanceSpecShrinkRequestCommodity commodity;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    @NameInMap("OperationName")
    public String operationName;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;InstanceType&quot;: &quot;ecs.g8ise.2xlarge&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("PredefinedParametersName")
    public String predefinedParametersName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecShrinkRequest self = new UpdateServiceInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceInstanceSpecShrinkRequest setCommodity(UpdateServiceInstanceSpecShrinkRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public UpdateServiceInstanceSpecShrinkRequestCommodity getCommodity() {
        return this.commodity;
    }

    public UpdateServiceInstanceSpecShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServiceInstanceSpecShrinkRequest setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public UpdateServiceInstanceSpecShrinkRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public UpdateServiceInstanceSpecShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpdateServiceInstanceSpecShrinkRequest setPredefinedParametersName(String predefinedParametersName) {
        this.predefinedParametersName = predefinedParametersName;
        return this;
    }
    public String getPredefinedParametersName() {
        return this.predefinedParametersName;
    }

    public UpdateServiceInstanceSpecShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class UpdateServiceInstanceSpecShrinkRequestCommodity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        public static UpdateServiceInstanceSpecShrinkRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceInstanceSpecShrinkRequestCommodity self = new UpdateServiceInstanceSpecShrinkRequestCommodity();
            return TeaModel.build(map, self);
        }

        public UpdateServiceInstanceSpecShrinkRequestCommodity setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

    }

}
