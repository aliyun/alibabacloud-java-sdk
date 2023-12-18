// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class SourceRocketMQParameters extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("FilterSql")
    public String filterSql;

    @NameInMap("FilterType")
    public String filterType;

    @NameInMap("GroupID")
    public String groupID;

    @NameInMap("InstanceEndpoint")
    public String instanceEndpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceNetwork")
    public String instanceNetwork;

    @NameInMap("InstancePassword")
    public String instancePassword;

    @NameInMap("InstanceSecurityGroupId")
    public String instanceSecurityGroupId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceUsername")
    public String instanceUsername;

    @NameInMap("InstanceVSwitchIds")
    public String instanceVSwitchIds;

    @NameInMap("InstanceVpcId")
    public String instanceVpcId;

    @NameInMap("Offset")
    public String offset;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("Topic")
    public String topic;

    public static SourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceRocketMQParameters self = new SourceRocketMQParameters();
        return TeaModel.build(map, self);
    }

    public SourceRocketMQParameters setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SourceRocketMQParameters setFilterSql(String filterSql) {
        this.filterSql = filterSql;
        return this;
    }
    public String getFilterSql() {
        return this.filterSql;
    }

    public SourceRocketMQParameters setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public SourceRocketMQParameters setGroupID(String groupID) {
        this.groupID = groupID;
        return this;
    }
    public String getGroupID() {
        return this.groupID;
    }

    public SourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
        this.instanceEndpoint = instanceEndpoint;
        return this;
    }
    public String getInstanceEndpoint() {
        return this.instanceEndpoint;
    }

    public SourceRocketMQParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
        this.instanceNetwork = instanceNetwork;
        return this;
    }
    public String getInstanceNetwork() {
        return this.instanceNetwork;
    }

    public SourceRocketMQParameters setInstancePassword(String instancePassword) {
        this.instancePassword = instancePassword;
        return this;
    }
    public String getInstancePassword() {
        return this.instancePassword;
    }

    public SourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
        this.instanceSecurityGroupId = instanceSecurityGroupId;
        return this;
    }
    public String getInstanceSecurityGroupId() {
        return this.instanceSecurityGroupId;
    }

    public SourceRocketMQParameters setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SourceRocketMQParameters setInstanceUsername(String instanceUsername) {
        this.instanceUsername = instanceUsername;
        return this;
    }
    public String getInstanceUsername() {
        return this.instanceUsername;
    }

    public SourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
        this.instanceVSwitchIds = instanceVSwitchIds;
        return this;
    }
    public String getInstanceVSwitchIds() {
        return this.instanceVSwitchIds;
    }

    public SourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
        this.instanceVpcId = instanceVpcId;
        return this;
    }
    public String getInstanceVpcId() {
        return this.instanceVpcId;
    }

    public SourceRocketMQParameters setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public SourceRocketMQParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceRocketMQParameters setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SourceRocketMQParameters setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public SourceRocketMQParameters setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
