// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CheckCode")
    @Validation(required = true)
    public String checkCode;

    @NameInMap("TimeDuration")
    @Validation(required = true)
    public String timeDuration;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TableDetails")
    @Validation(required = true)
    public CheckScaleOutBalancedResponseTableDetails tableDetails;

    public static CheckScaleOutBalancedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckScaleOutBalancedResponse self = new CheckScaleOutBalancedResponse();
        return TeaModel.build(map, self);
    }

    public CheckScaleOutBalancedResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CheckScaleOutBalancedResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public CheckScaleOutBalancedResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckScaleOutBalancedResponse setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public CheckScaleOutBalancedResponse setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

    public CheckScaleOutBalancedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckScaleOutBalancedResponse setTableDetails(CheckScaleOutBalancedResponseTableDetails tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public CheckScaleOutBalancedResponseTableDetails getTableDetails() {
        return this.tableDetails;
    }

    public static class CheckScaleOutBalancedResponseTableDetailsTableDetail extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Database")
        @Validation(required = true)
        public String database;

        @NameInMap("Cluster")
        @Validation(required = true)
        public String cluster;

        @NameInMap("Detail")
        @Validation(required = true)
        public Integer detail;

        public static CheckScaleOutBalancedResponseTableDetailsTableDetail build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseTableDetailsTableDetail self = new CheckScaleOutBalancedResponseTableDetailsTableDetail();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseTableDetailsTableDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CheckScaleOutBalancedResponseTableDetailsTableDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CheckScaleOutBalancedResponseTableDetailsTableDetail setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CheckScaleOutBalancedResponseTableDetailsTableDetail setDetail(Integer detail) {
            this.detail = detail;
            return this;
        }
        public Integer getDetail() {
            return this.detail;
        }

    }

    public static class CheckScaleOutBalancedResponseTableDetails extends TeaModel {
        @NameInMap("TableDetail")
        @Validation(required = true)
        public java.util.List<CheckScaleOutBalancedResponseTableDetailsTableDetail> tableDetail;

        public static CheckScaleOutBalancedResponseTableDetails build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseTableDetails self = new CheckScaleOutBalancedResponseTableDetails();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseTableDetails setTableDetail(java.util.List<CheckScaleOutBalancedResponseTableDetailsTableDetail> tableDetail) {
            this.tableDetail = tableDetail;
            return this;
        }
        public java.util.List<CheckScaleOutBalancedResponseTableDetailsTableDetail> getTableDetail() {
            return this.tableDetail;
        }

    }

}
