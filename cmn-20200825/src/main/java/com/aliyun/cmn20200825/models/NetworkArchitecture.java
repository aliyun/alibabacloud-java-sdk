// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class NetworkArchitecture extends TeaModel {
    @NameInMap("ArchVersionIterationId")
    public String archVersionIterationId;

    @NameInMap("Availabe")
    public Boolean availabe;

    @NameInMap("Children")
    public java.util.List<String> children;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceNumber")
    public Long deviceNumber;

    @NameInMap("GroupNumber")
    public Long groupNumber;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkArchitectureId")
    public String networkArchitectureId;

    @NameInMap("Role")
    public String role;

    @NameInMap("Selected")
    public Boolean selected;

    @NameInMap("Stack")
    public Boolean stack;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Version")
    public String version;

    public static NetworkArchitecture build(java.util.Map<String, ?> map) throws Exception {
        NetworkArchitecture self = new NetworkArchitecture();
        return TeaModel.build(map, self);
    }

    public NetworkArchitecture setArchVersionIterationId(String archVersionIterationId) {
        this.archVersionIterationId = archVersionIterationId;
        return this;
    }
    public String getArchVersionIterationId() {
        return this.archVersionIterationId;
    }

    public NetworkArchitecture setAvailabe(Boolean availabe) {
        this.availabe = availabe;
        return this;
    }
    public Boolean getAvailabe() {
        return this.availabe;
    }

    public NetworkArchitecture setChildren(java.util.List<String> children) {
        this.children = children;
        return this;
    }
    public java.util.List<String> getChildren() {
        return this.children;
    }

    public NetworkArchitecture setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NetworkArchitecture setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NetworkArchitecture setDeviceNumber(Long deviceNumber) {
        this.deviceNumber = deviceNumber;
        return this;
    }
    public Long getDeviceNumber() {
        return this.deviceNumber;
    }

    public NetworkArchitecture setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
        return this;
    }
    public Long getGroupNumber() {
        return this.groupNumber;
    }

    public NetworkArchitecture setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public NetworkArchitecture setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NetworkArchitecture setNetworkArchitectureId(String networkArchitectureId) {
        this.networkArchitectureId = networkArchitectureId;
        return this;
    }
    public String getNetworkArchitectureId() {
        return this.networkArchitectureId;
    }

    public NetworkArchitecture setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public NetworkArchitecture setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }
    public Boolean getSelected() {
        return this.selected;
    }

    public NetworkArchitecture setStack(Boolean stack) {
        this.stack = stack;
        return this;
    }
    public Boolean getStack() {
        return this.stack;
    }

    public NetworkArchitecture setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NetworkArchitecture setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NetworkArchitecture setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
