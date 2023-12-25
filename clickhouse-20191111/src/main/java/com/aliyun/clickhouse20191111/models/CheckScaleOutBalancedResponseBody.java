// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponseBody extends TeaModel {
    /**
     * <p>The check result. Valid values:</p>
     * <br>
     * <p>*   **400**: The cluster failed the check.</p>
     * <p>*   **200**: The cluster passed the check.</p>
     */
    @NameInMap("CheckCode")
    public String checkCode;

    /**
     * <p>The total number of returned pages.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values:</p>
     * <br>
     * <p>*   **30** (default)</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
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
     */
    @NameInMap("TimeDuration")
    public String timeDuration;

    /**
     * <p>The total number of entries that are returned.</p>
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
         * <p>The cluster. The value is fixed as **default**.</p>
         */
        @NameInMap("Cluster")
        public String cluster;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The error details. Valid values:</p>
         * <br>
         * <p>*   **1**: The unique distributed table is missing.</p>
         * <p>*   **2**: More than one distributed table exists for the local table.</p>
         */
        @NameInMap("Detail")
        public Integer detail;

        /**
         * <p>The name of the local table.</p>
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
