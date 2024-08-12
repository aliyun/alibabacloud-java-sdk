// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7655F5F9-1313-5ABA-8516-F6EB79605A5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about data synchronization between the ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("SynDbs")
    public java.util.List<DescribeSynDbsResponseBodySynDbs> synDbs;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
         * <ul>
         * <li>When the value <strong>true</strong> is returned for the <strong>SynStatus</strong> parameter, the system does not return the ErrorMsg parameter.</li>
         * <li>When the value <strong>false</strong> is returned for the <strong>SynStatus</strong> parameter, the system returns for the ErrorMsg parameter the cause why the data synchronization failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse exception, code: 49, host: 100.100.118.132, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz9d11qg1j0h4****</p>
         */
        @NameInMap("RdsId")
        public String rdsId;

        /**
         * <p>The database account that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RdsUserName")
        public String rdsUserName;

        /**
         * <p>The internal endpoint of the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp16t9h3999xb0a711****.mysql.rds.aliyuncs.com:3306</p>
         */
        @NameInMap("RdsVpcUrl")
        public String rdsVpcUrl;

        /**
         * <p>The name of the database in the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("SynDb")
        public String synDb;

        /**
         * <p>Indicates whether the data synchronization succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The data synchronization succeeded.</li>
         * <li><strong>false</strong>: The data synchronization failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
