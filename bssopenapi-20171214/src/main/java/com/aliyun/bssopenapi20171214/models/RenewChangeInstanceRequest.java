// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewChangeInstanceRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>JASIOFKVNVIXXXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-skjdhaskjdh</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Module list</p>
     */
    @NameInMap("Parameter")
    public java.util.List<RenewChangeInstanceRequestParameter> parameter;

    /**
     * <p>The product code. To obtain it, call <strong>QueryProductList</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Product type</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The subscription renewal duration, in months. Valid values:</p>
     * <ul>
     * <li><p>1-9</p>
     * </li>
     * <li><p>12</p>
     * </li>
     * <li><p>24</p>
     * </li>
     * <li><p>36</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The code configuration for the Nth module property. The value of N can be an integer from 1 to 100. If you have multiple module properties, create a separate parameter for each by setting n to 1, 2, 3, and so on.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bandwidth</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value configuration for the nth module property. The value of n ranges from 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
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
