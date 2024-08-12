// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartRequest extends TeaModel {
    /**
     * <p>The configuration parameters whose settings are modified.</p>
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
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1tm8zf130ew****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static CheckModifyConfigNeedRestartRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartRequest self = new CheckModifyConfigNeedRestartRequest();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CheckModifyConfigNeedRestartRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
