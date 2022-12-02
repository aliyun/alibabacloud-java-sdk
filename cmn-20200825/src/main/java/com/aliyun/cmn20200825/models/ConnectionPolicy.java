// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ConnectionPolicy extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("ConnectionPolicyId")
    public String connectionPolicyId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DownlinkDeviceId")
    public String downlinkDeviceId;

    @NameInMap("DownlinkModuleId")
    public String downlinkModuleId;

    @NameInMap("Id")
    public String id;

    @NameInMap("LinkCount")
    public Long linkCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkArchitectureIterationId")
    public String networkArchitectureIterationId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UplinkDeviceId")
    public String uplinkDeviceId;

    @NameInMap("UplinkModelId")
    public String uplinkModelId;

    public static ConnectionPolicy build(java.util.Map<String, ?> map) throws Exception {
        ConnectionPolicy self = new ConnectionPolicy();
        return TeaModel.build(map, self);
    }

    public ConnectionPolicy setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public ConnectionPolicy setConnectionPolicyId(String connectionPolicyId) {
        this.connectionPolicyId = connectionPolicyId;
        return this;
    }
    public String getConnectionPolicyId() {
        return this.connectionPolicyId;
    }

    public ConnectionPolicy setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ConnectionPolicy setDownlinkDeviceId(String downlinkDeviceId) {
        this.downlinkDeviceId = downlinkDeviceId;
        return this;
    }
    public String getDownlinkDeviceId() {
        return this.downlinkDeviceId;
    }

    public ConnectionPolicy setDownlinkModuleId(String downlinkModuleId) {
        this.downlinkModuleId = downlinkModuleId;
        return this;
    }
    public String getDownlinkModuleId() {
        return this.downlinkModuleId;
    }

    public ConnectionPolicy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConnectionPolicy setLinkCount(Long linkCount) {
        this.linkCount = linkCount;
        return this;
    }
    public Long getLinkCount() {
        return this.linkCount;
    }

    public ConnectionPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectionPolicy setNetworkArchitectureIterationId(String networkArchitectureIterationId) {
        this.networkArchitectureIterationId = networkArchitectureIterationId;
        return this;
    }
    public String getNetworkArchitectureIterationId() {
        return this.networkArchitectureIterationId;
    }

    public ConnectionPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ConnectionPolicy setUplinkDeviceId(String uplinkDeviceId) {
        this.uplinkDeviceId = uplinkDeviceId;
        return this;
    }
    public String getUplinkDeviceId() {
        return this.uplinkDeviceId;
    }

    public ConnectionPolicy setUplinkModelId(String uplinkModelId) {
        this.uplinkModelId = uplinkModelId;
        return this;
    }
    public String getUplinkModelId() {
        return this.uplinkModelId;
    }

}
