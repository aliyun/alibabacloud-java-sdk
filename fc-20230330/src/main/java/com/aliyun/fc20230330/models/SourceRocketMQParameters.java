// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceRocketMQParameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <strong>example:</strong>
     * <p>Tag</p>
     */
    @NameInMap("FilterType")
    public String filterType;

    /**
     * <strong>example:</strong>
     * <p>GID_group1</p>
     */
    @NameInMap("GroupID")
    public String groupID;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("InstanceEndpoint")
    public String instanceEndpoint;

    /**
     * <strong>example:</strong>
     * <p>MQ_INST_164901546557****_BAAN****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("InstanceNetwork")
    public String instanceNetwork;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("InstancePassword")
    public String instancePassword;

    /**
     * <strong>example:</strong>
     * <p>sg-hp35r2hc3a3sv8q2****</p>
     */
    @NameInMap("InstanceSecurityGroupId")
    public String instanceSecurityGroupId;

    /**
     * <strong>example:</strong>
     * <p>Cloud_5</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>6W0xz2uPfiwp****</p>
     */
    @NameInMap("InstanceUsername")
    public String instanceUsername;

    /**
     * <strong>example:</strong>
     * <p>vsw-uf6gwtbn6etadpvz7****</p>
     */
    @NameInMap("InstanceVSwitchIds")
    public String instanceVSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-uf6of9452b2pba82c****</p>
     */
    @NameInMap("InstanceVpcId")
    public String instanceVpcId;

    /**
     * <strong>example:</strong>
     * <p>CONSUME_FROM_TIMESTAMP</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <strong>example:</strong>
     * <p>1636597951964</p>
     */
    @NameInMap("Timestamp")
    public Integer timestamp;

    /**
     * <strong>example:</strong>
     * <p>myTopic</p>
     */
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

    public SourceRocketMQParameters setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
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
