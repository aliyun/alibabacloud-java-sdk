// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceUpgradeHistoryResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UpgradeHistory")
    public java.util.List<ListServiceInstanceUpgradeHistoryResponseBodyUpgradeHistory> upgradeHistory;

    public static ListServiceInstanceUpgradeHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceUpgradeHistoryResponseBody self = new ListServiceInstanceUpgradeHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceUpgradeHistoryResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FromVersion")
        public String fromVersion;

        @NameInMap("Results")
        public String results;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ToVersion")
        public String toVersion;

        @NameInMap("Type")
        public String type;

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
