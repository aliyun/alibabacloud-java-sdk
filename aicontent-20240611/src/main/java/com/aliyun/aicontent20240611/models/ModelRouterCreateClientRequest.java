// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateClientRequest extends TeaModel {
    /**
     * <p>The company address.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The allowed model group configuration in JSON string format: {&quot;model_ids&quot;:[101],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}. If both this field and allowedModels are specified, this field takes precedence.</p>
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
     * <p>The discount coefficient. A value of 1.0 indicates no discount, and 0.8 indicates a 20% discount. Default value: 1.0.</p>
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
     * <p>The ID of the parent department. If not specified, a top-level department is created.</p>
     * 
     * <strong>example:</strong>
     * <p>292090</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("remark")
    public String remark;

    public static ModelRouterCreateClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateClientRequest self = new ModelRouterCreateClientRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateClientRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModelRouterCreateClientRequest setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ModelRouterCreateClientRequest setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public ModelRouterCreateClientRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public ModelRouterCreateClientRequest setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }
    public Double getDiscount() {
        return this.discount;
    }

    public ModelRouterCreateClientRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterCreateClientRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ModelRouterCreateClientRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
