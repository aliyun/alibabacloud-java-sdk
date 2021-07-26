// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class NetworkArchitecture extends TeaModel {
    // 资源一级ID
    @NameInMap("NetworkArchitectureId")
    public String networkArchitectureId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 架构内容
    @NameInMap("Role")
    public String role;

    // 组数
    @NameInMap("GroupNumber")
    public Long groupNumber;

    // 设备数
    @NameInMap("DeviceNumber")
    public Long deviceNumber;

    // 可用
    @NameInMap("Availabe")
    public Boolean availabe;

    // 堆叠
    @NameInMap("Stack")
    public Boolean stack;

    // 可选
    @NameInMap("Selected")
    public Boolean selected;

    // 子节点
    @NameInMap("Children")
    public java.util.List<String> children;

    // 架构资源id
    @NameInMap("Id")
    public String id;

    // 架构版本
    @NameInMap("Version")
    public String version;

    // 架构名称
    @NameInMap("Name")
    public String name;

    // 架构描述
    @NameInMap("Description")
    public String description;

    // 架构状态
    @NameInMap("Status")
    public String status;

    // 架构最新版本uuid
    @NameInMap("ArchVersionIterationId")
    public String archVersionIterationId;

    public static NetworkArchitecture build(java.util.Map<String, ?> map) throws Exception {
        NetworkArchitecture self = new NetworkArchitecture();
        return TeaModel.build(map, self);
    }

    public NetworkArchitecture setNetworkArchitectureId(String networkArchitectureId) {
        this.networkArchitectureId = networkArchitectureId;
        return this;
    }
    public String getNetworkArchitectureId() {
        return this.networkArchitectureId;
    }

    public NetworkArchitecture setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NetworkArchitecture setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NetworkArchitecture setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public NetworkArchitecture setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
        return this;
    }
    public Long getGroupNumber() {
        return this.groupNumber;
    }

    public NetworkArchitecture setDeviceNumber(Long deviceNumber) {
        this.deviceNumber = deviceNumber;
        return this;
    }
    public Long getDeviceNumber() {
        return this.deviceNumber;
    }

    public NetworkArchitecture setAvailabe(Boolean availabe) {
        this.availabe = availabe;
        return this;
    }
    public Boolean getAvailabe() {
        return this.availabe;
    }

    public NetworkArchitecture setStack(Boolean stack) {
        this.stack = stack;
        return this;
    }
    public Boolean getStack() {
        return this.stack;
    }

    public NetworkArchitecture setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }
    public Boolean getSelected() {
        return this.selected;
    }

    public NetworkArchitecture setChildren(java.util.List<String> children) {
        this.children = children;
        return this;
    }
    public java.util.List<String> getChildren() {
        return this.children;
    }

    public NetworkArchitecture setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public NetworkArchitecture setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public NetworkArchitecture setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NetworkArchitecture setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NetworkArchitecture setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NetworkArchitecture setArchVersionIterationId(String archVersionIterationId) {
        this.archVersionIterationId = archVersionIterationId;
        return this;
    }
    public String getArchVersionIterationId() {
        return this.archVersionIterationId;
    }

}
