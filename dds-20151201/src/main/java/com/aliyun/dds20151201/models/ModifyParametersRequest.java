// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    /**
     * <p>The role of the instance. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: a shard node.</li>
     * <li><strong>cs</strong>: a Configserver node.</li>
     * <li><strong>mongos</strong>: a mongos node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> If you set this parameter to the ID of a sharded cluster instance, you must also specify the NodeId parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp19f409d75****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the mongos or shard node in the specified sharded cluster instance.</p>
     * <blockquote>
     * <p> This parameter is valid only when DBInstanceId is set to the ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1b7bb3bbe****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The instance parameters that you want to modify and their values. Specify this parameter in a JSON string. Sample format: {&quot;ParameterName1&quot;:&quot;ParameterValue1&quot;,&quot;ParameterName2&quot;:&quot;ParameterValue2&quot;}.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/67618.html">DescribeParameterTemplates</a> operation to query a list of default parameter templates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;operationProfiling.mode&quot;:&quot;all&quot;,&quot;operationProfiling.slowOpThresholdMs&quot;:&quot;200&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SwitchMode")
    public String switchMode;

    public static ModifyParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersRequest self = new ModifyParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParametersRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public ModifyParametersRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyParametersRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyParametersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyParametersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyParametersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyParametersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyParametersRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
