// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteSaslUserRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The encryption method. Valid values:</p>
     * <br>
     * <p>*   SCRAM-SHA-512. This is the default value.</p>
     * <p>*   SCRAM-SHA-256</p>
     * <br>
     * <p>>  This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("Mechanism")
    public String mechanism;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SASL mechanism. Valid values:</p>
     * <br>
     * <p>*   **plain**: a simple mechanism that uses usernames and passwords to verify user identities. Message Queue for Apache Kafka provides an optimized PLAIN mechanism that allows you to dynamically create SASL users for an instance without the need to restart the instance.</p>
     * <p>*   **scram**: a mechanism that uses usernames and passwords to verify user identities. This mechanism provides better security protection than the PLAIN mechanism. Message Queue for Apache Kafka uses SCRAM-SHA-256.</p>
     * <br>
     * <p>Default value: **plain**.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the user.</p>
     * <br>
     * <p>This parameter is required.</p>
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
