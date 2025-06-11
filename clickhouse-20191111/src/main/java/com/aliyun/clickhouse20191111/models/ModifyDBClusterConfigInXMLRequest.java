// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLRequest extends TeaModel {
    /**
     * <p>The configuration parameters whose settings you want to modify. You can call the <a href="https://help.aliyun.com/document_detail/452210.html">DescribeDBClusterConfigInXML</a> operation to query configuration parameters, and modify the settings of the returned configuration parameters.</p>
     * <blockquote>
     * <p>You must specify all configuration parameters even when you want to modify the setting of a single parameter. If a configuration parameter is not specified, the original value of this parameter is retained or the modification fails.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0"?>
     * <yandex>
     *     <keep_alive_timeout>400</keep_alive_timeout>
     *     <listen_backlog>4096</listen_backlog>
     *     <logger>
     *         <level>debug</level>
     *         <size>1000M</size>
     *     </logger>
     *     <mark_cache_size>5368709120</mark_cache_size>
     *     <max_concurrent_queries>201</max_concurrent_queries>
     *     <max_connections>4096</max_connections>
     *     <max_partition_size_to_drop>0</max_partition_size_to_drop>
     *     <max_table_size_to_drop>0</max_table_size_to_drop>
     *     <merge_tree>
     *         <max_delay_to_insert>256</max_delay_to_insert>
     *         <max_part_loading_threads>auto</max_part_loading_threads>
     *         <max_suspicious_broken_parts>100</max_suspicious_broken_parts>
     *         <zookeeper_session_expiration_check_period>1</zookeeper_session_expiration_check_period>
     *     </merge_tree>
     *     <uncompressed_cache_size>1717986918</uncompressed_cache_size>
     * </yandex>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all the clusters that are deployed in a specified region, including the cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp108z124a8o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The reason for the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
