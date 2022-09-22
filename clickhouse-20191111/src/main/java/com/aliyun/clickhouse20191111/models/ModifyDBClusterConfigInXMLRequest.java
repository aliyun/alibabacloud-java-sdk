// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBClusterConfigInXMLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigInXMLRequest self = new ModifyDBClusterConfigInXMLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigInXMLRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyDBClusterConfigInXMLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterConfigInXMLRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyDBClusterConfigInXMLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
