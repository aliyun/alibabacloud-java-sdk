// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1hx5n1o8f61****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-11T15:01Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The queried performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD8C3096-8BC6-51DF-A4AB-BACD9DC10435</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-10T23:56Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponseBody setPerformances(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformancesSeries extends TeaModel {
        /**
         * <ul>
         * <li><p>CPU</p>
         * <ul>
         * <li><p><strong>AnalyticDB_CPU_Usage_Percentage</strong>: the CPU utilization.</p>
         * <ul>
         * <li>AnalyticDB_Storage_CPU_Avg_Usage_Percentage: the average CPU utilization across storage nodes.</li>
         * <li>AnalyticDB_Storage_CPU_Max_Usage_Percentage: the maximum CPU utilization across storage nodes.</li>
         * <li>AnalyticDB_Compute_CPU_Max_Usage_Percentage: the average CPU utilization across compute nodes.</li>
         * <li>AnalyticDB_Compute_CPU_Max_Usage_Percentage: the maximum CPU utilization across compute nodes.</li>
         * <li>AnalyticDB_CS_CPU_Avg_Usage_Percentage: the average CPU utilization across access nodes.</li>
         * <li>AnalyticDB_CS_CPU_Max_Usage_Percentage: the maximum CPU utilization across access nodes.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Connections</p>
         * <ul>
         * <li><p><strong>AnalyticDB_Instance_Connection_Count</strong>: the number of connections to the cluster.</p>
         * <ul>
         * <li>AnalyticDB_Instance_Connection_Count: the number of connections to the cluster.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Writes</p>
         * <ul>
         * <li><p><strong>AnalyticDB_TPS</strong>: the write TPS.</p>
         * <ul>
         * <li>tps: the sum of the insert_tps, update_tps, delete_tps, and load_tps values.</li>
         * <li>insert_tps: the number of successful INSERT INTO VALUES operations per second.</li>
         * <li>update_tps: the number of successful UPDATE operations per second.</li>
         * <li>delete_tps: the number of successful DELETE operations per second.</li>
         * <li>load_tps: the number of successful INSERT OVERWRITE operations per second.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_InsertRT</strong>: the write response time.</p>
         * <ul>
         * <li>AnalyticDB_Avg_InsertRT: the average amount of time consumed by writes.</li>
         * <li>AnalyticDB_Max_InsertRT: the maximum amount of time consumed by a single write.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</p>
         * <ul>
         * <li>AnalyticDB_InsertBytes: the amount of written data.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Updates</p>
         * <ul>
         * <li><p><strong>AnalyticDB_UpdateRT</strong>: the update response time.</p>
         * <ul>
         * <li>updateinto_avg_rt: the average amount of time consumed by updates.</li>
         * <li>updateinto_max_rt: the maximum amount of time consumed by a single update.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Deletes</p>
         * <ul>
         * <li><p><strong>AnalyticDB_DeleteRT</strong>: the delete response time.</p>
         * <ul>
         * <li>delete_avg_rt: the average amount of time consumed by deletes.</li>
         * <li>delete_max_rt: the maximum amount of time consumed by a single delete.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Queries</p>
         * <ul>
         * <li><p><strong>AnalyticDB_QPS</strong>: the QPS.</p>
         * <ul>
         * <li>AnalyticDB_QPS: the number of SELECT operations completed per second.</li>
         * <li>AnalyticDB_ETL_QPS: the number of INSERT OVERWRITE operations completed per second.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_QueryRT</strong>: the query response time.</p>
         * <ul>
         * <li>AnalyticDB_Avg_QueryRT: the average amount of time consumed by queries.</li>
         * <li>AnalyticDB_Max_QueryRT: the maximum amount of time consumed by a single query.</li>
         * <li>etl_avg_rt: the average amount of time consumed by extract-transform-load (ETL) operations.</li>
         * <li>etl_max_rt: the maximum amount of time consumed by a single ETL operation.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_QueryWaitTime</strong>: the query wait time.</p>
         * <ul>
         * <li>AnalyticDB_Avg_QueryWaitTime: the average wait time for SELECT and ETL operations.</li>
         * <li>AnalyticDB_Max_QueryWaitTime: the maximum wait time for SELECT and ETL operations.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_QueryFailedRatio: the query failure rate.</p>
         * <ul>
         * <li>query_failed_ratio: the failure rate of SELECT and ETL operations.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Disks</p>
         * <ul>
         * <li><p><strong>AnalyticDB_IO_Throughput</strong>: the disk I/O throughput.</p>
         * <ul>
         * <li>AnalyticDB_Storage_Read_IO_Throughput: the average read throughput across storage nodes.</li>
         * <li>AnalyticDB_Storage_Write_IO_Throughput: the average write throughput across storage nodes.</li>
         * <li>AnalyticDB_Compute_Read_IO_Throughput: the average read throughput across compute nodes.</li>
         * <li>AnalyticDB_Compute_Write_IO_Throughput: the average write throughput across compute nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_Disk_IO_Avg_Usage_Percentage</strong>: the average I/O usage.</p>
         * <ul>
         * <li>AnalyticDB_Disk_IO_Avg_Usage_Percentage: the average I/O usage across storage nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_Disk_IO_Avg_Waiting_Time</strong>: the average I/O wait time.</p>
         * <ul>
         * <li>AnalyticDB_Disk_IO_Avg_Waiting_Time: the average I/O wait time of storage nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</p>
         * <ul>
         * <li>AnalyticDB_Storage_Read_IOPS: the average read IOPS of storage nodes.</li>
         * <li>AnalyticDB_Storage_Write_IOPS: the average write IOPS of storage nodes.</li>
         * <li>AnalyticDB_Compute_Read_IOPS: the average read IOPS of compute nodes.</li>
         * <li>AnalyticDB_Compute_Write_IOPS: the average write IOPS of compute nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_DiskUsage</strong>: the disk storage that is used.</p>
         * <ul>
         * <li>disk_used_ratio: the average disk usage across nodes.</li>
         * <li>worker_max_node_disk_used_ratio: the maximum disk usage across nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_Hot_Data_Usage</strong>: the disk storage that is used by hot data.</p>
         * <ul>
         * <li>AnalyticDB_Hot_Data_Usage: the disk storage that is used by hot data.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_Cold_Data_Usage</strong>: the disk storage that is used by cold data.</p>
         * <ul>
         * <li>AnalyticDB_Cold_Data_Usage: the disk storage that is used by cold data.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_DiskUsedRatio: the node disk usage.</p>
         * <ul>
         * <li>disk_used_ratio: the average disk usage across nodes.</li>
         * <li>worker_max_node_disk_used_ratio: the maximum disk usage across nodes.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_DiskUsedSize: the total data size of the cluster.</p>
         * <ul>
         * <li>user_used_disk_max: the maximum hot data size across nodes.</li>
         * <li>user_used_disk_avg: the average hot data size across nodes.</li>
         * <li>hot_disk_used: the hot data size.</li>
         * <li>cold_disk_used: the cold data size.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Other</p>
         * <ul>
         * <li><p><strong>AnalyticDB_BuildTaskCount</strong>: the number of BUILD jobs.</p>
         * <ul>
         * <li>max_build_task_count: the maximum number of running BUILD jobs across nodes.</li>
         * <li>avg_build_task_count: the average number of running BUILD jobs across nodes.</li>
         * </ul>
         * </li>
         * <li><p><strong>AnalyticDB_ComputeMemoryUsedRatio</strong>: the compute memory usage.</p>
         * <ul>
         * <li>max_worker_compute_memory_used_ratio: the maximum compute memory usage across storage nodes.</li>
         * <li>avg_worker_compute_memory_used_ratio: the average compute memory usage across storage nodes.</li>
         * <li>max_executor_compute_memory_used_ratio: the maximum compute memory usage across compute nodes.</li>
         * <li>avg_executor_compute_memory_used_ratio: the average compute memory usage across compute nodes.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_UnavailableNodeCount: the number of unavailable nodes.</p>
         * <ul>
         * <li>worker_unavailable_node_count: the number of unavailable storage nodes.</li>
         * <li>executor_unavailable_node_count: the number of unavailable compute nodes.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>WLM</p>
         * <ul>
         * <li><p>AnalyticDB_WLM_ResubmitQueries_Count: the number of resubmitted WLM queries.</p>
         * <ul>
         * <li>AnalyticDB_WLM_ResubmitQueries_Count: the number of resubmitted WLM queries.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_WLM_SQA_AvgRt_MS: the average amount of time consumed by accelerated short WLM queries.</p>
         * <ul>
         * <li>AnalyticDB_WLM_SQA_AvgRt_MS: the average amount of time consumed by accelerated short WLM queries.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_WLM_SQA_Queries_Count: the number of accelerated short WLM queries.</p>
         * <ul>
         * <li>AnalyticDB_WLM_SQA_Queries_Count: the number of accelerated short WLM queries.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_WLM_TotalQueries_Count: the total number of WLM queries.</p>
         * <ul>
         * <li>AnalyticDB_WLM_TotalQueries_Count: the total number of WLM queries.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>APS</p>
         * <ul>
         * <li><p>AnalyticDB_APS_BPS: the bytes per second (BPS) of APS provided by the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>APS_Read_BPS: the read BPS of APS.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_APS_CPU: the CPU utilization of APS provided by the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>APS_CPU_Avg_Usage_Percentage: the average CPU utilization of APS.</li>
         * <li>APS_CPU_Max_Usage_Percentage: the maximum CPU utilization of APS.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_APS_Memory: the memory usage of APS provided by the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>APS_Memory_Avg_Usage_Percentage: the average memory usage of APS.</li>
         * <li>APS_Memory_Max_Usage_Percentage: the maximum memory usage of APS.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_APS_RPS: the number of records per second of APS provided by the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>APS_Read_RPS: the number of read records per second of APS.</li>
         * </ul>
         * </li>
         * <li><p>AnalyticDB_APS_RT: the response time of APS provided by the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>APS_Read_Avg_RT: the average response time of APS.</li>
         * <li>APS_Read_Max_RT: the maximum response time of APS.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <hr>
         * <pre><code>*   *
         * *   *
         * *   *
         * *   *
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_Storage_CPU_Avg_Usage_Percentage</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tags that are added to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{instance_name: &quot;am-***&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The values of the performance metric at different points in time.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeDBClusterPerformanceResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformancesSeries self = new DescribeDBClusterPerformanceResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The name of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU_Usage_Percentage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The queried performance metric data.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformances self = new DescribeDBClusterPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setSeries(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
