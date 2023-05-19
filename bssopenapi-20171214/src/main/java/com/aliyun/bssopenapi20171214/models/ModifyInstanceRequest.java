// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance for which you want to modify the configurations.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of configuration modifications. Valid values:</p>
     * <br>
     * <p>*   Upgrade: upgrades the configurations of the instance.</p>
     * <p>*   Downgrade: downgrades the configurations of the instance.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The details about the parameters.</p>
     */
    @NameInMap("Parameter")
    public java.util.List<ModifyInstanceRequestParameter> parameter;

    /**
     * <p>The code of the service to which the instance belongs.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service to which the instance belongs.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: subscription</p>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceRequest setParameter(java.util.List<ModifyInstanceRequestParameter> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.List<ModifyInstanceRequestParameter> getParameter() {
        return this.parameter;
    }

    public ModifyInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifyInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyInstanceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class ModifyInstanceRequestParameter extends TeaModel {
        /**
         * <p>The code of the parameter n. Valid values of n: 1 to 100. Multiple parameters are concatenated in the order of n.</p>
         * <br>
         * <p>>  Only the parameters of the attributes that you want to modify for the instance must be configured. For example, if the instance has Attribute A and Attribute B and only Attribute A must be modified, configure only the parameter of Attribute A.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value of the parameter n. Valid values of n: 1 to 100.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceRequestParameter self = new ModifyInstanceRequestParameter();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceRequestParameter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyInstanceRequestParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
