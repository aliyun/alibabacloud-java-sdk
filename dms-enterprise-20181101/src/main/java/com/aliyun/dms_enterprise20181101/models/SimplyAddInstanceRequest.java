// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SimplyAddInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <strong>example:</strong>
     * <p>192.XXX.0.56</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>rm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegion")
    public String instanceRegion;

    /**
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public Integer port;

    public static SimplyAddInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SimplyAddInstanceRequest self = new SimplyAddInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SimplyAddInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public SimplyAddInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public SimplyAddInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public SimplyAddInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SimplyAddInstanceRequest setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    public SimplyAddInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
