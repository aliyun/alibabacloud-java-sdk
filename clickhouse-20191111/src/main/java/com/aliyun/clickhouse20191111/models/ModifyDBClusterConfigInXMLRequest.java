// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLRequest extends TeaModel {
    /**
     * <p>The configuration parameters whose settings you want to modify. You can call the [DescribeDBClusterConfigInXML](~~452210~~) operation to query configuration parameters, and modify the settings of the returned configuration parameters.</p>
     * <br>
     * <p>>  You must specify all configuration parameters even when you want to modify the setting of a single parameter. If a configuration parameter is not specified, the original value of this parameter is retained or the modification fails.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID. You can call the [DescribeDBClusters](~~170879~~) operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The reason for the modification.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID of the cluster. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.</p>
     */
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
