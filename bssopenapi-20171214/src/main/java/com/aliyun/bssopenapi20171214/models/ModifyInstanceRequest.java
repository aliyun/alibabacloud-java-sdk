// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    @NameInMap("ModifyType")
    @Validation(required = true)
    public String modifyType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameter")
    public java.util.List<ModifyInstanceRequestParameter> parameter;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
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

    public ModifyInstanceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRequest setParameter(java.util.List<ModifyInstanceRequestParameter> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.List<ModifyInstanceRequestParameter> getParameter() {
        return this.parameter;
    }

    public ModifyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class ModifyInstanceRequestParameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Value")
        @Validation(required = true)
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
