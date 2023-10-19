// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewChangeInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Parameter")
    public java.util.List<RenewChangeInstanceRequestParameter> parameter;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RenewPeriod")
    public Long renewPeriod;

    public static RenewChangeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewChangeInstanceRequest self = new RenewChangeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewChangeInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewChangeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewChangeInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewChangeInstanceRequest setParameter(java.util.List<RenewChangeInstanceRequestParameter> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.List<RenewChangeInstanceRequestParameter> getParameter() {
        return this.parameter;
    }

    public RenewChangeInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RenewChangeInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RenewChangeInstanceRequest setRenewPeriod(Long renewPeriod) {
        this.renewPeriod = renewPeriod;
        return this;
    }
    public Long getRenewPeriod() {
        return this.renewPeriod;
    }

    public static class RenewChangeInstanceRequestParameter extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static RenewChangeInstanceRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            RenewChangeInstanceRequestParameter self = new RenewChangeInstanceRequestParameter();
            return TeaModel.build(map, self);
        }

        public RenewChangeInstanceRequestParameter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RenewChangeInstanceRequestParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
