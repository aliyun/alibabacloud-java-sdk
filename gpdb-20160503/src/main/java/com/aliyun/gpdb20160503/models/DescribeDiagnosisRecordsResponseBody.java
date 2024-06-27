// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    /**
     * <p>The threshold that determines whether the SQL statement must be truncated. The value is the number of characters.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDiagnosisRecordsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnosisRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisRecordsResponseBody self = new DescribeDiagnosisRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisRecordsResponseBody setItems(java.util.List<DescribeDiagnosisRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDiagnosisRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDiagnosisRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiagnosisRecordsResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The execution duration of the query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The ID of the query. It is a unique identifier of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2022042612465401000000012903151998970</p>
         */
        @NameInMap("QueryID")
        public String queryID;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t1,t2 WHERE t1.id=t2.id;</p>
         */
        @NameInMap("SQLStmt")
        public String SQLStmt;

        /**
         * <p>Indicates whether the SQL statement needs to be truncated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The SQL statement needs to be truncated.</li>
         * <li><strong>false</strong>: The SQL statement does not need to be truncated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SQLTruncated")
        public Boolean SQLTruncated;

        /**
         * <p>The threshold used to determine whether an SQL statement must be truncated. The value is the number of characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("SQLTruncatedThreshold")
        public Integer SQLTruncatedThreshold;

        /**
         * <p>The ID of the session that contains the query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SessionID")
        public String sessionID;

        /**
         * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1651877940000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The execution state of the query. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: The query is being executed.</li>
         * <li><strong>finished</strong>: The query is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpguser</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeDiagnosisRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisRecordsResponseBodyItems self = new DescribeDiagnosisRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisRecordsResponseBodyItems setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setQueryID(String queryID) {
            this.queryID = queryID;
            return this;
        }
        public String getQueryID() {
            return this.queryID;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setSQLStmt(String SQLStmt) {
            this.SQLStmt = SQLStmt;
            return this;
        }
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setSQLTruncated(Boolean SQLTruncated) {
            this.SQLTruncated = SQLTruncated;
            return this;
        }
        public Boolean getSQLTruncated() {
            return this.SQLTruncated;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setSQLTruncatedThreshold(Integer SQLTruncatedThreshold) {
            this.SQLTruncatedThreshold = SQLTruncatedThreshold;
            return this;
        }
        public Integer getSQLTruncatedThreshold() {
            return this.SQLTruncatedThreshold;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setSessionID(String sessionID) {
            this.sessionID = sessionID;
            return this;
        }
        public String getSessionID() {
            return this.sessionID;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiagnosisRecordsResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
