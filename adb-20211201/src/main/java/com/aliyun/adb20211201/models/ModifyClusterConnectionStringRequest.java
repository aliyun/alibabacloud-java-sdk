// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClusterConnectionStringRequest extends TeaModel {
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Port")
    public Integer port;

    public static ModifyClusterConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConnectionStringRequest self = new ModifyClusterConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConnectionStringRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyClusterConnectionStringRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ModifyClusterConnectionStringRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyClusterConnectionStringRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
