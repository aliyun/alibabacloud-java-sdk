// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ConfigureDrdsDbInstancesRequest extends TeaModel {
    @NameInMap("DbInstance")
    public java.util.List<ConfigureDrdsDbInstancesRequestDbInstance> dbInstance;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static ConfigureDrdsDbInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDrdsDbInstancesRequest self = new ConfigureDrdsDbInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureDrdsDbInstancesRequest setDbInstance(java.util.List<ConfigureDrdsDbInstancesRequestDbInstance> dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public java.util.List<ConfigureDrdsDbInstancesRequestDbInstance> getDbInstance() {
        return this.dbInstance;
    }

    public ConfigureDrdsDbInstancesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ConfigureDrdsDbInstancesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static class ConfigureDrdsDbInstancesRequestDbInstance extends TeaModel {
        @NameInMap("MasterDbInstanceId")
        public String masterDbInstanceId;

        @NameInMap("SlaveDbInstanceId")
        public String slaveDbInstanceId;

        @NameInMap("SlaveDbInstanceType")
        public String slaveDbInstanceType;

        public static ConfigureDrdsDbInstancesRequestDbInstance build(java.util.Map<String, ?> map) throws Exception {
            ConfigureDrdsDbInstancesRequestDbInstance self = new ConfigureDrdsDbInstancesRequestDbInstance();
            return TeaModel.build(map, self);
        }

        public ConfigureDrdsDbInstancesRequestDbInstance setMasterDbInstanceId(String masterDbInstanceId) {
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }
        public String getMasterDbInstanceId() {
            return this.masterDbInstanceId;
        }

        public ConfigureDrdsDbInstancesRequestDbInstance setSlaveDbInstanceId(String slaveDbInstanceId) {
            this.slaveDbInstanceId = slaveDbInstanceId;
            return this;
        }
        public String getSlaveDbInstanceId() {
            return this.slaveDbInstanceId;
        }

        public ConfigureDrdsDbInstancesRequestDbInstance setSlaveDbInstanceType(String slaveDbInstanceType) {
            this.slaveDbInstanceType = slaveDbInstanceType;
            return this;
        }
        public String getSlaveDbInstanceType() {
            return this.slaveDbInstanceType;
        }

    }

}
