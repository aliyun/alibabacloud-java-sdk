// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateClientRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("contact")
    public String contact;

    /**
     * <strong>example:</strong>
     * <p>我的客户</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>备注</p>
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

    public ModelRouterCreateClientRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterCreateClientRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
