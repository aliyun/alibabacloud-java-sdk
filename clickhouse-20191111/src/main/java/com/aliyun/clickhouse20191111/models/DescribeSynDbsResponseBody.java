// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about data synchronization between the ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("SynDbs")
    public java.util.List<DescribeSynDbsResponseBodySynDbs> synDbs;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSynDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbsResponseBody self = new DescribeSynDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSynDbsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSynDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynDbsResponseBody setSynDbs(java.util.List<DescribeSynDbsResponseBodySynDbs> synDbs) {
        this.synDbs = synDbs;
        return this;
    }
    public java.util.List<DescribeSynDbsResponseBodySynDbs> getSynDbs() {
        return this.synDbs;
    }

    public DescribeSynDbsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSynDbsResponseBodySynDbs extends TeaModel {
        /**
         * <p>*   When the value **true** is returned for the **SynStatus** parameter, the system does not return the ErrorMsg parameter.</p>
         * <p>*   When the value **false** is returned for the **SynStatus** parameter, the system returns for the ErrorMsg parameter the cause why the data synchronization failed.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("RdsId")
        public String rdsId;

        /**
         * <p>The account that is used to log on to the ApsaraDB RDS for MySQL database.</p>
         */
        @NameInMap("RdsUserName")
        public String rdsUserName;

        /**
         * <p>The internal endpoint of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("RdsVpcUrl")
        public String rdsVpcUrl;

        /**
         * <p>The name of the database in the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("SynDb")
        public String synDb;

        /**
         * <p>Indicates whether the data synchronization succeeded. Valid values:</p>
         * <br>
         * <p>*   **true**: The data synchronization succeeded.</p>
         * <p>*   **false**: The data synchronization failed.</p>
         */
        @NameInMap("SynStatus")
        public Boolean synStatus;

        public static DescribeSynDbsResponseBodySynDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynDbsResponseBodySynDbs self = new DescribeSynDbsResponseBodySynDbs();
            return TeaModel.build(map, self);
        }

        public DescribeSynDbsResponseBodySynDbs setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsId(String rdsId) {
            this.rdsId = rdsId;
            return this;
        }
        public String getRdsId() {
            return this.rdsId;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsUserName(String rdsUserName) {
            this.rdsUserName = rdsUserName;
            return this;
        }
        public String getRdsUserName() {
            return this.rdsUserName;
        }

        public DescribeSynDbsResponseBodySynDbs setRdsVpcUrl(String rdsVpcUrl) {
            this.rdsVpcUrl = rdsVpcUrl;
            return this;
        }
        public String getRdsVpcUrl() {
            return this.rdsVpcUrl;
        }

        public DescribeSynDbsResponseBodySynDbs setSynDb(String synDb) {
            this.synDb = synDb;
            return this;
        }
        public String getSynDb() {
            return this.synDb;
        }

        public DescribeSynDbsResponseBodySynDbs setSynStatus(Boolean synStatus) {
            this.synStatus = synStatus;
            return this;
        }
        public Boolean getSynStatus() {
            return this.synStatus;
        }

    }

}
