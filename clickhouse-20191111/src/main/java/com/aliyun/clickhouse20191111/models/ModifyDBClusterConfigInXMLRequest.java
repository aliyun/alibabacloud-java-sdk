// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLRequest extends TeaModel {
    /**
     * <p>The configuration parameters to modify. Call the <a href="https://help.aliyun.com/document_detail/452210.html">DescribeDBClusterConfigInXML</a> operation to query the current configuration parameters. Then, modify the returned parameters.</p>
     * <blockquote>
     * <p>When you modify a parameter, you must include all other configuration parameters in the request. If a parameter is not included, it retains its initial value or the modification fails.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0"?><p> <yandex>  <logger>    <level>debug</level>    <size>1000M</size>  </logger>  <listen_backlog>64</listen_backlog>  <max_connections>4096</max_connections>  <keep_alive_timeout>300</keep_alive_timeout>  <max_concurrent_queries>100</max_concurrent_queries>  <max_server_memory_usage>0</max_server_memory_usage>  <max_thread_pool_size>10000</max_thread_pool_size>  <max_server_memory_usage_to_ram_ratio>0.9</max_server_memory_usage_to_ram_ratio>  <total_memory_profiler_step>4194304</total_memory_profiler_step>  <total_memory_tracker_sample_probability>0</total_memory_tracker_sample_probability>  <query_log>    <database>system</database>    <table>query_log</table>    <engine>ENGINE = MergeTree PARTITION BY event_date ORDER BY event_time TTL event_time + INTERVAL 15 DAY</engine>    <flush_interval_milliseconds>7500</flush_interval_milliseconds>  </query_log>  <query_thread_log>    <database>system</database>    <table>query_thread_log</table>    <engine>ENGINE = MergeTree PARTITION BY event_date ORDER BY event_time TTL event_time + INTERVAL 15 DAY</engine>    <flush_interval_milliseconds>7500</flush_interval_milliseconds>  </query_thread_log>  <max_table_size_to_drop>0</max_table_size_to_drop>  <max_partition_size_to_drop>0</max_partition_size_to_drop>  <merge_tree>    <max_delay_to_insert>256</max_delay_to_insert>    <max_suspicious_broken_parts>100</max_suspicious_broken_parts>    <zookeeper_session_expiration_check_period>1</zookeeper_session_expiration_check_period>    <max_part_loading_threads>16</max_part_loading_threads>  </merge_tree>  <mark_cache_size>6871947673</mark_cache_size>  <uncompressed_cache_size>3435973836</uncompressed_cache_size></yandex></p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID. Call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a region.</p>
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
     * <p>The region ID. Call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query available region IDs.</p>
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
