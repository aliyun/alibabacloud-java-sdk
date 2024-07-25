// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecRequest extends TeaModel {
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
    public UpdateServiceInstanceSpecRequestCommodity commodity;

    /**
     * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>true: performs a dry run for the request, but does not create a service instance.</strong></li>
     * <li><strong>false: performs a dry run for the request, and creates a service instance if the request passes the dry run.</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable Prometheus on the customer side. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The name of the configuration update operation.</p>
     * 
     * <strong>example:</strong>
     * <p>package modify</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The configuration parameters of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;InstanceType&quot;: &quot;ecs.g8ise.2xlarge&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The name of the specification package.</p>
     * 
     * <strong>example:</strong>
     * <p>package One</p>
     */
    @NameInMap("PredefinedParametersName")
    public String predefinedParametersName;

    /**
     * <p>The service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecRequest self = new UpdateServiceInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceInstanceSpecRequest setCommodity(UpdateServiceInstanceSpecRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public UpdateServiceInstanceSpecRequestCommodity getCommodity() {
        return this.commodity;
    }

    public UpdateServiceInstanceSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServiceInstanceSpecRequest setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public UpdateServiceInstanceSpecRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public UpdateServiceInstanceSpecRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpdateServiceInstanceSpecRequest setPredefinedParametersName(String predefinedParametersName) {
        this.predefinedParametersName = predefinedParametersName;
        return this;
    }
    public String getPredefinedParametersName() {
        return this.predefinedParametersName;
    }

    public UpdateServiceInstanceSpecRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static class UpdateServiceInstanceSpecRequestCommodity extends TeaModel {
        /**
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        public static UpdateServiceInstanceSpecRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceInstanceSpecRequestCommodity self = new UpdateServiceInstanceSpecRequestCommodity();
            return TeaModel.build(map, self);
        }

        public UpdateServiceInstanceSpecRequestCommodity setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

    }

}
