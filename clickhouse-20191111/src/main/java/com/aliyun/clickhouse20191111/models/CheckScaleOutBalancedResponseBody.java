// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponseBody extends TeaModel {
    /**
     * <p>The check result. Valid values:</p>
     * <ul>
     * <li><strong>400</strong>: The cluster failed the check.</li>
     * <li><strong>200</strong>: The cluster passed the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CheckCode")
    public String checkCode;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values:</p>
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
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error information returned for a check failure.</p>
     */
    @NameInMap("TableDetails")
    public CheckScaleOutBalancedResponseBodyTableDetails tableDetails;

    /**
     * <p>The amount of time that is required for the migration and scale-out. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("TimeDuration")
    public String timeDuration;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CheckScaleOutBalancedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckScaleOutBalancedResponseBody self = new CheckScaleOutBalancedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckScaleOutBalancedResponseBody setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public CheckScaleOutBalancedResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CheckScaleOutBalancedResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckScaleOutBalancedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckScaleOutBalancedResponseBody setTableDetails(CheckScaleOutBalancedResponseBodyTableDetails tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public CheckScaleOutBalancedResponseBodyTableDetails getTableDetails() {
        return this.tableDetails;
    }

    public CheckScaleOutBalancedResponseBody setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

    public CheckScaleOutBalancedResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CheckScaleOutBalancedResponseBodyTableDetailsTableDetail extends TeaModel {
        /**
         * <p>The cluster. The value is fixed as <strong>default</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Cluster")
        public String cluster;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The error details. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The unique distributed table is missing.</li>
         * <li><strong>2</strong>: More than one distributed table exists for the local table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Detail")
        public Integer detail;

        /**
         * <p>The name of the local table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static CheckScaleOutBalancedResponseBodyTableDetailsTableDetail build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseBodyTableDetailsTableDetail self = new CheckScaleOutBalancedResponseBodyTableDetailsTableDetail();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setDetail(Integer detail) {
            this.detail = detail;
            return this;
        }
        public Integer getDetail() {
            return this.detail;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class CheckScaleOutBalancedResponseBodyTableDetails extends TeaModel {
        @NameInMap("TableDetail")
        public java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> tableDetail;

        public static CheckScaleOutBalancedResponseBodyTableDetails build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseBodyTableDetails self = new CheckScaleOutBalancedResponseBodyTableDetails();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseBodyTableDetails setTableDetail(java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> tableDetail) {
            this.tableDetail = tableDetail;
            return this;
        }
        public java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> getTableDetail() {
            return this.tableDetail;
        }

    }

}
