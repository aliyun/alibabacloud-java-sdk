// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceResponseBody extends TeaModel {
    /**
     * <p>The values of the configuration parameters after the values of the configuration parameters are changed.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;<?xml version="1.0"?>
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
     * </yandex>&quot;</p>
     */
    @NameInMap("NewConfigXML")
    public String newConfigXML;

    /**
     * <p>The values of the configuration parameters before the values of the configuration parameters are changed.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;<?xml version="1.0"?>
     * <yandex>
     *     <keep_alive_timeout>300</keep_alive_timeout>
     *     <listen_backlog>4096</listen_backlog>
     *     <logger>
     *         <level>debug</level>
     *         <size>1000M</size>
     *     </logger>
     *     <mark_cache_size>5368709120</mark_cache_size>
     *     <max_concurrent_queries>150</max_concurrent_queries>
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
     * </yandex>&quot;</p>
     */
    @NameInMap("OldConfigXML")
    public String oldConfigXML;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigVersionDifferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigVersionDifferenceResponseBody self = new DescribeConfigVersionDifferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigVersionDifferenceResponseBody setNewConfigXML(String newConfigXML) {
        this.newConfigXML = newConfigXML;
        return this;
    }
    public String getNewConfigXML() {
        return this.newConfigXML;
    }

    public DescribeConfigVersionDifferenceResponseBody setOldConfigXML(String oldConfigXML) {
        this.oldConfigXML = oldConfigXML;
        return this;
    }
    public String getOldConfigXML() {
        return this.oldConfigXML;
    }

    public DescribeConfigVersionDifferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
