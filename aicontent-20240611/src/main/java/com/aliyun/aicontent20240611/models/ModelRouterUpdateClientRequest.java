// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateClientRequest extends TeaModel {
    /**
     * <p>The company address.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The allowed model group configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[101],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <p>The list of allowed model IDs, separated by commas. An empty value indicates all models are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <p>The contact information.</p>
     * 
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("contact")
    public String contact;

    /**
     * <p>The discount coefficient.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("discount")
    public Double discount;

    /**
     * <p>The customer name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCustomer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ModelRouterUpdateClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateClientRequest self = new ModelRouterUpdateClientRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateClientRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModelRouterUpdateClientRequest setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ModelRouterUpdateClientRequest setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public ModelRouterUpdateClientRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public ModelRouterUpdateClientRequest setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }
    public Double getDiscount() {
        return this.discount;
    }

    public ModelRouterUpdateClientRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterUpdateClientRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModelRouterUpdateClientRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
