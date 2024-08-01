// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryRequest extends TeaModel {
    /**
     * <p>The role of the instance. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: shard</li>
     * <li><strong>cs</strong>: Configserver</li>
     * <li><strong>mongos</strong>: mongos</li>
     * <li><strong>logic</strong>: sharded cluster instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mongos</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> If you set this parameter to the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2235****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC. The end time must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-02T12:10:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the mongos node or shard node whose parameter modification records you want to query in the instance.</p>
     * <blockquote>
     * <p> This parameter is valid only when <strong>DBInstanceId</strong> is set to the ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1158****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T12:10:10Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeParameterModificationHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryRequest self = new DescribeParameterModificationHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeParameterModificationHistoryRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeParameterModificationHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeParameterModificationHistoryRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeParameterModificationHistoryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParameterModificationHistoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParameterModificationHistoryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParameterModificationHistoryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeParameterModificationHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
