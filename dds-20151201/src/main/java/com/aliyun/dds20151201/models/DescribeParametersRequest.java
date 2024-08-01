// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParametersRequest extends TeaModel {
    /**
     * <p>The role of the instance. Valid values:</p>
     * <ul>
     * <li>db: a shard node.</li>
     * <li>cs: a Configserver node.</li>
     * <li>mongos: a mongos node.</li>
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
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The parameter that is available in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>terrform</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The ID of the mongos or shard node in the specified sharded cluster instance.</p>
     * <blockquote>
     * <p> This parameter is valid when the <strong>DBInstanceId</strong> parameter is set to the ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bpxxxxxxxx</p>
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

    public static DescribeParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersRequest self = new DescribeParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParametersRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeParametersRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeParametersRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public DescribeParametersRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeParametersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParametersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParametersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParametersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
