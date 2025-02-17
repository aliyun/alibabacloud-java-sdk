// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the order placed in Alibaba Cloud Marketplace. You do not need to specify this parameter if the service is not published in Alibaba Cloud Marketplace or uses the pay-as-you-go billing method.</p>
     */
    @NameInMap("Commodity")
    public UpdateServiceInstanceSpecShrinkRequestCommodity commodity;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. A dry run includes checks on the permissions and instance state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run but does not create a service instance.</li>
     * <li>false: performs a dry run and creates a service instance if the request passes the dry run.</li>
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
     * <p>true</p>
     * <p>false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The name of the configuration change operation.</p>
     * <p>To obtain the names and content of the configuration change operations of the service, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>ModifyParametersConfig</strong> in the value of <strong>OperationMetadata</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>package modify</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The configuration parameter.</p>
     * <p>This parameter is available if the service provider set <strong>Method</strong> to <strong>Change Parameter</strong> when configuring configuration change operations.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To obtain the parameters of the service that support configuration change, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>ModifyParametersConfig</strong> in the value of <strong>OperationMetadata</strong>.</p>
     * </li>
     * <li><p>You can also view the parameters of the service that support configuration change in the <strong>configuration change</strong> dialog box in the <a href="https://computenest.console.aliyun.com/service/instance/cn-hangzhou">Compute Nest console</a>.</p>
     * </li>
     * </ul>
     * <p>For example, if the service supports Elastic Compute Service (ECS) instance type upgrade, you must specify an instance type that has higher specifications than the current one.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;InstanceType&quot;: &quot;ecs.g8ise.2xlarge&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The name of the configuration plan.</p>
     * <p>This parameter is available if the service provider set <strong>Method</strong> to <strong>Change Plan</strong> when configuring configuration change operations.</p>
     * <p>To obtain the configuration plan names of the service, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>PredefinedParameters</strong> in the value of <strong>DeployMetadata</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>package One</p>
     */
    @NameInMap("PredefinedParametersName")
    public String predefinedParametersName;

    /**
     * <p>The ID of the service instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances</a> operation to obtain the ID of the service instance.</p>
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
         * <li><strong>true (default)</strong>: automatically completes the payment. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated. If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.<a href="https://rdsnext.console.aliyun.com/dashboard/cn-beijing"></a></li>
         * </ul>
         * 
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
