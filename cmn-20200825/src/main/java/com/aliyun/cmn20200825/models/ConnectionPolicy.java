// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ConnectionPolicy extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源一级ID
    @NameInMap("ConnectionPolicyId")
    public String connectionPolicyId;

    // 架构迭代uid
    @NameInMap("NetworkArchitectureIterationId")
    public String networkArchitectureIterationId;

    // 连接策略名字
    @NameInMap("Name")
    public String name;

    // 连接策略算法
    @NameInMap("Algorithm")
    public String algorithm;

    // 连接数
    @NameInMap("LinkCount")
    public Long linkCount;

    // 上联模块uid
    @NameInMap("UplinkModelId")
    public String uplinkModelId;

    // 下联模块uid
    @NameInMap("DownlinkModuleId")
    public String downlinkModuleId;

    // 上联设备uid
    @NameInMap("UplinkDeviceId")
    public String uplinkDeviceId;

    // 下联设备uid
    @NameInMap("DownlinkDeviceId")
    public String downlinkDeviceId;

    // 连接策略uid
    @NameInMap("Id")
    public String id;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    public static ConnectionPolicy build(java.util.Map<String, ?> map) throws Exception {
        ConnectionPolicy self = new ConnectionPolicy();
        return TeaModel.build(map, self);
    }

    public ConnectionPolicy setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ConnectionPolicy setConnectionPolicyId(String connectionPolicyId) {
        this.connectionPolicyId = connectionPolicyId;
        return this;
    }
    public String getConnectionPolicyId() {
        return this.connectionPolicyId;
    }

    public ConnectionPolicy setNetworkArchitectureIterationId(String networkArchitectureIterationId) {
        this.networkArchitectureIterationId = networkArchitectureIterationId;
        return this;
    }
    public String getNetworkArchitectureIterationId() {
        return this.networkArchitectureIterationId;
    }

    public ConnectionPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectionPolicy setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public ConnectionPolicy setLinkCount(Long linkCount) {
        this.linkCount = linkCount;
        return this;
    }
    public Long getLinkCount() {
        return this.linkCount;
    }

    public ConnectionPolicy setUplinkModelId(String uplinkModelId) {
        this.uplinkModelId = uplinkModelId;
        return this;
    }
    public String getUplinkModelId() {
        return this.uplinkModelId;
    }

    public ConnectionPolicy setDownlinkModuleId(String downlinkModuleId) {
        this.downlinkModuleId = downlinkModuleId;
        return this;
    }
    public String getDownlinkModuleId() {
        return this.downlinkModuleId;
    }

    public ConnectionPolicy setUplinkDeviceId(String uplinkDeviceId) {
        this.uplinkDeviceId = uplinkDeviceId;
        return this;
    }
    public String getUplinkDeviceId() {
        return this.uplinkDeviceId;
    }

    public ConnectionPolicy setDownlinkDeviceId(String downlinkDeviceId) {
        this.downlinkDeviceId = downlinkDeviceId;
        return this;
    }
    public String getDownlinkDeviceId() {
        return this.downlinkDeviceId;
    }

    public ConnectionPolicy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConnectionPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
