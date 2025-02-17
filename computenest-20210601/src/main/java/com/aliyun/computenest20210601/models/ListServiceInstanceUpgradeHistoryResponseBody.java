// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceUpgradeHistoryResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI41</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE3EDF4E-B3B1-19B6-BD01-30D4D00F6E5D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The upgrade history.</p>
     */
    @NameInMap("UpgradeHistory")
    public java.util.List<ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory> upgradeHistory;

    public static ListServiceInstanceUpgradeHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceUpgradeHistoryResponseBody self = new ListServiceInstanceUpgradeHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setUpgradeHistory(java.util.List<ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory> upgradeHistory) {
        this.upgradeHistory = upgradeHistory;
        return this;
    }
    public java.util.List<ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory> getUpgradeHistory() {
        return this.upgradeHistory;
    }

    public static class ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory extends TeaModel {
        /**
         * <p>The time when the update ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T09:09:51Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The version before the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FromVersion")
        public String fromVersion;

        /**
         * <p>The upgrade result.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;PreUpgradeExecutionId\&quot;:\&quot;exec-123\&quot;}</p>
         */
        @NameInMap("Results")
        public String results;

        /**
         * <p>The time when the update started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T08:09:51Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the update. Valid values:</p>
         * <ul>
         * <li>upgrading: The service instance is being upgraded.</li>
         * <li>UpgradeSuccessful: The service instance is upgraded.</li>
         * <li>UpgradeFailed: The service instance failed to be upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpgradeFailed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version after the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ToVersion")
        public String toVersion;

        /**
         * <p>The update type.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the upgrade record.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-123</p>
         */
        @NameInMap("UpgradeHistoryId")
        public String upgradeHistoryId;

        public static ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory self = new ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setFromVersion(String fromVersion) {
            this.fromVersion = fromVersion;
            return this;
        }
        public String getFromVersion() {
            return this.fromVersion;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setResults(String results) {
            this.results = results;
            return this;
        }
        public String getResults() {
            return this.results;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setToVersion(String toVersion) {
            this.toVersion = toVersion;
            return this;
        }
        public String getToVersion() {
            return this.toVersion;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory setUpgradeHistoryId(String upgradeHistoryId) {
            this.upgradeHistoryId = upgradeHistoryId;
            return this;
        }
        public String getUpgradeHistoryId() {
            return this.upgradeHistoryId;
        }

    }

}
