// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteSaslUserRequest extends TeaModel {
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
     * <li>SCRAM-SHA-512. This is the default value.</li>
     * <li>SCRAM-SHA-256</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SCRAM-SHA-256</p>
     */
    @NameInMap("Mechanism")
    public String mechanism;

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
     * <p>The type of the Simple Authentication and Security Layer (SASL) user. Valid values:</p>
     * <ul>
     * <li><strong>plain</strong>: a simple mechanism that uses usernames and passwords to verify user identities. ApsaraMQ for Kafka provides an improved PLAIN mechanism that allows you to dynamically add SASL users without the need to restart an instance.</li>
     * <li><strong>SCRAM</strong>: a mechanism that uses usernames and passwords to verify user identities. Compared with the PLAIN mechanism, this mechanism provides better security protection. ApsaraMQ for Kafka uses the SCRAM-SHA-256 algorithm.</li>
     * <li><strong>LDAP</strong>: This value is available only for the SASL users of ApsaraMQ for Confluent instances.</li>
     * </ul>
     * <p>Default value: <strong>plain</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>scram</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the user.</p>
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
