// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateSaslUserRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p>SCRAM-SHA-512 (default)</p>
     * </li>
     * <li><p>SCRAM-SHA-256</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for Serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SCRAM-SHA-256</p>
     */
    @NameInMap("Mechanism")
    public String mechanism;

    /**
     * <p>The password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12***</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SASL mechanism. Valid values:</p>
     * <ul>
     * <li><p>plain: a simple username and password authentication mechanism. Message Queue for Apache Kafka optimizes the PLAIN mechanism to support the dynamic creation of SASL users without the need to restart the instance.</p>
     * </li>
     * <li><p>scram: a username and password authentication mechanism that provides higher security than the PLAIN mechanism. Message Queue for Apache Kafka uses Salted Challenge Response Authentication Mechanism (SCRAM)-SHA-256.</p>
     * </li>
     * <li><p>LDAP: This value is applicable only when you create users for Confluent instances.</p>
     * </li>
     * </ul>
     * <p>Default value: plain.</p>
     * 
     * <strong>example:</strong>
     * <p>plain</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateSaslUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSaslUserRequest self = new CreateSaslUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateSaslUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSaslUserRequest setMechanism(String mechanism) {
        this.mechanism = mechanism;
        return this;
    }
    public String getMechanism() {
        return this.mechanism;
    }

    public CreateSaslUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateSaslUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSaslUserRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSaslUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
