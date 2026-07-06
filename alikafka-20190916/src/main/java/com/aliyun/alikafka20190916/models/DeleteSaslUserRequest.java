// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteSaslUserRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Encryption method. Valid values:</p>
     * <ul>
     * <li><p>SCRAM-SHA-512 (selected by default)</p>
     * </li>
     * <li><p>SCRAM-SHA-256</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is only supported for Serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SCRAM-SHA-256</p>
     */
    @NameInMap("Mechanism")
    public String mechanism;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Type. Valid values:</p>
     * <ul>
     * <li><p><strong>plain</strong>: A simple username and password verification mechanism. MSMQ optimizes the PLAIN mechanism to support adding SASL users dynamically without restarting the instance.</p>
     * </li>
     * <li><p><strong>scram</strong>: A username and password verification mechanism with higher security than PLAIN. MSMQ uses SCRAM-SHA-256.</p>
     * </li>
     * <li><p><strong>LDAP</strong>: Only applicable for deleting Confluent instance users.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>plain</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>scram</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("Username")
    public String username;

    public static DeleteSaslUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSaslUserRequest self = new DeleteSaslUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSaslUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSaslUserRequest setMechanism(String mechanism) {
        this.mechanism = mechanism;
        return this;
    }
    public String getMechanism() {
        return this.mechanism;
    }

    public DeleteSaslUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSaslUserRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteSaslUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
