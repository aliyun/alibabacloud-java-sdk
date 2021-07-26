// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ModelToRole extends TeaModel {
    // 资源一级ID
    @NameInMap("ModelToRoleId")
    public String modelToRoleId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 角色型号对应关系uid
    @NameInMap("Id")
    public String id;

    // 架构迭代uid
    @NameInMap("NetworkArchitectureIterationId")
    public String networkArchitectureIterationId;

    // 角色
    @NameInMap("Role")
    public String role;

    // 设备厂商
    @NameInMap("Vendor")
    public String vendor;

    // 设备型号
    @NameInMap("Model")
    public String model;

    public static ModelToRole build(java.util.Map<String, ?> map) throws Exception {
        ModelToRole self = new ModelToRole();
        return TeaModel.build(map, self);
    }

    public ModelToRole setModelToRoleId(String modelToRoleId) {
        this.modelToRoleId = modelToRoleId;
        return this;
    }
    public String getModelToRoleId() {
        return this.modelToRoleId;
    }

    public ModelToRole setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ModelToRole setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ModelToRole setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModelToRole setNetworkArchitectureIterationId(String networkArchitectureIterationId) {
        this.networkArchitectureIterationId = networkArchitectureIterationId;
        return this;
    }
    public String getNetworkArchitectureIterationId() {
        return this.networkArchitectureIterationId;
    }

    public ModelToRole setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ModelToRole setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public ModelToRole setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
