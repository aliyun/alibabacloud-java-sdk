// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListResultExportJobHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-7xv5ty5m9o4v****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-05-25T06:54:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The order in which to sort the SQL statements by field, which contains the <code>Field</code> and <code>Type</code> fields. Specify the order in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;CreateTimee&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>.</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field that is used to sort the SQL statements. Valid values:</p>
     * <ul>
     * <li><code>CreateTime</code>: the time when the result set export job was created.</li>
     * <li><code>Status</code>: the execution status.</li>
     * <li><code>DatabaseUser</code>: the name of the database account.</li>
     * <li><code>TimeCost</code>: the execution duration.</li>
     * <li><code>ResourceGroup</code>: the name of the resource group.</li>
     * <li><code>ExportRows</code>: the number of exported rows.</li>
     * <li><code>Progress</code>: the export progress.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
     * <ul>
     * <li><code>Desc</code>: descending order.</li>
     * <li><code>Asc</code>: ascending order.</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("Order")
    public ListResultExportJobHistoryRequestOrder order;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource group that runs the result set export jobs. You can use this parameter to query the execution records of export jobs that are run in a specific resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The execution status of result set export jobs. You can use this parameter to query the execution records of export jobs that are in a specific state.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListResultExportJobHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResultExportJobHistoryRequest self = new ListResultExportJobHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListResultExportJobHistoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListResultExportJobHistoryRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public ListResultExportJobHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListResultExportJobHistoryRequest setOrder(ListResultExportJobHistoryRequestOrder order) {
        this.order = order;
        return this;
    }
    public ListResultExportJobHistoryRequestOrder getOrder() {
        return this.order;
    }

    public ListResultExportJobHistoryRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListResultExportJobHistoryRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListResultExportJobHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResultExportJobHistoryRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public ListResultExportJobHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListResultExportJobHistoryRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static class ListResultExportJobHistoryRequestOrder extends TeaModel {
        /**
         * <p>The field that is used to sort the SQL statements. Valid values:</p>
         * <ul>
         * <li>CreateTime</li>
         * <li>DatabaseUser</li>
         * <li>TimeCost</li>
         * <li>ResourceGroup</li>
         * <li>Status</li>
         * <li>Progress</li>
         * <li>ExportRows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DatabaseUser</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The sorting order. Valid values (case-insensitive):</p>
         * <ul>
         * <li><strong>Desc</strong>: descending order.</li>
         * <li><strong>Asc</strong>: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResultExportJobHistoryRequestOrder build(java.util.Map<String, ?> map) throws Exception {
            ListResultExportJobHistoryRequestOrder self = new ListResultExportJobHistoryRequestOrder();
            return TeaModel.build(map, self);
        }

        public ListResultExportJobHistoryRequestOrder setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListResultExportJobHistoryRequestOrder setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
