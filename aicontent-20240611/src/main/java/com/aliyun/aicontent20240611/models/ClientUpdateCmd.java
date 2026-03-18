// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ClientUpdateCmd extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ClientUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ClientUpdateCmd self = new ClientUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ClientUpdateCmd setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ClientUpdateCmd setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public ClientUpdateCmd setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public ClientUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClientUpdateCmd setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ClientUpdateCmd setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
