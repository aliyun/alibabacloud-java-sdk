// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client, but you must ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The purchase order information for Alibaba Cloud Marketplace. This parameter is not required if the service is not listed in Alibaba Cloud Marketplace or uses the pay-as-you-go billing method.</p>
     */
    @NameInMap("Commodity")
    public UpdateServiceInstanceSpecShrinkRequestCommodity commodity;

    /**
     * <p>Specifies whether to perform a dry run on the request, including checks on permissions and instance status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: sends the request but does not create a service instance.</p>
     * </li>
     * <li><p>false: sends the request and creates the service instance if the check is passed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable Prometheus monitoring on the user side.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The name of the specification modification operation.</p>
     * <p>You can obtain the name and content of the specification modification operation configured for the service by viewing the <strong>ModifyParametersConfig</strong> property of the <strong>OperationMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Plan configuration change</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The modification parameters of the service instance.</p>
     * <p>You can specify this parameter if the service provider set <strong>Change Type</strong> to <strong>Parameter Change</strong> when adding a specification modification operation.</p>
     * <blockquote>
     * <ul>
     * <li>You can obtain the modification parameters configured for the service by viewing the <strong>ModifyParametersConfig</strong> property of the <strong>OperationMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</li>
     * <li>You can also view the modification parameters configured for the service on the <strong>Service Instance Modification</strong> page in the <a href="https://computenest.console.aliyun.com/service/instance/cn-hangzhou">Compute Nest console</a>.</li>
     * </ul>
     * </blockquote>
     * <p>For example, if the service is configured to upgrade the ECS instance type, you must specify an instance type that is higher than the original instance type of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;InstanceType&quot;: &quot;ecs.g8ise.2xlarge&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The plan name of the service instance.</p>
     * <p>You can specify this parameter if the service provider set <strong>Change Type</strong> to <strong>Plan Change</strong> when adding a specification modification operation.</p>
     * <p>You can obtain the plan name configured for the service by viewing the <strong>PredefinedParameters</strong> property of the <strong>DeployMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("PredefinedParametersName")
    public String predefinedParametersName;

    /**
     * <p>The ID of the service instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances - List service instances</a> operation to obtain the service instance ID.</p>
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
         * <p>Specifies whether to enable automatic payment.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): enables automatic payment. You must ensure that your account balance is sufficient.</p>
         * </li>
         * <li><p><strong>false</strong>: generates an order but does not deduct the fee. If the balance of your payment method is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the <a href="https://rdsnext.console.aliyun.com/dashboard/cn-beijing">ApsaraDB RDS console</a> to pay the order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>The coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>sxs-xxx</p>
         */
        @NameInMap("CouponId")
        public String couponId;

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

        public UpdateServiceInstanceSpecShrinkRequestCommodity setCouponId(String couponId) {
            this.couponId = couponId;
            return this;
        }
        public String getCouponId() {
            return this.couponId;
        }

    }

}
