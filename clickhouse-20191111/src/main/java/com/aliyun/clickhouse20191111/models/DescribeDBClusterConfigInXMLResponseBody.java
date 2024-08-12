// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigInXMLResponseBody extends TeaModel {
    /**
     * <p>The values of the configuration parameters.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0"?>
     * <yandex>
     *     <keep_alive_timeout>300</keep_alive_timeout>
     *     <listen_backlog>64</listen_backlog>
     *     <logger>
     *         <level>debug</level>
     *         <size>1000M</size>
     *     </logger>
     *     <mark_cache_size>6871947673</mark_cache_size>
     *     <max_concurrent_queries>100</max_concurrent_queries>
     *     <max_connections>4096</max_connections>
     *     <max_partition_size_to_drop>0</max_partition_size_to_drop>
     *     <max_server_memory_usage>0</max_server_memory_usage>
     * <max_server_memory_usage_to_ram_ratio>0.9</max_server_memory_usage_to_ram_ratio>
     *     <max_table_size_to_drop>0</max_table_size_to_drop>
     *     <max_thread_pool_size>10000</max_thread_pool_size>
     *     <merge_tree>
     *         <max_delay_to_insert>256</max_delay_to_insert>
     *         <max_part_loading_threads>16</max_part_loading_threads>      <zookeeper_session_expiration_check_period>1</zookeeper_session_expiration_check_period>
     *     </merge_tree>
     *     <total_memory_profiler_step>4194304</total_memory_profiler_step>
     * <total_memory_tracker_sample_probability>0</total_memory_tracker_sample_probability>
     *     <uncompressed_cache_size>3435973836</uncompressed_cache_size>
     * </yandex>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE042911-2B00-134C-9F42-816871BBAFB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigInXMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigInXMLResponseBody self = new DescribeDBClusterConfigInXMLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigInXMLResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDBClusterConfigInXMLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
