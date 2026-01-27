// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskRequest extends TeaModel {
    /**
     * <p>The ID of the backup set generated when you create a download task. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>216****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <strong>example:</strong>
     * <p>dds-example</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The ID of the Database Backup (DBS) data source. Specify the parameter in the format of <em>ds-${Instance ID}_${regionId}</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-rm-2ze8g2am97624****_cn-hangzhou</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <p>The end of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1661941556000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1imnmcjxdz7****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The column based on which the entries are sorted. By default, the entries are sorted by the time when the download task was created. Set the value to <strong>gmt_create</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The order in which you want to sort the entries. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: the ascending order.</li>
     * <li><strong>desc</strong>: the descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderDirect")
    public String orderDirect;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query the region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The beginning of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1661941554000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The state of the download task. Valid values:</p>
     * <ul>
     * <li><strong>Initializing</strong>: The download task is being initialized.</li>
     * <li><strong>queueing</strong>: The download task is queuing.</li>
     * <li><strong>running</strong>: The download task is running.</li>
     * <li><strong>failed</strong>: The download task fails.</li>
     * <li><strong>finished</strong>: The download task is complete.</li>
     * <li><strong>expired</strong>: The download task expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>queueing</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The type of the download task. Valid values:</p>
     * <ul>
     * <li><strong>full</strong>: downloads a full backup set.</li>
     * <li><strong>pitr</strong>: downloads a backup set at a specific point in time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskRequest self = new DescribeDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeDownloadTaskRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeDownloadTaskRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDownloadTaskRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public DescribeDownloadTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDownloadTaskRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeDownloadTaskRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public DescribeDownloadTaskRequest setOrderDirect(String orderDirect) {
        this.orderDirect = orderDirect;
        return this;
    }
    public String getOrderDirect() {
        return this.orderDirect;
    }

    public DescribeDownloadTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDownloadTaskRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeDownloadTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDownloadTaskRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeDownloadTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
