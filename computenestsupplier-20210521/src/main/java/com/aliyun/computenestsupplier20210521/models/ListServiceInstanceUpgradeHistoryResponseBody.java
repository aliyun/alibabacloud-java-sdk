// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceUpgradeHistoryResponseBody extends TeaModel {
    /**
     * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to use for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86CAC31E-3527-562C-869F-347E931C9B25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of upgrade history</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>List of upgrade histories.</p>
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
         * <p>End time of the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T09:09:51Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Version before the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FromVersion")
        public String fromVersion;

        /**
         * <p>Upgrade result.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;PreUpgradeExecutionId\&quot;:\&quot;exec-123\&quot;}</p>
         */
        @NameInMap("Results")
        public String results;

        /**
         * <p>Start time of the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T08:09:51Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Upgrade status. Possible values:</p>
         * <ul>
         * <li><p>upgrading: In progress.</p>
         * </li>
         * <li><p>UpgradeSuccessful: Upgrade successful.</p>
         * </li>
         * <li><p>UpgradeFailed: Upgrade failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpgradeFailed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Version after the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ToVersion")
        public String toVersion;

        /**
         * <p>Upgrade type.</p>
         * <ul>
         * <li>Upgrade</li>
         * <li>Rollback</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Upgrade history ID.</p>
         * 
         * <strong>example:</strong>
         * <p>uh-1b21d65f75e94fa09745</p>
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
