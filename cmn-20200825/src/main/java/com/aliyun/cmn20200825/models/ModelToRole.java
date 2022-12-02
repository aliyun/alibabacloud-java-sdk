// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ModelToRole extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("Model")
    public String model;

    @NameInMap("ModelToRoleId")
    public String modelToRoleId;

    @NameInMap("NetworkArchitectureIterationId")
    public String networkArchitectureIterationId;

    @NameInMap("Role")
    public String role;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Vendor")
    public String vendor;

    public static ModelToRole build(java.util.Map<String, ?> map) throws Exception {
        ModelToRole self = new ModelToRole();
        return TeaModel.build(map, self);
    }

    public ModelToRole setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ModelToRole setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModelToRole setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModelToRole setModelToRoleId(String modelToRoleId) {
        this.modelToRoleId = modelToRoleId;
        return this;
    }
    public String getModelToRoleId() {
        return this.modelToRoleId;
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

    public ModelToRole setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ModelToRole setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
